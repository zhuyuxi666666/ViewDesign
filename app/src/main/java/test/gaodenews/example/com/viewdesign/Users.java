package test.gaodenews.example.com.viewdesign;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lenovo on 2017/12/4.
 */

public class Users implements Serializable{

    /**
     * state : 200
     * msg : 操作成功
     * data : [{"start":null,"pageSize":null,"isValid":1,"createTime":1510309703000,"updateTime":1510309703000,"id":105,"userId":"801f574687a74f5ca338acfd79935161","driverId":126,"userDriver":{"start":null,"pageSize":null,"isValid":1,"createTime":1510308919000,"updateTime":1510308930000,"id":126,"driverAcc":"18810542514","driverPass":"123456","userId":"801f574687a74f5ca338acfd79935161","xm":"hh","jszh":"622630199206230682","dabh":"gg","csrq":1509984000000,"age":null,"cclzrq":1510070400000,"yxq":6,"zjcx":"A2","yxqsrq":1509465600000,"yxzzrq":null,"address":null,"annexName":"驾驶证主页,驾驶证副页","annexUpload":"http://221.238.128.220:10001/pic/images/2017/11/10/2017111006135710708793.jpg,http://221.238.128.220:10001/pic/images/2017/11/10/201711100614008340756.jpg","status":1,"type":null,"imgPath":null,"reasonCode":null,"userInfo":null,"userQual":null,"userIdCard":null,"reviewTime":1510308957000,"applyTime":1510308941000,"applyTimeStr":null,"userTravels":null,"reviewTimeStr":null,"extend":null,"lock":null,"idList":null,"reason":null,"driverStatus":null,"enterpriseName":null},"escortId":62,"userEscort":null,"drivingLicenseId":84,"drivingIdGua":null,"routeId":110,"userRoute":{"start":null,"pageSize":null,"isValid":1,"createTime":1510309446000,"updateTime":1510309446000,"id":110,"userId":"801f574687a74f5ca338acfd79935161","origin":"西青区","originDetailAddr":"天津市西青区杨柳青镇西青道319号","destination":"和平区","destDetailAddr":"天津市和平区小白楼街道树德南里","stopPoint":"海洋道,海河东路","chemicalSpecies":4,"limitLineArea":0,"relateDetachment":"西青区,南开区,和平区","approvalPoint":null,"mapRoute":"[[117.886217,38.935987],[117.864899,38.939583],[117.865113,38.940234],[117.814634,38.948512],[117.811437,38.953134],[117.801051,38.954886],[117.800794,38.954002],[117.754681,38.96433],[117.753523,38.969569],[117.735284,38.973006],[117.712796,38.967567],[117.710371,38.944757],[117.673056,38.907504],[117.632201,38.925668],[117.612975,38.951572],[117.577956,38.966522],[117.376082,38.967322],[117.309735,38.971793],[117.268965,38.966221],[117.237999,38.962134],[117.182381,38.980017],[117.108116,39.011374],[117.071541,39.058855],[116.926659,39.113219],[116.921359,39.171067],[116.907497,39.17288],[116.856106,39.153831],[116.846772,39.148506]]","userInfo":null,"reviewTime":1510309546000,"applyTime":1510309454000,"status":1,"extend":null,"danger":null,"reviewTimeStr":null,"applyTimeStr":null,"dropValue":null,"lock":null,"reason":null,"enterpriseName":null},"routeTime":"2017-11-29 09:05:04","routeEndTime":"2017-11-30 22:25:04","dangerCode":3,"annexName":null,"annexUpload":null,"status":6,"reviewTime":null,"applyTime":null,"reviewTimeStr":null,"orgName":null,"applyTimeStr":null,"source":null,"extend":null,"vehicleStatus":null,"passPath":null,"imgPath":null,"queryOrgin":null,"keyWord":null,"userDrivingLicense":{"start":null,"pageSize":null,"isValid":1,"createTime":1510309154000,"updateTime":1510309154000,"id":84,"userId":"801f574687a74f5ca338acfd79935161","xm":null,"hphm":"冀JF5392","clsbdh":"LGGA40Y39AL558950","cllx":"1","fdjh":null,"clzcrq":1511193600000,"syxz":"fg","hpzl":null,"ppxh":null,"fzrq":1510675200000,"clzl":null,"address":null,"annexName":"行驶证主页,行驶证副页","annexUpload":"http://221.238.128.220:10001/pic/images/2017/11/10/2017111006183891905041.jpg,http://221.238.128.220:10001/pic/images/2017/11/10/2017111006184350609875.jpg","extend":null,"inspectDate":null,"reviewTime":1510309588000,"applyTime":1510309160000,"vehicleStatus":null,"keyWord":null,"reviewTimeStr":null,"applyTimeStr":null,"status":1,"imgPath":null,"userRoadTransport":null,"lock":null,"idList":null,"reason":null,"businessScope":null,"enterpriseName":null},"dangerChemicals":{"id":3,"code":3,"name":"5-氨基-1,3,3-三甲基环己甲胺","otherName":"异佛尔酮二胺；3,3,5-三甲基-4,6-二氨基-2-烯环己酮；1-氨基-3-氨基甲基-3,5,5-","casNum":"2855-13-2","bark":null,"start":null,"pageSize":null},"userIdCard":{"start":null,"pageSize":null,"isValid":1,"createTime":null,"updateTime":null,"id":40,"userId":null,"personId":null,"name":"ghfdhbgnhbg","sex":null,"famousFamily":null,"birthday":null,"idCard":null,"awardOrgan":null,"yxqsrq":null,"yxzzrq":null,"address":null,"annexName":null,"annexUpload":null,"identityStatus":null,"status":null,"reviewTime":null,"applyTime":null,"reviewTimeStr":null,"applyTimeStr":null},"lock":null,"reason":null,"travelStatus":null,"travelChemical":null,"travelRegion":null,"travelPosition":null,"realTime":10000,"enterpriseName":null}]
     * ok : true
     */

    private int state;
    private String msg;
    private boolean ok;
    private List<DataEntity> data;

    public void setState(int state) {
        this.state = state;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public int getState() {
        return state;
    }

    public String getMsg() {
        return msg;
    }

    public boolean getOk() {
        return ok;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public static class DataEntity {
        /**
         * start : null
         * pageSize : null
         * isValid : 1
         * createTime : 1510309703000
         * updateTime : 1510309703000
         * id : 105
         * userId : 801f574687a74f5ca338acfd79935161
         * driverId : 126
         * userDriver : {"start":null,"pageSize":null,"isValid":1,"createTime":1510308919000,"updateTime":1510308930000,"id":126,"driverAcc":"18810542514","driverPass":"123456","userId":"801f574687a74f5ca338acfd79935161","xm":"hh","jszh":"622630199206230682","dabh":"gg","csrq":1509984000000,"age":null,"cclzrq":1510070400000,"yxq":6,"zjcx":"A2","yxqsrq":1509465600000,"yxzzrq":null,"address":null,"annexName":"驾驶证主页,驾驶证副页","annexUpload":"http://221.238.128.220:10001/pic/images/2017/11/10/2017111006135710708793.jpg,http://221.238.128.220:10001/pic/images/2017/11/10/201711100614008340756.jpg","status":1,"type":null,"imgPath":null,"reasonCode":null,"userInfo":null,"userQual":null,"userIdCard":null,"reviewTime":1510308957000,"applyTime":1510308941000,"applyTimeStr":null,"userTravels":null,"reviewTimeStr":null,"extend":null,"lock":null,"idList":null,"reason":null,"driverStatus":null,"enterpriseName":null}
         * escortId : 62
         * userEscort : null
         * drivingLicenseId : 84
         * drivingIdGua : null
         * routeId : 110
         * userRoute : {"start":null,"pageSize":null,"isValid":1,"createTime":1510309446000,"updateTime":1510309446000,"id":110,"userId":"801f574687a74f5ca338acfd79935161","origin":"西青区","originDetailAddr":"天津市西青区杨柳青镇西青道319号","destination":"和平区","destDetailAddr":"天津市和平区小白楼街道树德南里","stopPoint":"海洋道,海河东路","chemicalSpecies":4,"limitLineArea":0,"relateDetachment":"西青区,南开区,和平区","approvalPoint":null,"mapRoute":"[[117.886217,38.935987],[117.864899,38.939583],[117.865113,38.940234],[117.814634,38.948512],[117.811437,38.953134],[117.801051,38.954886],[117.800794,38.954002],[117.754681,38.96433],[117.753523,38.969569],[117.735284,38.973006],[117.712796,38.967567],[117.710371,38.944757],[117.673056,38.907504],[117.632201,38.925668],[117.612975,38.951572],[117.577956,38.966522],[117.376082,38.967322],[117.309735,38.971793],[117.268965,38.966221],[117.237999,38.962134],[117.182381,38.980017],[117.108116,39.011374],[117.071541,39.058855],[116.926659,39.113219],[116.921359,39.171067],[116.907497,39.17288],[116.856106,39.153831],[116.846772,39.148506]]","userInfo":null,"reviewTime":1510309546000,"applyTime":1510309454000,"status":1,"extend":null,"danger":null,"reviewTimeStr":null,"applyTimeStr":null,"dropValue":null,"lock":null,"reason":null,"enterpriseName":null}
         * routeTime : 2017-11-29 09:05:04
         * routeEndTime : 2017-11-30 22:25:04
         * dangerCode : 3
         * annexName : null
         * annexUpload : null
         * status : 6
         * reviewTime : null
         * applyTime : null
         * reviewTimeStr : null
         * orgName : null
         * applyTimeStr : null
         * source : null
         * extend : null
         * vehicleStatus : null
         * passPath : null
         * imgPath : null
         * queryOrgin : null
         * keyWord : null
         * userDrivingLicense : {"start":null,"pageSize":null,"isValid":1,"createTime":1510309154000,"updateTime":1510309154000,"id":84,"userId":"801f574687a74f5ca338acfd79935161","xm":null,"hphm":"冀JF5392","clsbdh":"LGGA40Y39AL558950","cllx":"1","fdjh":null,"clzcrq":1511193600000,"syxz":"fg","hpzl":null,"ppxh":null,"fzrq":1510675200000,"clzl":null,"address":null,"annexName":"行驶证主页,行驶证副页","annexUpload":"http://221.238.128.220:10001/pic/images/2017/11/10/2017111006183891905041.jpg,http://221.238.128.220:10001/pic/images/2017/11/10/2017111006184350609875.jpg","extend":null,"inspectDate":null,"reviewTime":1510309588000,"applyTime":1510309160000,"vehicleStatus":null,"keyWord":null,"reviewTimeStr":null,"applyTimeStr":null,"status":1,"imgPath":null,"userRoadTransport":null,"lock":null,"idList":null,"reason":null,"businessScope":null,"enterpriseName":null}
         * dangerChemicals : {"id":3,"code":3,"name":"5-氨基-1,3,3-三甲基环己甲胺","otherName":"异佛尔酮二胺；3,3,5-三甲基-4,6-二氨基-2-烯环己酮；1-氨基-3-氨基甲基-3,5,5-","casNum":"2855-13-2","bark":null,"start":null,"pageSize":null}
         * userIdCard : {"start":null,"pageSize":null,"isValid":1,"createTime":null,"updateTime":null,"id":40,"userId":null,"personId":null,"name":"ghfdhbgnhbg","sex":null,"famousFamily":null,"birthday":null,"idCard":null,"awardOrgan":null,"yxqsrq":null,"yxzzrq":null,"address":null,"annexName":null,"annexUpload":null,"identityStatus":null,"status":null,"reviewTime":null,"applyTime":null,"reviewTimeStr":null,"applyTimeStr":null}
         * lock : null
         * reason : null
         * travelStatus : null
         * travelChemical : null
         * travelRegion : null
         * travelPosition : null
         * realTime : 10000
         * enterpriseName : null
         */

        private Object start;
        private Object pageSize;
        private int isValid;
        private long createTime;
        private long updateTime;
        private int id;
        private String userId;
        private int driverId;
        private UserDriverEntity userDriver;
        private int escortId;
        private Object userEscort;
        private int drivingLicenseId;
        private Object drivingIdGua;
        private int routeId;
        private UserRouteEntity userRoute;
        private String routeTime;
        private String routeEndTime;
        private int dangerCode;
        private Object annexName;
        private Object annexUpload;
        private int status;
        private Object reviewTime;
        private Object applyTime;
        private Object reviewTimeStr;
        private Object orgName;
        private Object applyTimeStr;
        private Object source;
        private Object extend;
        private Object vehicleStatus;
        private Object passPath;
        private Object imgPath;
        private Object queryOrgin;
        private Object keyWord;
        private UserDrivingLicenseEntity userDrivingLicense;
        private DangerChemicalsEntity dangerChemicals;
        private UserIdCardEntity userIdCard;
        private Object lock;
        private Object reason;
        private Object travelStatus;
        private Object travelChemical;
        private Object travelRegion;
        private Object travelPosition;
        private int realTime;
        private Object enterpriseName;

        public void setStart(Object start) {
            this.start = start;
        }

        public void setPageSize(Object pageSize) {
            this.pageSize = pageSize;
        }

        public void setIsValid(int isValid) {
            this.isValid = isValid;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public void setUpdateTime(long updateTime) {
            this.updateTime = updateTime;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public void setDriverId(int driverId) {
            this.driverId = driverId;
        }

        public void setUserDriver(UserDriverEntity userDriver) {
            this.userDriver = userDriver;
        }

        public void setEscortId(int escortId) {
            this.escortId = escortId;
        }

        public void setUserEscort(Object userEscort) {
            this.userEscort = userEscort;
        }

        public void setDrivingLicenseId(int drivingLicenseId) {
            this.drivingLicenseId = drivingLicenseId;
        }

        public void setDrivingIdGua(Object drivingIdGua) {
            this.drivingIdGua = drivingIdGua;
        }

        public void setRouteId(int routeId) {
            this.routeId = routeId;
        }

        public void setUserRoute(UserRouteEntity userRoute) {
            this.userRoute = userRoute;
        }

        public void setRouteTime(String routeTime) {
            this.routeTime = routeTime;
        }

        public void setRouteEndTime(String routeEndTime) {
            this.routeEndTime = routeEndTime;
        }

        public void setDangerCode(int dangerCode) {
            this.dangerCode = dangerCode;
        }

        public void setAnnexName(Object annexName) {
            this.annexName = annexName;
        }

        public void setAnnexUpload(Object annexUpload) {
            this.annexUpload = annexUpload;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public void setReviewTime(Object reviewTime) {
            this.reviewTime = reviewTime;
        }

        public void setApplyTime(Object applyTime) {
            this.applyTime = applyTime;
        }

        public void setReviewTimeStr(Object reviewTimeStr) {
            this.reviewTimeStr = reviewTimeStr;
        }

        public void setOrgName(Object orgName) {
            this.orgName = orgName;
        }

        public void setApplyTimeStr(Object applyTimeStr) {
            this.applyTimeStr = applyTimeStr;
        }

        public void setSource(Object source) {
            this.source = source;
        }

        public void setExtend(Object extend) {
            this.extend = extend;
        }

        public void setVehicleStatus(Object vehicleStatus) {
            this.vehicleStatus = vehicleStatus;
        }

        public void setPassPath(Object passPath) {
            this.passPath = passPath;
        }

        public void setImgPath(Object imgPath) {
            this.imgPath = imgPath;
        }

        public void setQueryOrgin(Object queryOrgin) {
            this.queryOrgin = queryOrgin;
        }

        public void setKeyWord(Object keyWord) {
            this.keyWord = keyWord;
        }

        public void setUserDrivingLicense(UserDrivingLicenseEntity userDrivingLicense) {
            this.userDrivingLicense = userDrivingLicense;
        }

        public void setDangerChemicals(DangerChemicalsEntity dangerChemicals) {
            this.dangerChemicals = dangerChemicals;
        }

        public void setUserIdCard(UserIdCardEntity userIdCard) {
            this.userIdCard = userIdCard;
        }

        public void setLock(Object lock) {
            this.lock = lock;
        }

        public void setReason(Object reason) {
            this.reason = reason;
        }

        public void setTravelStatus(Object travelStatus) {
            this.travelStatus = travelStatus;
        }

        public void setTravelChemical(Object travelChemical) {
            this.travelChemical = travelChemical;
        }

        public void setTravelRegion(Object travelRegion) {
            this.travelRegion = travelRegion;
        }

        public void setTravelPosition(Object travelPosition) {
            this.travelPosition = travelPosition;
        }

        public void setRealTime(int realTime) {
            this.realTime = realTime;
        }

        public void setEnterpriseName(Object enterpriseName) {
            this.enterpriseName = enterpriseName;
        }

        public Object getStart() {
            return start;
        }

        public Object getPageSize() {
            return pageSize;
        }

        public int getIsValid() {
            return isValid;
        }

        public long getCreateTime() {
            return createTime;
        }

        public long getUpdateTime() {
            return updateTime;
        }

        public int getId() {
            return id;
        }

        public String getUserId() {
            return userId;
        }

        public int getDriverId() {
            return driverId;
        }

        public UserDriverEntity getUserDriver() {
            return userDriver;
        }

        public int getEscortId() {
            return escortId;
        }

        public Object getUserEscort() {
            return userEscort;
        }

        public int getDrivingLicenseId() {
            return drivingLicenseId;
        }

        public Object getDrivingIdGua() {
            return drivingIdGua;
        }

        public int getRouteId() {
            return routeId;
        }

        public UserRouteEntity getUserRoute() {
            return userRoute;
        }

        public String getRouteTime() {
            return routeTime;
        }

        public String getRouteEndTime() {
            return routeEndTime;
        }

        public int getDangerCode() {
            return dangerCode;
        }

        public Object getAnnexName() {
            return annexName;
        }

        public Object getAnnexUpload() {
            return annexUpload;
        }

        public int getStatus() {
            return status;
        }

        public Object getReviewTime() {
            return reviewTime;
        }

        public Object getApplyTime() {
            return applyTime;
        }

        public Object getReviewTimeStr() {
            return reviewTimeStr;
        }

        public Object getOrgName() {
            return orgName;
        }

        public Object getApplyTimeStr() {
            return applyTimeStr;
        }

        public Object getSource() {
            return source;
        }

        public Object getExtend() {
            return extend;
        }

        public Object getVehicleStatus() {
            return vehicleStatus;
        }

        public Object getPassPath() {
            return passPath;
        }

        public Object getImgPath() {
            return imgPath;
        }

        public Object getQueryOrgin() {
            return queryOrgin;
        }

        public Object getKeyWord() {
            return keyWord;
        }

        public UserDrivingLicenseEntity getUserDrivingLicense() {
            return userDrivingLicense;
        }

        public DangerChemicalsEntity getDangerChemicals() {
            return dangerChemicals;
        }

        public UserIdCardEntity getUserIdCard() {
            return userIdCard;
        }

        public Object getLock() {
            return lock;
        }

        public Object getReason() {
            return reason;
        }

        public Object getTravelStatus() {
            return travelStatus;
        }

        public Object getTravelChemical() {
            return travelChemical;
        }

        public Object getTravelRegion() {
            return travelRegion;
        }

        public Object getTravelPosition() {
            return travelPosition;
        }

        public int getRealTime() {
            return realTime;
        }

        public Object getEnterpriseName() {
            return enterpriseName;
        }

        public static class UserDriverEntity {
            /**
             * start : null
             * pageSize : null
             * isValid : 1
             * createTime : 1510308919000
             * updateTime : 1510308930000
             * id : 126
             * driverAcc : 18810542514
             * driverPass : 123456
             * userId : 801f574687a74f5ca338acfd79935161
             * xm : hh
             * jszh : 622630199206230682
             * dabh : gg
             * csrq : 1509984000000
             * age : null
             * cclzrq : 1510070400000
             * yxq : 6
             * zjcx : A2
             * yxqsrq : 1509465600000
             * yxzzrq : null
             * address : null
             * annexName : 驾驶证主页,驾驶证副页
             * annexUpload : http://221.238.128.220:10001/pic/images/2017/11/10/2017111006135710708793.jpg,http://221.238.128.220:10001/pic/images/2017/11/10/201711100614008340756.jpg
             * status : 1
             * type : null
             * imgPath : null
             * reasonCode : null
             * userInfo : null
             * userQual : null
             * userIdCard : null
             * reviewTime : 1510308957000
             * applyTime : 1510308941000
             * applyTimeStr : null
             * userTravels : null
             * reviewTimeStr : null
             * extend : null
             * lock : null
             * idList : null
             * reason : null
             * driverStatus : null
             * enterpriseName : null
             */

            private Object start;
            private Object pageSize;
            private int isValid;
            private long createTime;
            private long updateTime;
            private int id;
            private String driverAcc;
            private String driverPass;
            private String userId;
            private String xm;
            private String jszh;
            private String dabh;
            private long csrq;
            private Object age;
            private long cclzrq;
            private int yxq;
            private String zjcx;
            private long yxqsrq;
            private Object yxzzrq;
            private Object address;
            private String annexName;
            private String annexUpload;
            private int status;
            private Object type;
            private Object imgPath;
            private Object reasonCode;
            private Object userInfo;
            private Object userQual;
            private Object userIdCard;
            private long reviewTime;
            private long applyTime;
            private Object applyTimeStr;
            private Object userTravels;
            private Object reviewTimeStr;
            private Object extend;
            private Object lock;
            private Object idList;
            private Object reason;
            private Object driverStatus;
            private Object enterpriseName;

            public void setStart(Object start) {
                this.start = start;
            }

            public void setPageSize(Object pageSize) {
                this.pageSize = pageSize;
            }

            public void setIsValid(int isValid) {
                this.isValid = isValid;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public void setUpdateTime(long updateTime) {
                this.updateTime = updateTime;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setDriverAcc(String driverAcc) {
                this.driverAcc = driverAcc;
            }

            public void setDriverPass(String driverPass) {
                this.driverPass = driverPass;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }

            public void setXm(String xm) {
                this.xm = xm;
            }

            public void setJszh(String jszh) {
                this.jszh = jszh;
            }

            public void setDabh(String dabh) {
                this.dabh = dabh;
            }

            public void setCsrq(long csrq) {
                this.csrq = csrq;
            }

            public void setAge(Object age) {
                this.age = age;
            }

            public void setCclzrq(long cclzrq) {
                this.cclzrq = cclzrq;
            }

            public void setYxq(int yxq) {
                this.yxq = yxq;
            }

            public void setZjcx(String zjcx) {
                this.zjcx = zjcx;
            }

            public void setYxqsrq(long yxqsrq) {
                this.yxqsrq = yxqsrq;
            }

            public void setYxzzrq(Object yxzzrq) {
                this.yxzzrq = yxzzrq;
            }

            public void setAddress(Object address) {
                this.address = address;
            }

            public void setAnnexName(String annexName) {
                this.annexName = annexName;
            }

            public void setAnnexUpload(String annexUpload) {
                this.annexUpload = annexUpload;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public void setType(Object type) {
                this.type = type;
            }

            public void setImgPath(Object imgPath) {
                this.imgPath = imgPath;
            }

            public void setReasonCode(Object reasonCode) {
                this.reasonCode = reasonCode;
            }

            public void setUserInfo(Object userInfo) {
                this.userInfo = userInfo;
            }

            public void setUserQual(Object userQual) {
                this.userQual = userQual;
            }

            public void setUserIdCard(Object userIdCard) {
                this.userIdCard = userIdCard;
            }

            public void setReviewTime(long reviewTime) {
                this.reviewTime = reviewTime;
            }

            public void setApplyTime(long applyTime) {
                this.applyTime = applyTime;
            }

            public void setApplyTimeStr(Object applyTimeStr) {
                this.applyTimeStr = applyTimeStr;
            }

            public void setUserTravels(Object userTravels) {
                this.userTravels = userTravels;
            }

            public void setReviewTimeStr(Object reviewTimeStr) {
                this.reviewTimeStr = reviewTimeStr;
            }

            public void setExtend(Object extend) {
                this.extend = extend;
            }

            public void setLock(Object lock) {
                this.lock = lock;
            }

            public void setIdList(Object idList) {
                this.idList = idList;
            }

            public void setReason(Object reason) {
                this.reason = reason;
            }

            public void setDriverStatus(Object driverStatus) {
                this.driverStatus = driverStatus;
            }

            public void setEnterpriseName(Object enterpriseName) {
                this.enterpriseName = enterpriseName;
            }

            public Object getStart() {
                return start;
            }

            public Object getPageSize() {
                return pageSize;
            }

            public int getIsValid() {
                return isValid;
            }

            public long getCreateTime() {
                return createTime;
            }

            public long getUpdateTime() {
                return updateTime;
            }

            public int getId() {
                return id;
            }

            public String getDriverAcc() {
                return driverAcc;
            }

            public String getDriverPass() {
                return driverPass;
            }

            public String getUserId() {
                return userId;
            }

            public String getXm() {
                return xm;
            }

            public String getJszh() {
                return jszh;
            }

            public String getDabh() {
                return dabh;
            }

            public long getCsrq() {
                return csrq;
            }

            public Object getAge() {
                return age;
            }

            public long getCclzrq() {
                return cclzrq;
            }

            public int getYxq() {
                return yxq;
            }

            public String getZjcx() {
                return zjcx;
            }

            public long getYxqsrq() {
                return yxqsrq;
            }

            public Object getYxzzrq() {
                return yxzzrq;
            }

            public Object getAddress() {
                return address;
            }

            public String getAnnexName() {
                return annexName;
            }

            public String getAnnexUpload() {
                return annexUpload;
            }

            public int getStatus() {
                return status;
            }

            public Object getType() {
                return type;
            }

            public Object getImgPath() {
                return imgPath;
            }

            public Object getReasonCode() {
                return reasonCode;
            }

            public Object getUserInfo() {
                return userInfo;
            }

            public Object getUserQual() {
                return userQual;
            }

            public Object getUserIdCard() {
                return userIdCard;
            }

            public long getReviewTime() {
                return reviewTime;
            }

            public long getApplyTime() {
                return applyTime;
            }

            public Object getApplyTimeStr() {
                return applyTimeStr;
            }

            public Object getUserTravels() {
                return userTravels;
            }

            public Object getReviewTimeStr() {
                return reviewTimeStr;
            }

            public Object getExtend() {
                return extend;
            }

            public Object getLock() {
                return lock;
            }

            public Object getIdList() {
                return idList;
            }

            public Object getReason() {
                return reason;
            }

            public Object getDriverStatus() {
                return driverStatus;
            }

            public Object getEnterpriseName() {
                return enterpriseName;
            }
        }

        public static class UserRouteEntity {
            /**
             * start : null
             * pageSize : null
             * isValid : 1
             * createTime : 1510309446000
             * updateTime : 1510309446000
             * id : 110
             * userId : 801f574687a74f5ca338acfd79935161
             * origin : 西青区
             * originDetailAddr : 天津市西青区杨柳青镇西青道319号
             * destination : 和平区
             * destDetailAddr : 天津市和平区小白楼街道树德南里
             * stopPoint : 海洋道,海河东路
             * chemicalSpecies : 4
             * limitLineArea : 0
             * relateDetachment : 西青区,南开区,和平区
             * approvalPoint : null
             * mapRoute : [[117.886217,38.935987],[117.864899,38.939583],[117.865113,38.940234],[117.814634,38.948512],[117.811437,38.953134],[117.801051,38.954886],[117.800794,38.954002],[117.754681,38.96433],[117.753523,38.969569],[117.735284,38.973006],[117.712796,38.967567],[117.710371,38.944757],[117.673056,38.907504],[117.632201,38.925668],[117.612975,38.951572],[117.577956,38.966522],[117.376082,38.967322],[117.309735,38.971793],[117.268965,38.966221],[117.237999,38.962134],[117.182381,38.980017],[117.108116,39.011374],[117.071541,39.058855],[116.926659,39.113219],[116.921359,39.171067],[116.907497,39.17288],[116.856106,39.153831],[116.846772,39.148506]]
             * userInfo : null
             * reviewTime : 1510309546000
             * applyTime : 1510309454000
             * status : 1
             * extend : null
             * danger : null
             * reviewTimeStr : null
             * applyTimeStr : null
             * dropValue : null
             * lock : null
             * reason : null
             * enterpriseName : null
             */

            private Object start;
            private Object pageSize;
            private int isValid;
            private long createTime;
            private long updateTime;
            private int id;
            private String userId;
            private String origin;
            private String originDetailAddr;
            private String destination;
            private String destDetailAddr;
            private String stopPoint;
            private int chemicalSpecies;
            private int limitLineArea;
            private String relateDetachment;
            private Object approvalPoint;
            private String mapRoute;
            private Object userInfo;
            private long reviewTime;
            private long applyTime;
            private int status;
            private Object extend;
            private Object danger;
            private Object reviewTimeStr;
            private Object applyTimeStr;
            private Object dropValue;
            private Object lock;
            private Object reason;
            private Object enterpriseName;

            public void setStart(Object start) {
                this.start = start;
            }

            public void setPageSize(Object pageSize) {
                this.pageSize = pageSize;
            }

            public void setIsValid(int isValid) {
                this.isValid = isValid;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public void setUpdateTime(long updateTime) {
                this.updateTime = updateTime;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public void setOriginDetailAddr(String originDetailAddr) {
                this.originDetailAddr = originDetailAddr;
            }

            public void setDestination(String destination) {
                this.destination = destination;
            }

            public void setDestDetailAddr(String destDetailAddr) {
                this.destDetailAddr = destDetailAddr;
            }

            public void setStopPoint(String stopPoint) {
                this.stopPoint = stopPoint;
            }

            public void setChemicalSpecies(int chemicalSpecies) {
                this.chemicalSpecies = chemicalSpecies;
            }

            public void setLimitLineArea(int limitLineArea) {
                this.limitLineArea = limitLineArea;
            }

            public void setRelateDetachment(String relateDetachment) {
                this.relateDetachment = relateDetachment;
            }

            public void setApprovalPoint(Object approvalPoint) {
                this.approvalPoint = approvalPoint;
            }

            public void setMapRoute(String mapRoute) {
                this.mapRoute = mapRoute;
            }

            public void setUserInfo(Object userInfo) {
                this.userInfo = userInfo;
            }

            public void setReviewTime(long reviewTime) {
                this.reviewTime = reviewTime;
            }

            public void setApplyTime(long applyTime) {
                this.applyTime = applyTime;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public void setExtend(Object extend) {
                this.extend = extend;
            }

            public void setDanger(Object danger) {
                this.danger = danger;
            }

            public void setReviewTimeStr(Object reviewTimeStr) {
                this.reviewTimeStr = reviewTimeStr;
            }

            public void setApplyTimeStr(Object applyTimeStr) {
                this.applyTimeStr = applyTimeStr;
            }

            public void setDropValue(Object dropValue) {
                this.dropValue = dropValue;
            }

            public void setLock(Object lock) {
                this.lock = lock;
            }

            public void setReason(Object reason) {
                this.reason = reason;
            }

            public void setEnterpriseName(Object enterpriseName) {
                this.enterpriseName = enterpriseName;
            }

            public Object getStart() {
                return start;
            }

            public Object getPageSize() {
                return pageSize;
            }

            public int getIsValid() {
                return isValid;
            }

            public long getCreateTime() {
                return createTime;
            }

            public long getUpdateTime() {
                return updateTime;
            }

            public int getId() {
                return id;
            }

            public String getUserId() {
                return userId;
            }

            public String getOrigin() {
                return origin;
            }

            public String getOriginDetailAddr() {
                return originDetailAddr;
            }

            public String getDestination() {
                return destination;
            }

            public String getDestDetailAddr() {
                return destDetailAddr;
            }

            public String getStopPoint() {
                return stopPoint;
            }

            public int getChemicalSpecies() {
                return chemicalSpecies;
            }

            public int getLimitLineArea() {
                return limitLineArea;
            }

            public String getRelateDetachment() {
                return relateDetachment;
            }

            public Object getApprovalPoint() {
                return approvalPoint;
            }

            public String getMapRoute() {
                return mapRoute;
            }

            public Object getUserInfo() {
                return userInfo;
            }

            public long getReviewTime() {
                return reviewTime;
            }

            public long getApplyTime() {
                return applyTime;
            }

            public int getStatus() {
                return status;
            }

            public Object getExtend() {
                return extend;
            }

            public Object getDanger() {
                return danger;
            }

            public Object getReviewTimeStr() {
                return reviewTimeStr;
            }

            public Object getApplyTimeStr() {
                return applyTimeStr;
            }

            public Object getDropValue() {
                return dropValue;
            }

            public Object getLock() {
                return lock;
            }

            public Object getReason() {
                return reason;
            }

            public Object getEnterpriseName() {
                return enterpriseName;
            }
        }

        public static class UserDrivingLicenseEntity {
            /**
             * start : null
             * pageSize : null
             * isValid : 1
             * createTime : 1510309154000
             * updateTime : 1510309154000
             * id : 84
             * userId : 801f574687a74f5ca338acfd79935161
             * xm : null
             * hphm : 冀JF5392
             * clsbdh : LGGA40Y39AL558950
             * cllx : 1
             * fdjh : null
             * clzcrq : 1511193600000
             * syxz : fg
             * hpzl : null
             * ppxh : null
             * fzrq : 1510675200000
             * clzl : null
             * address : null
             * annexName : 行驶证主页,行驶证副页
             * annexUpload : http://221.238.128.220:10001/pic/images/2017/11/10/2017111006183891905041.jpg,http://221.238.128.220:10001/pic/images/2017/11/10/2017111006184350609875.jpg
             * extend : null
             * inspectDate : null
             * reviewTime : 1510309588000
             * applyTime : 1510309160000
             * vehicleStatus : null
             * keyWord : null
             * reviewTimeStr : null
             * applyTimeStr : null
             * status : 1
             * imgPath : null
             * userRoadTransport : null
             * lock : null
             * idList : null
             * reason : null
             * businessScope : null
             * enterpriseName : null
             */

            private Object start;
            private Object pageSize;
            private int isValid;
            private long createTime;
            private long updateTime;
            private int id;
            private String userId;
            private Object xm;
            private String hphm;
            private String clsbdh;
            private String cllx;
            private Object fdjh;
            private long clzcrq;
            private String syxz;
            private Object hpzl;
            private Object ppxh;
            private long fzrq;
            private Object clzl;
            private Object address;
            private String annexName;
            private String annexUpload;
            private Object extend;
            private Object inspectDate;
            private long reviewTime;
            private long applyTime;
            private Object vehicleStatus;
            private Object keyWord;
            private Object reviewTimeStr;
            private Object applyTimeStr;
            private int status;
            private Object imgPath;
            private Object userRoadTransport;
            private Object lock;
            private Object idList;
            private Object reason;
            private Object businessScope;
            private Object enterpriseName;

            public void setStart(Object start) {
                this.start = start;
            }

            public void setPageSize(Object pageSize) {
                this.pageSize = pageSize;
            }

            public void setIsValid(int isValid) {
                this.isValid = isValid;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public void setUpdateTime(long updateTime) {
                this.updateTime = updateTime;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }

            public void setXm(Object xm) {
                this.xm = xm;
            }

            public void setHphm(String hphm) {
                this.hphm = hphm;
            }

            public void setClsbdh(String clsbdh) {
                this.clsbdh = clsbdh;
            }

            public void setCllx(String cllx) {
                this.cllx = cllx;
            }

            public void setFdjh(Object fdjh) {
                this.fdjh = fdjh;
            }

            public void setClzcrq(long clzcrq) {
                this.clzcrq = clzcrq;
            }

            public void setSyxz(String syxz) {
                this.syxz = syxz;
            }

            public void setHpzl(Object hpzl) {
                this.hpzl = hpzl;
            }

            public void setPpxh(Object ppxh) {
                this.ppxh = ppxh;
            }

            public void setFzrq(long fzrq) {
                this.fzrq = fzrq;
            }

            public void setClzl(Object clzl) {
                this.clzl = clzl;
            }

            public void setAddress(Object address) {
                this.address = address;
            }

            public void setAnnexName(String annexName) {
                this.annexName = annexName;
            }

            public void setAnnexUpload(String annexUpload) {
                this.annexUpload = annexUpload;
            }

            public void setExtend(Object extend) {
                this.extend = extend;
            }

            public void setInspectDate(Object inspectDate) {
                this.inspectDate = inspectDate;
            }

            public void setReviewTime(long reviewTime) {
                this.reviewTime = reviewTime;
            }

            public void setApplyTime(long applyTime) {
                this.applyTime = applyTime;
            }

            public void setVehicleStatus(Object vehicleStatus) {
                this.vehicleStatus = vehicleStatus;
            }

            public void setKeyWord(Object keyWord) {
                this.keyWord = keyWord;
            }

            public void setReviewTimeStr(Object reviewTimeStr) {
                this.reviewTimeStr = reviewTimeStr;
            }

            public void setApplyTimeStr(Object applyTimeStr) {
                this.applyTimeStr = applyTimeStr;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public void setImgPath(Object imgPath) {
                this.imgPath = imgPath;
            }

            public void setUserRoadTransport(Object userRoadTransport) {
                this.userRoadTransport = userRoadTransport;
            }

            public void setLock(Object lock) {
                this.lock = lock;
            }

            public void setIdList(Object idList) {
                this.idList = idList;
            }

            public void setReason(Object reason) {
                this.reason = reason;
            }

            public void setBusinessScope(Object businessScope) {
                this.businessScope = businessScope;
            }

            public void setEnterpriseName(Object enterpriseName) {
                this.enterpriseName = enterpriseName;
            }

            public Object getStart() {
                return start;
            }

            public Object getPageSize() {
                return pageSize;
            }

            public int getIsValid() {
                return isValid;
            }

            public long getCreateTime() {
                return createTime;
            }

            public long getUpdateTime() {
                return updateTime;
            }

            public int getId() {
                return id;
            }

            public String getUserId() {
                return userId;
            }

            public Object getXm() {
                return xm;
            }

            public String getHphm() {
                return hphm;
            }

            public String getClsbdh() {
                return clsbdh;
            }

            public String getCllx() {
                return cllx;
            }

            public Object getFdjh() {
                return fdjh;
            }

            public long getClzcrq() {
                return clzcrq;
            }

            public String getSyxz() {
                return syxz;
            }

            public Object getHpzl() {
                return hpzl;
            }

            public Object getPpxh() {
                return ppxh;
            }

            public long getFzrq() {
                return fzrq;
            }

            public Object getClzl() {
                return clzl;
            }

            public Object getAddress() {
                return address;
            }

            public String getAnnexName() {
                return annexName;
            }

            public String getAnnexUpload() {
                return annexUpload;
            }

            public Object getExtend() {
                return extend;
            }

            public Object getInspectDate() {
                return inspectDate;
            }

            public long getReviewTime() {
                return reviewTime;
            }

            public long getApplyTime() {
                return applyTime;
            }

            public Object getVehicleStatus() {
                return vehicleStatus;
            }

            public Object getKeyWord() {
                return keyWord;
            }

            public Object getReviewTimeStr() {
                return reviewTimeStr;
            }

            public Object getApplyTimeStr() {
                return applyTimeStr;
            }

            public int getStatus() {
                return status;
            }

            public Object getImgPath() {
                return imgPath;
            }

            public Object getUserRoadTransport() {
                return userRoadTransport;
            }

            public Object getLock() {
                return lock;
            }

            public Object getIdList() {
                return idList;
            }

            public Object getReason() {
                return reason;
            }

            public Object getBusinessScope() {
                return businessScope;
            }

            public Object getEnterpriseName() {
                return enterpriseName;
            }
        }

        public static class DangerChemicalsEntity {
            /**
             * id : 3
             * code : 3
             * name : 5-氨基-1,3,3-三甲基环己甲胺
             * otherName : 异佛尔酮二胺；3,3,5-三甲基-4,6-二氨基-2-烯环己酮；1-氨基-3-氨基甲基-3,5,5-
             * casNum : 2855-13-2
             * bark : null
             * start : null
             * pageSize : null
             */

            private int id;
            private int code;
            private String name;
            private String otherName;
            private String casNum;
            private Object bark;
            private Object start;
            private Object pageSize;

            public void setId(int id) {
                this.id = id;
            }

            public void setCode(int code) {
                this.code = code;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setOtherName(String otherName) {
                this.otherName = otherName;
            }

            public void setCasNum(String casNum) {
                this.casNum = casNum;
            }

            public void setBark(Object bark) {
                this.bark = bark;
            }

            public void setStart(Object start) {
                this.start = start;
            }

            public void setPageSize(Object pageSize) {
                this.pageSize = pageSize;
            }

            public int getId() {
                return id;
            }

            public int getCode() {
                return code;
            }

            public String getName() {
                return name;
            }

            public String getOtherName() {
                return otherName;
            }

            public String getCasNum() {
                return casNum;
            }

            public Object getBark() {
                return bark;
            }

            public Object getStart() {
                return start;
            }

            public Object getPageSize() {
                return pageSize;
            }
        }

        public static class UserIdCardEntity {
            /**
             * start : null
             * pageSize : null
             * isValid : 1
             * createTime : null
             * updateTime : null
             * id : 40
             * userId : null
             * personId : null
             * name : ghfdhbgnhbg
             * sex : null
             * famousFamily : null
             * birthday : null
             * idCard : null
             * awardOrgan : null
             * yxqsrq : null
             * yxzzrq : null
             * address : null
             * annexName : null
             * annexUpload : null
             * identityStatus : null
             * status : null
             * reviewTime : null
             * applyTime : null
             * reviewTimeStr : null
             * applyTimeStr : null
             */

            private Object start;
            private Object pageSize;
            private int isValid;
            private Object createTime;
            private Object updateTime;
            private int id;
            private Object userId;
            private Object personId;
            private String name;
            private Object sex;
            private Object famousFamily;
            private Object birthday;
            private Object idCard;
            private Object awardOrgan;
            private Object yxqsrq;
            private Object yxzzrq;
            private Object address;
            private Object annexName;
            private Object annexUpload;
            private Object identityStatus;
            private Object status;
            private Object reviewTime;
            private Object applyTime;
            private Object reviewTimeStr;
            private Object applyTimeStr;

            public void setStart(Object start) {
                this.start = start;
            }

            public void setPageSize(Object pageSize) {
                this.pageSize = pageSize;
            }

            public void setIsValid(int isValid) {
                this.isValid = isValid;
            }

            public void setCreateTime(Object createTime) {
                this.createTime = createTime;
            }

            public void setUpdateTime(Object updateTime) {
                this.updateTime = updateTime;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setUserId(Object userId) {
                this.userId = userId;
            }

            public void setPersonId(Object personId) {
                this.personId = personId;
            }

            public void setName(String name) {
                this.name = name;
            }

            public void setSex(Object sex) {
                this.sex = sex;
            }

            public void setFamousFamily(Object famousFamily) {
                this.famousFamily = famousFamily;
            }

            public void setBirthday(Object birthday) {
                this.birthday = birthday;
            }

            public void setIdCard(Object idCard) {
                this.idCard = idCard;
            }

            public void setAwardOrgan(Object awardOrgan) {
                this.awardOrgan = awardOrgan;
            }

            public void setYxqsrq(Object yxqsrq) {
                this.yxqsrq = yxqsrq;
            }

            public void setYxzzrq(Object yxzzrq) {
                this.yxzzrq = yxzzrq;
            }

            public void setAddress(Object address) {
                this.address = address;
            }

            public void setAnnexName(Object annexName) {
                this.annexName = annexName;
            }

            public void setAnnexUpload(Object annexUpload) {
                this.annexUpload = annexUpload;
            }

            public void setIdentityStatus(Object identityStatus) {
                this.identityStatus = identityStatus;
            }

            public void setStatus(Object status) {
                this.status = status;
            }

            public void setReviewTime(Object reviewTime) {
                this.reviewTime = reviewTime;
            }

            public void setApplyTime(Object applyTime) {
                this.applyTime = applyTime;
            }

            public void setReviewTimeStr(Object reviewTimeStr) {
                this.reviewTimeStr = reviewTimeStr;
            }

            public void setApplyTimeStr(Object applyTimeStr) {
                this.applyTimeStr = applyTimeStr;
            }

            public Object getStart() {
                return start;
            }

            public Object getPageSize() {
                return pageSize;
            }

            public int getIsValid() {
                return isValid;
            }

            public Object getCreateTime() {
                return createTime;
            }

            public Object getUpdateTime() {
                return updateTime;
            }

            public int getId() {
                return id;
            }

            public Object getUserId() {
                return userId;
            }

            public Object getPersonId() {
                return personId;
            }

            public String getName() {
                return name;
            }

            public Object getSex() {
                return sex;
            }

            public Object getFamousFamily() {
                return famousFamily;
            }

            public Object getBirthday() {
                return birthday;
            }

            public Object getIdCard() {
                return idCard;
            }

            public Object getAwardOrgan() {
                return awardOrgan;
            }

            public Object getYxqsrq() {
                return yxqsrq;
            }

            public Object getYxzzrq() {
                return yxzzrq;
            }

            public Object getAddress() {
                return address;
            }

            public Object getAnnexName() {
                return annexName;
            }

            public Object getAnnexUpload() {
                return annexUpload;
            }

            public Object getIdentityStatus() {
                return identityStatus;
            }

            public Object getStatus() {
                return status;
            }

            public Object getReviewTime() {
                return reviewTime;
            }

            public Object getApplyTime() {
                return applyTime;
            }

            public Object getReviewTimeStr() {
                return reviewTimeStr;
            }

            public Object getApplyTimeStr() {
                return applyTimeStr;
            }
        }
    }
}
