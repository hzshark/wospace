package cn.netdisk.wospace.vo;


public class ResultVO   {

    private  String msg;
    private int code;
    private Object result;

    public ResultVO() {
        super();
        msg="failed";

    }

    public void setSucessRepmsg() {
        this.msg = "sucessed";
        this.code=200;

    }

    public void setFailRepmsg() {
        this.msg = "failed";
        this.code=400;
    }

    public void setSucessRepmsg(String repmsg) {
        this.msg = repmsg;
        this.code=200;

    }

    public void setFailRepmsg(String repmsg) {
        this.msg = repmsg;
        this.code=400;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
