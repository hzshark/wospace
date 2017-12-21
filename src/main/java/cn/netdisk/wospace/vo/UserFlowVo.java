package cn.netdisk.wospace.vo;

public class UserFlowVo extends BaseVO{

    private Integer userId;
    private Long flow;
    private Long uflow;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getFlow() {
        return flow;
    }

    public void setFlow(Long flow) {
        this.flow = flow;
    }

    public Long getUflow() {
        return uflow;
    }

    public void setUflow(Long uflow) {
        this.uflow = uflow;
    }
}
