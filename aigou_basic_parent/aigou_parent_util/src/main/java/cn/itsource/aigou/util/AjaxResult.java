package cn.itsource.aigou.util;

public class AjaxResult {
    private String msg = "操作成功";
    private boolean success = true;
    private Object data;

    public AjaxResult(){}

    public AjaxResult(String msg, boolean success, String data) {
        this.msg = msg;
        this.success = success;
        this.data = data;
    }

    public static AjaxResult success(){
        AjaxResult ajaxResult = new AjaxResult();
        return ajaxResult;
    }

    public static AjaxResult success(Object data){
        AjaxResult success = success();
        success.setData(data);
        return success;
    }

    public static AjaxResult error(String msg){
        AjaxResult success = success();
        success.setMsg(msg);
        success.setSuccess(false);
        return success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
