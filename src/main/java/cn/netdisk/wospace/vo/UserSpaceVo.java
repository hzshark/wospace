package cn.netdisk.wospace.vo;

public class UserSpaceVo extends BaseVO{

    private Integer userId;
    private Long space;
    private Long uspace;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getSpace() {
        return space;
    }

    public void setSpace(Long space) {
        this.space = space;
    }

    public Long getUspace() {
        return uspace;
    }

    public void setUspace(Long uspace) {
        this.uspace = uspace;
    }
}
