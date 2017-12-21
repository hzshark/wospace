package cn.netdisk.wospace.model;

import java.io.Serializable;

/**
 * 用户登录信息封装
 * 
 */
public class SessionUser  implements Serializable{

	private String token;
    private Integer userid;
    private String username = "";
    private String password = "";
    private String email = "";
    private String alias = "";
    private String lastlogin = "";
    private Integer status = 0; // 0:新注册;1:激活用户;2:停用用户
    private String indate = "";
    private String salt = "";
    private long space;
    private long uspace;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(String lastlogin) {
        this.lastlogin = lastlogin;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public long getSpace() {
        return space;
    }

    public void setSpace(long space) {
        this.space = space;
    }

    public long getUspace() {
        return uspace;
    }

    public void setUspace(long uspace) {
        this.uspace = uspace;
    }
}
