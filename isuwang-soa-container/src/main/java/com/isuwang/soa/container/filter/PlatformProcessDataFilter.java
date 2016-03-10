package com.isuwang.soa.container.filter;

import com.isuwang.soa.container.util.PlatformProcessDataFactory;
import com.isuwang.soa.core.Context;
import com.isuwang.soa.core.SoaHeader;
import com.isuwang.soa.core.filter.FilterChain;
import com.isuwang.soa.core.filter.container.ContainerFilterChain;
import com.isuwang.soa.monitor.api.MonitorServiceClient;
import com.isuwang.soa.monitor.api.domain.PlatformProcessData;
import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by tangliu on 2016/3/9.
 */
public class PlatformProcessDataFilter implements StatusFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(PlatformProcessDataFilter.class);

    private static final long period = 1 * 60 * 1000L;// 1分钟间隔

    private final Timer timer = new Timer("PlatformProcessDataFilter-Timer");

    @Override
    public void init() {
        final Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.add(Calendar.MILLISECOND, (int) (period / (60 * 1000)));

        timer.schedule(new MyTimerTask(), calendar.getTime(), period);
    }

    @Override
    public void doFilter(FilterChain chain) throws TException {
        final SoaHeader soaHeader = Context.Factory.getCurrentInstance().getHeader();
        final PlatformProcessData processData = PlatformProcessDataFactory.getCurrentInstance();

        try {
            chain.doFilter();
        } finally {
            PlatformProcessDataFactory.update(soaHeader, cacheProcessData -> {
                if (cacheProcessData.getIMinTime() == 0 || processData.getIMinTime() < cacheProcessData.getIMinTime())
                    cacheProcessData.setIMinTime(processData.getIMinTime());
                if (cacheProcessData.getIMaxTime() == 0 || processData.getIMaxTime() > cacheProcessData.getIMaxTime())
                    cacheProcessData.setIMaxTime(processData.getIMaxTime());

                final Long totalTime = (Long) chain.getAttribute(ContainerFilterChain.ATTR_KEY_I_PROCESSTIME);
                cacheProcessData.setITotalTime(cacheProcessData.getITotalTime() + totalTime);
            });
        }
    }

    @Override
    public void destory() {
        timer.cancel();

        PlatformProcessDataFactory.clearDataMap();
    }

    private class MyTimerTask extends TimerTask {
        @Override
        public void run() {
            try {
                final long timeMillis = System.currentTimeMillis() / 1000 * 1000;

                final List<PlatformProcessData> dataList = new ArrayList<>();

                Map<String, PlatformProcessData> dataMap = PlatformProcessDataFactory.getDataMap();

                synchronized (dataMap) {
                    final Set<String> keySet = dataMap.keySet();

                    dataList.addAll(keySet.stream().map(key -> dataMap.get(key)).collect(Collectors.toList()));

                    dataMap.clear();
                }

                for (PlatformProcessData data : dataList) {
                    data.setPeriod((int) (period / 60 / 1000));
                    data.setAnalysisTime(timeMillis);
                    data.setIAverageTime(data.getITotalTime() / data.getTotalCalls());
                    data.setPAverageTime(data.getPTotalTime() / data.getTotalCalls());
                }

                new MonitorServiceClient().uploadPlatformProcessData(dataList);
            } catch (Exception e) {
                LOGGER.error(e.getMessage(), e);
            }
        }
    }
}
