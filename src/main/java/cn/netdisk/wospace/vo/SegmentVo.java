package cn.netdisk.wospace.vo;

public class SegmentVo extends BaseVO{

    private Integer id;
    private String mts = "";
    private String province = "";
    private String catname = "";
    private String areavid = "";
    private String ispvid = "";
    private String carrier = "";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMts() {
        return mts;
    }

    public void setMts(String mts) {
        this.mts = mts;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }

    public String getAreavid() {
        return areavid;
    }

    public void setAreavid(String areavid) {
        this.areavid = areavid;
    }

    public String getIspvid() {
        return ispvid;
    }

    public void setIspvid(String ispvid) {
        this.ispvid = ispvid;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
}
