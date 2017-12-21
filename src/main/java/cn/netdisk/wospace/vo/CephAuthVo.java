package cn.netdisk.wospace.vo;

public class CephAuthVo extends BaseVO{

    private Integer id;
    private String user;
    private String aws_key = "";
    private String aws_secret_key = "";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getAws_key() {
        return aws_key;
    }

    public void setAws_key(String aws_key) {
        this.aws_key = aws_key;
    }

    public String getAws_secret_key() {
        return aws_secret_key;
    }

    public void setAws_secret_key(String aws_secret_key) {
        this.aws_secret_key = aws_secret_key;
    }
}
