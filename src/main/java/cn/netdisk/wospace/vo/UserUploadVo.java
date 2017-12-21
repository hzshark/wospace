package cn.netdisk.wospace.vo;

public class UserUploadVo extends BaseVO{

    private Integer userId;
    private String objectName = "";
    private String uploadid = "";
    private Integer nextpartmarker = 0;
    private String createDate = "";
    private Long offset;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getUploadid() {
        return uploadid;
    }

    public void setUploadid(String uploadid) {
        this.uploadid = uploadid;
    }

    public Integer getNextpartmarker() {
        return nextpartmarker;
    }

    public void setNextpartmarker(Integer nextpartmarker) {
        this.nextpartmarker = nextpartmarker;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }
}
