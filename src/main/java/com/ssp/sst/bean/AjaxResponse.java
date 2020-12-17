package com.ssp.sst.bean;

import java.util.Objects;

public class AjaxResponse {

    private  boolean isOk;
    private  int code;
    private  String message;
    private Object data;

    /**
     *  当调用成功时不返回数据
     * @return
     */

    public  static  AjaxResponse success(){
        AjaxResponse  resultBean = new AjaxResponse();
        resultBean.setOk(true);
        resultBean.setCode(200);
        resultBean.setMessage("success");
        return  resultBean;

    }

    /**
     * 当成功调用返回数据
     * @param data
     * @return
     */
    public  static  AjaxResponse success(Object  data){
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setOk(true);
        resultBean.setCode(200);
        resultBean.setMessage("success");
        resultBean.setData(data);

        return  resultBean;

    }


    /**
     * 当调用失败时返回信息
     * @return
     */
    public  static  AjaxResponse fail(){

        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setOk(false);
        resultBean.setCode(400);
        resultBean.setMessage("failed");

        return  resultBean;

    }

    public boolean isOk() {
        return isOk;
    }

    public void setOk(boolean ok) {
        isOk = ok;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
