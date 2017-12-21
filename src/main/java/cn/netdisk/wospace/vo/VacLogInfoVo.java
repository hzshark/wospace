package cn.netdisk.wospace.vo;

public class VacLogInfoVo extends BaseVO{

    private Integer Id;
    private String indate = "";
    private String userId = "";
    private String recordSequenceId = "";
    private Integer userIdType;
    private String spId = "";
    private Integer updateType;
    private String productId = "";
    private String updateTime = "";
    private String updateDesc = "";
    private String linkId = "";
    private String content = "";
    private String effectiveDate = "";
    private String expireDate = "";
    private String time_stamp = "";
    private Integer serviceType;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRecordSequenceId() {
        return recordSequenceId;
    }

    public void setRecordSequenceId(String recordSequenceId) {
        this.recordSequenceId = recordSequenceId;
    }

    public Integer getUserIdType() {
        return userIdType;
    }

    public void setUserIdType(Integer userIdType) {
        this.userIdType = userIdType;
    }

    public String getSpId() {
        return spId;
    }

    public void setSpId(String spId) {
        this.spId = spId;
    }

    public Integer getUpdateType() {
        return updateType;
    }

    public void setUpdateType(Integer updateType) {
        this.updateType = updateType;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateDesc() {
        return updateDesc;
    }

    public void setUpdateDesc(String updateDesc) {
        this.updateDesc = updateDesc;
    }

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(String time_stamp) {
        this.time_stamp = time_stamp;
    }

    public Integer getServiceType() {
        return serviceType;
    }

    public void setServiceType(Integer serviceType) {
        this.serviceType = serviceType;
    }
}
