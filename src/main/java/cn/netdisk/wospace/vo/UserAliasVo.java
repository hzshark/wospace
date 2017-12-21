package cn.netdisk.wospace.vo;

public class UserAliasVo extends BaseVO{

    private Integer userId;
    private String alias = "";

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
