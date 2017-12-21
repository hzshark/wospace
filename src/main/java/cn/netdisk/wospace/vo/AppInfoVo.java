package cn.netdisk.wospace.vo;

public class AppInfoVo extends BaseVO{

    private Integer Id;
    private String name;
    private String version;
    private String packagename;
    private Long size;
    private String url;
    private String ico_url;
    private Integer status;
    private Integer priority;
    private String descriptiongui;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPackagename() {
        return packagename;
    }

    public void setPackagename(String packagename) {
        this.packagename = packagename;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIco_url() {
        return ico_url;
    }

    public void setIco_url(String ico_url) {
        this.ico_url = ico_url;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getDescriptiongui() {
        return descriptiongui;
    }

    public void setDescriptiongui(String descriptiongui) {
        this.descriptiongui = descriptiongui;
    }
}
