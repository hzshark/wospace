package cn.netdisk.wospace.vo;

public class FeeVo extends BaseVO{

    private Integer Id ;
    private String prdname;
    private String spnumber = "";
    private String cost = "";
    private String smscmd = "";
    private String desc = "";

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getPrdname() {
        return prdname;
    }

    public void setPrdname(String prdname) {
        this.prdname = prdname;
    }

    public String getSpnumber() {
        return spnumber;
    }

    public void setSpnumber(String spnumber) {
        this.spnumber = spnumber;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getSmscmd() {
        return smscmd;
    }

    public void setSmscmd(String smscmd) {
        this.smscmd = smscmd;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
