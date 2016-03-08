package com.isuwang.soa.monitor.api;

import com.isuwang.soa.core.*;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MonitorServiceCodec {
    public static class QPSStatSerializer implements TBeanSerializer<com.isuwang.soa.monitor.api.domain.QPSStat> {

        @Override
        public void read(com.isuwang.soa.monitor.api.domain.QPSStat bean, TProtocol iprot) throws TException {

            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }

                switch (schemeField.id) {

                    case 1:
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            bean.setPeriod(iprot.readI32());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 2:
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            bean.setCallCount(iprot.readI32());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;


                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);

                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
        }

        @Override
        public void write(com.isuwang.soa.monitor.api.domain.QPSStat bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("QPSStat"));


            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("period", org.apache.thrift.protocol.TType.I32, (short) 1));
            oprot.writeI32(bean.getPeriod());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("callCount", org.apache.thrift.protocol.TType.I32, (short) 2));
            oprot.writeI32(bean.getCallCount());
            oprot.writeFieldEnd();

            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

        public void validate(com.isuwang.soa.monitor.api.domain.QPSStat bean) throws TException {

            if (bean.getPeriod() == null)
                throw new SoaException(SoaBaseCode.NotNull, "period字段不允许为空");

            if (bean.getCallCount() == null)
                throw new SoaException(SoaBaseCode.NotNull, "callCount字段不允许为空");

        }

        @Override
        public String toString(com.isuwang.soa.monitor.api.domain.QPSStat bean) {
            return bean == null ? "null" : bean.toString();
        }
    }

    public static class PlatformProcessDataSerializer implements TBeanSerializer<com.isuwang.soa.monitor.api.domain.PlatformProcessData> {

        @Override
        public void read(com.isuwang.soa.monitor.api.domain.PlatformProcessData bean, TProtocol iprot) throws TException {

            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }

                switch (schemeField.id) {

                    case 1:
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            bean.setPeriod(iprot.readI32());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 2:
                        if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                            bean.setAnalysisTime(iprot.readI64());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 3:
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            bean.setServiceName(iprot.readString());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 4:
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            bean.setMethodName(iprot.readString());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 5:
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            bean.setVersionName(iprot.readString());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 6:
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            bean.setServerIP(iprot.readString());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 7:
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            bean.setServerPort(iprot.readI32());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 8:
                        if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                            bean.setPMinTime(iprot.readI64());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 9:
                        if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                            bean.setPMaxTime(iprot.readI64());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 10:
                        if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                            bean.setPAverageTime(iprot.readI64());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 11:
                        if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                            bean.setPTotalTime(iprot.readI64());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 12:
                        if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                            bean.setIMinTime(iprot.readI64());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 13:
                        if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                            bean.setIMaxTime(iprot.readI64());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 14:
                        if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                            bean.setIAverageTime(iprot.readI64());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 15:
                        if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
                            bean.setITotalTime(iprot.readI64());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 16:
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            bean.setTotalCalls(iprot.readI32());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 17:
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            bean.setSucceedCalls(iprot.readI32());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 18:
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            bean.setFailCalls(iprot.readI32());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 19:
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            bean.setRequestFlow(iprot.readI32());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;

                    case 20:
                        if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                            bean.setResponseFlow(iprot.readI32());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;


                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);

                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
        }

        @Override
        public void write(com.isuwang.soa.monitor.api.domain.PlatformProcessData bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("PlatformProcessData"));


            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("period", org.apache.thrift.protocol.TType.I32, (short) 1));
            oprot.writeI32(bean.getPeriod());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("analysisTime", org.apache.thrift.protocol.TType.I64, (short) 2));
            oprot.writeI64(bean.getAnalysisTime());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("serviceName", org.apache.thrift.protocol.TType.STRING, (short) 3));
            oprot.writeString(bean.getServiceName());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("methodName", org.apache.thrift.protocol.TType.STRING, (short) 4));
            oprot.writeString(bean.getMethodName());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("versionName", org.apache.thrift.protocol.TType.STRING, (short) 5));
            oprot.writeString(bean.getVersionName());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("serverIP", org.apache.thrift.protocol.TType.STRING, (short) 6));
            oprot.writeString(bean.getServerIP());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("serverPort", org.apache.thrift.protocol.TType.I32, (short) 7));
            oprot.writeI32(bean.getServerPort());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("pMinTime", org.apache.thrift.protocol.TType.I64, (short) 8));
            oprot.writeI64(bean.getPMinTime());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("pMaxTime", org.apache.thrift.protocol.TType.I64, (short) 9));
            oprot.writeI64(bean.getPMaxTime());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("pAverageTime", org.apache.thrift.protocol.TType.I64, (short) 10));
            oprot.writeI64(bean.getPAverageTime());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("pTotalTime", org.apache.thrift.protocol.TType.I64, (short) 11));
            oprot.writeI64(bean.getPTotalTime());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("iMinTime", org.apache.thrift.protocol.TType.I64, (short) 12));
            oprot.writeI64(bean.getIMinTime());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("iMaxTime", org.apache.thrift.protocol.TType.I64, (short) 13));
            oprot.writeI64(bean.getIMaxTime());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("iAverageTime", org.apache.thrift.protocol.TType.I64, (short) 14));
            oprot.writeI64(bean.getIAverageTime());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("iTotalTime", org.apache.thrift.protocol.TType.I64, (short) 15));
            oprot.writeI64(bean.getITotalTime());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("totalCalls", org.apache.thrift.protocol.TType.I32, (short) 16));
            oprot.writeI32(bean.getTotalCalls());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("succeedCalls", org.apache.thrift.protocol.TType.I32, (short) 17));
            oprot.writeI32(bean.getSucceedCalls());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("failCalls", org.apache.thrift.protocol.TType.I32, (short) 18));
            oprot.writeI32(bean.getFailCalls());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("requestFlow", org.apache.thrift.protocol.TType.I32, (short) 19));
            oprot.writeI32(bean.getRequestFlow());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("responseFlow", org.apache.thrift.protocol.TType.I32, (short) 20));
            oprot.writeI32(bean.getResponseFlow());
            oprot.writeFieldEnd();

            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

        public void validate(com.isuwang.soa.monitor.api.domain.PlatformProcessData bean) throws TException {

            if (bean.getPeriod() == null)
                throw new SoaException(SoaBaseCode.NotNull, "period字段不允许为空");

            if (bean.getAnalysisTime() == null)
                throw new SoaException(SoaBaseCode.NotNull, "analysisTime字段不允许为空");

            if (bean.getServiceName() == null)
                throw new SoaException(SoaBaseCode.NotNull, "serviceName字段不允许为空");

            if (bean.getMethodName() == null)
                throw new SoaException(SoaBaseCode.NotNull, "methodName字段不允许为空");

            if (bean.getVersionName() == null)
                throw new SoaException(SoaBaseCode.NotNull, "versionName字段不允许为空");

            if (bean.getServerIP() == null)
                throw new SoaException(SoaBaseCode.NotNull, "serverIP字段不允许为空");

            if (bean.getServerPort() == null)
                throw new SoaException(SoaBaseCode.NotNull, "serverPort字段不允许为空");

            if (bean.getPMinTime() == null)
                throw new SoaException(SoaBaseCode.NotNull, "pMinTime字段不允许为空");

            if (bean.getPMaxTime() == null)
                throw new SoaException(SoaBaseCode.NotNull, "pMaxTime字段不允许为空");

            if (bean.getPAverageTime() == null)
                throw new SoaException(SoaBaseCode.NotNull, "pAverageTime字段不允许为空");

            if (bean.getPTotalTime() == null)
                throw new SoaException(SoaBaseCode.NotNull, "pTotalTime字段不允许为空");

            if (bean.getIMinTime() == null)
                throw new SoaException(SoaBaseCode.NotNull, "iMinTime字段不允许为空");

            if (bean.getIMaxTime() == null)
                throw new SoaException(SoaBaseCode.NotNull, "iMaxTime字段不允许为空");

            if (bean.getIAverageTime() == null)
                throw new SoaException(SoaBaseCode.NotNull, "iAverageTime字段不允许为空");

            if (bean.getITotalTime() == null)
                throw new SoaException(SoaBaseCode.NotNull, "iTotalTime字段不允许为空");

            if (bean.getTotalCalls() == null)
                throw new SoaException(SoaBaseCode.NotNull, "totalCalls字段不允许为空");

            if (bean.getSucceedCalls() == null)
                throw new SoaException(SoaBaseCode.NotNull, "succeedCalls字段不允许为空");

            if (bean.getFailCalls() == null)
                throw new SoaException(SoaBaseCode.NotNull, "failCalls字段不允许为空");

            if (bean.getRequestFlow() == null)
                throw new SoaException(SoaBaseCode.NotNull, "requestFlow字段不允许为空");

            if (bean.getResponseFlow() == null)
                throw new SoaException(SoaBaseCode.NotNull, "responseFlow字段不允许为空");

        }

        @Override
        public String toString(com.isuwang.soa.monitor.api.domain.PlatformProcessData bean) {
            return bean == null ? "null" : bean.toString();
        }
    }


    public static class uploadQPSStat_args {

        private com.isuwang.soa.monitor.api.domain.QPSStat qpsStat;

        public com.isuwang.soa.monitor.api.domain.QPSStat getQpsStat() {
            return this.qpsStat;
        }

        public void setQpsStat(com.isuwang.soa.monitor.api.domain.QPSStat qpsStat) {
            this.qpsStat = qpsStat;
        }


        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("{");

            stringBuilder.append("\"").append("qpsStat").append("\":").append(this.qpsStat.toString()).append(",");

            if (stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
            stringBuilder.append("}");

            return stringBuilder.toString();
        }

    }


    public static class uploadQPSStat_result {

              /*
              private SoaException soaException;

              public SoaException getSoaException(){
                return soaException;
              }

              public void setSoaException(SoaException soaException){
                this.soaException = soaException;
              }
              */


        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("{");

            stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
            stringBuilder.append("}");

            return stringBuilder.toString();
        }

    }

    public static class UploadQPSStat_argsSerializer implements TBeanSerializer<uploadQPSStat_args> {

        @Override
        public void read(uploadQPSStat_args bean, TProtocol iprot) throws TException {

            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }

                switch (schemeField.id) {

                    case 1:
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {

                            bean.setQpsStat(new com.isuwang.soa.monitor.api.domain.QPSStat());
                            new QPSStatSerializer().read(bean.getQpsStat(), iprot);

                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;


                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);

                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
        }


        @Override
        public void write(uploadQPSStat_args bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("uploadQPSStat_args"));


            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("qpsStat", org.apache.thrift.protocol.TType.STRUCT, (short) 1));
            new QPSStatSerializer().write(bean.getQpsStat(), oprot);
            oprot.writeFieldEnd();

            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }


        public void validate(uploadQPSStat_args bean) throws TException {

            if (bean.getQpsStat() == null)
                throw new SoaException(SoaBaseCode.NotNull, "qpsStat字段不允许为空");

            if (bean.getQpsStat() != null)
                new QPSStatSerializer().validate(bean.getQpsStat());

        }


        @Override
        public String toString(uploadQPSStat_args bean) {
            return bean == null ? "null" : bean.toString();
        }

    }

    public static class UploadQPSStat_resultSerializer implements TBeanSerializer<uploadQPSStat_result> {
        @Override
        public void read(uploadQPSStat_result bean, TProtocol iprot) throws TException {

            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }

                switch (schemeField.id) {
                    case 0:  //SUCCESS
                        if (schemeField.type == org.apache.thrift.protocol.TType.VOID) {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    /*
                    case 1: //ERROR
                        bean.setSoaException(new SoaException());
                        new SoaExceptionSerializer().read(bean.getSoaException(), iprot);
                        break A;
                    */
                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
        }

        @Override
        public void write(uploadQPSStat_result bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("uploadQPSStat_result"));


            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }


        public void validate(uploadQPSStat_result bean) throws TException {

        }


        @Override
        public String toString(uploadQPSStat_result bean) {
            return bean == null ? "null" : bean.toString();
        }
    }

    public static class uploadQPSStat<I extends com.isuwang.soa.monitor.api.service.MonitorService> extends SoaProcessFunction<I, uploadQPSStat_args, uploadQPSStat_result, UploadQPSStat_argsSerializer, UploadQPSStat_resultSerializer> {
        public uploadQPSStat() {
            super("uploadQPSStat", new UploadQPSStat_argsSerializer(), new UploadQPSStat_resultSerializer());
        }

        @Override
        public uploadQPSStat_result getResult(I iface, uploadQPSStat_args args) throws TException {
            uploadQPSStat_result result = new uploadQPSStat_result();

            iface.uploadQPSStat(args.qpsStat);

            return result;
        }

        @Override
        public uploadQPSStat_args getEmptyArgsInstance() {
            return new uploadQPSStat_args();
        }

        @Override
        protected boolean isOneway() {
            return false;
        }
    }

    public static class uploadPlatformProcessData_args {

        private com.isuwang.soa.monitor.api.domain.PlatformProcessData platformProcessData;

        public com.isuwang.soa.monitor.api.domain.PlatformProcessData getPlatformProcessData() {
            return this.platformProcessData;
        }

        public void setPlatformProcessData(com.isuwang.soa.monitor.api.domain.PlatformProcessData platformProcessData) {
            this.platformProcessData = platformProcessData;
        }


        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("{");

            stringBuilder.append("\"").append("platformProcessData").append("\":").append(this.platformProcessData.toString()).append(",");

            if (stringBuilder.lastIndexOf(",") > 0)
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
            stringBuilder.append("}");

            return stringBuilder.toString();
        }

    }


    public static class uploadPlatformProcessData_result {

              /*
              private SoaException soaException;

              public SoaException getSoaException(){
                return soaException;
              }

              public void setSoaException(SoaException soaException){
                this.soaException = soaException;
              }
              */


        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("{");

            stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
            stringBuilder.append("}");

            return stringBuilder.toString();
        }

    }

    public static class UploadPlatformProcessData_argsSerializer implements TBeanSerializer<uploadPlatformProcessData_args> {

        @Override
        public void read(uploadPlatformProcessData_args bean, TProtocol iprot) throws TException {

            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }

                switch (schemeField.id) {

                    case 1:
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {

                            bean.setPlatformProcessData(new com.isuwang.soa.monitor.api.domain.PlatformProcessData());
                            new PlatformProcessDataSerializer().read(bean.getPlatformProcessData(), iprot);

                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;


                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);

                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
        }


        @Override
        public void write(uploadPlatformProcessData_args bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("uploadPlatformProcessData_args"));


            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("platformProcessData", org.apache.thrift.protocol.TType.STRUCT, (short) 1));
            new PlatformProcessDataSerializer().write(bean.getPlatformProcessData(), oprot);
            oprot.writeFieldEnd();

            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }


        public void validate(uploadPlatformProcessData_args bean) throws TException {

            if (bean.getPlatformProcessData() == null)
                throw new SoaException(SoaBaseCode.NotNull, "platformProcessData字段不允许为空");

            if (bean.getPlatformProcessData() != null)
                new PlatformProcessDataSerializer().validate(bean.getPlatformProcessData());

        }


        @Override
        public String toString(uploadPlatformProcessData_args bean) {
            return bean == null ? "null" : bean.toString();
        }

    }

    public static class UploadPlatformProcessData_resultSerializer implements TBeanSerializer<uploadPlatformProcessData_result> {
        @Override
        public void read(uploadPlatformProcessData_result bean, TProtocol iprot) throws TException {

            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }

                switch (schemeField.id) {
                    case 0:  //SUCCESS
                        if (schemeField.type == org.apache.thrift.protocol.TType.VOID) {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    /*
                    case 1: //ERROR
                        bean.setSoaException(new SoaException());
                        new SoaExceptionSerializer().read(bean.getSoaException(), iprot);
                        break A;
                    */
                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
        }

        @Override
        public void write(uploadPlatformProcessData_result bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("uploadPlatformProcessData_result"));


            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }


        public void validate(uploadPlatformProcessData_result bean) throws TException {

        }


        @Override
        public String toString(uploadPlatformProcessData_result bean) {
            return bean == null ? "null" : bean.toString();
        }
    }

    public static class uploadPlatformProcessData<I extends com.isuwang.soa.monitor.api.service.MonitorService> extends SoaProcessFunction<I, uploadPlatformProcessData_args, uploadPlatformProcessData_result, UploadPlatformProcessData_argsSerializer, UploadPlatformProcessData_resultSerializer> {
        public uploadPlatformProcessData() {
            super("uploadPlatformProcessData", new UploadPlatformProcessData_argsSerializer(), new UploadPlatformProcessData_resultSerializer());
        }

        @Override
        public uploadPlatformProcessData_result getResult(I iface, uploadPlatformProcessData_args args) throws TException {
            uploadPlatformProcessData_result result = new uploadPlatformProcessData_result();

            iface.uploadPlatformProcessData(args.platformProcessData);

            return result;
        }

        @Override
        public uploadPlatformProcessData_args getEmptyArgsInstance() {
            return new uploadPlatformProcessData_args();
        }

        @Override
        protected boolean isOneway() {
            return false;
        }
    }


    public static class getServiceMetadata_args {

        @Override
        public String toString() {
            return "{}";
        }
    }


    public static class getServiceMetadata_result {

        private String success;

        public String getSuccess() {
            return success;
        }

        public void setSuccess(String success) {
            this.success = success;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("{");
            stringBuilder.append("\"").append("success").append("\":\"").append(this.success).append("\",");
            stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(","));
            stringBuilder.append("}");

            return stringBuilder.toString();
        }
    }

    public static class GetServiceMetadata_argsSerializer implements TBeanSerializer<getServiceMetadata_args> {

        @Override
        public void read(getServiceMetadata_args bean, TProtocol iprot) throws TException {

            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);

                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
        }


        @Override
        public void write(getServiceMetadata_args bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("getServiceMetadata_args"));
            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

        public void validate(getServiceMetadata_args bean) throws TException {
        }

        @Override
        public String toString(getServiceMetadata_args bean) {
            return bean == null ? "null" : bean.toString();
        }

    }

    public static class GetServiceMetadata_resultSerializer implements TBeanSerializer<getServiceMetadata_result> {
        @Override
        public void read(getServiceMetadata_result bean, TProtocol iprot) throws TException {

            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }

                switch (schemeField.id) {
                    case 0:  //SUCCESS
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            bean.setSuccess(iprot.readString());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            validate(bean);
        }

        @Override
        public void write(getServiceMetadata_result bean, TProtocol oprot) throws TException {

            validate(bean);
            oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("getServiceMetadata_result"));

            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.STRING, (short) 0));
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

    public static class getServiceMetadata<I extends com.isuwang.soa.monitor.api.service.MonitorService> extends SoaProcessFunction<I, getServiceMetadata_args, getServiceMetadata_result, GetServiceMetadata_argsSerializer, GetServiceMetadata_resultSerializer> {
        public getServiceMetadata() {
            super("getServiceMetadata", new GetServiceMetadata_argsSerializer(), new GetServiceMetadata_resultSerializer());
        }

        @Override
        public getServiceMetadata_result getResult(I iface, getServiceMetadata_args args) throws TException {
            getServiceMetadata_result result = new getServiceMetadata_result();

            try (InputStreamReader isr = new InputStreamReader(MonitorServiceCodec.class.getClassLoader().getResourceAsStream("com.isuwang.soa.monitor.api.service.MonitorService.xml"));
                 BufferedReader in = new BufferedReader(isr)) {
                int len = 0;
                StringBuffer str = new StringBuffer("");
                String line;
                while ((line = in.readLine()) != null) {

                    if (len != 0) {
                        str.append("\r\n" + line);
                    } else {
                        str.append(line);
                    }
                    len++;
                }
                result.success = str.toString();

            } catch (Exception e) {
                e.printStackTrace();
                result.success = "";
            }

            return result;
        }

        @Override
        public getServiceMetadata_args getEmptyArgsInstance() {
            return new getServiceMetadata_args();
        }

        @Override
        protected boolean isOneway() {
            return false;
        }
    }


    public static class SoaExceptionSerializer implements TBeanSerializer<SoaException> {

        @Override
        public void read(SoaException bean, TProtocol iprot) throws TException {
            org.apache.thrift.protocol.TField schemeField;
            iprot.readStructBegin();

            while (true) {
                schemeField = iprot.readFieldBegin();
                if (schemeField.type == org.apache.thrift.protocol.TType.STOP) {
                    break;
                }
                switch (schemeField.id) {
                    case 1: // code
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            bean.setCode(iprot.readString());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    case 2: // msg
                        if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
                            bean.setMsg(iprot.readString());
                        } else {
                            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                        }
                        break;
                    default:
                        org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
                }
                iprot.readFieldEnd();
            }
            iprot.readStructEnd();

            // check for required fields of primitive type, which can't be checked in the validate method
            validate(bean);
        }


        @Override
        public void write(SoaException bean, TProtocol oprot) throws TException {
            validate(bean);

            oprot.writeStructBegin(new org.apache.thrift.protocol.TStruct("SoaException"));
            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("code", org.apache.thrift.protocol.TType.STRING, (short) 1));
            oprot.writeString(bean.getCode());
            oprot.writeFieldEnd();

            oprot.writeFieldBegin(new org.apache.thrift.protocol.TField("msg", org.apache.thrift.protocol.TType.STRING, (short) 2));
            oprot.writeString(bean.getMsg());
            oprot.writeFieldEnd();

            oprot.writeFieldStop();
            oprot.writeStructEnd();
        }

        @Override
        public void validate(SoaException bean) throws TException {
            if (bean.getCode() == null)
                throw new SoaException(SoaBaseCode.NotNull, "code字段不允许为空");

            if (bean.getMsg() == null)
                throw new SoaException(SoaBaseCode.NotNull, "msg字段不允许为空");
        }

        @Override
        public String toString(SoaException bean) {
            return bean == null ? "null" : bean.toString();
        }

    }

    public static class Processor<I extends com.isuwang.soa.monitor.api.service.MonitorService> extends SoaBaseProcessor {
        public Processor(I iface) {
            super(iface, getProcessMap(new java.util.HashMap<>()));
        }

        private static <I extends com.isuwang.soa.monitor.api.service.MonitorService> java.util.Map<String, SoaProcessFunction<I, ?, ?, ? extends TBeanSerializer<?>, ? extends TBeanSerializer<?>>> getProcessMap(java.util.Map<String, SoaProcessFunction<I, ?, ?, ? extends TBeanSerializer<?>, ? extends TBeanSerializer<?>>> processMap) {

            processMap.put("uploadQPSStat", new uploadQPSStat());

            processMap.put("uploadPlatformProcessData", new uploadPlatformProcessData());

            processMap.put("getServiceMetadata", new getServiceMetadata());

            return processMap;
        }
    }

}
      