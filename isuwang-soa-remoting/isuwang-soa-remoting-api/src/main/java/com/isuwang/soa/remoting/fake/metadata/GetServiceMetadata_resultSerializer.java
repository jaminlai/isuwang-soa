package com.isuwang.soa.remoting.fake.metadata;

import com.isuwang.soa.core.SoaBaseCode;
import com.isuwang.soa.core.SoaException;
import com.isuwang.soa.core.TBeanSerializer;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.*;

/**
 * Created by tangliu on 2016/3/3.
 */
public class GetServiceMetadata_resultSerializer implements TBeanSerializer<getServiceMetadata_result> {
    @Override
    public void read(getServiceMetadata_result bean, TProtocol iprot) throws TException {

        TField schemeField;
        iprot.readStructBegin();

        while (true) {
            schemeField = iprot.readFieldBegin();
            if (schemeField.type == TType.STOP) {
                break;
            }

            switch (schemeField.id) {
                case 0:  //SUCCESS
                    if (schemeField.type == TType.STRING) {
                        bean.setSuccess(iprot.readString());
                    } else {
                        TProtocolUtil.skip(iprot, schemeField.type);
                    }
                    break;
                default:
                    TProtocolUtil.skip(iprot, schemeField.type);
            }
            iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        validate(bean);
    }

    @Override
    public void write(getServiceMetadata_result bean, TProtocol oprot) throws TException {

        validate(bean);
        oprot.writeStructBegin(new TStruct("getServiceMetadata_result"));

        oprot.writeFieldBegin(new TField("success", TType.STRING, (short) 0));
        oprot.writeString(bean.getSuccess());
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
        oprot.writeStructEnd();
    }

    public void validate(getServiceMetadata_result bean) throws TException {

        if (bean.getSuccess() == null)
            throw new SoaException(SoaBaseCode.NotNull, "success字段不允许为空");
    }

    @Override
    public String toString(getServiceMetadata_result bean) {
        return bean == null ? "null" : bean.toString();
    }
}
