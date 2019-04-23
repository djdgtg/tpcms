package com.retech.tpcms.utils;

import com.alibaba.fastjson.JSON;

/**
 * @author qinc
 * @date 2019/4/17
 */
public class InterfaceResult {

    private String msg;

    private String result;//是否成功:0成功 1失败

    private String returnJson;

    private String md5;

    public static InterfaceResult errorParam(){
        InterfaceResult result=new InterfaceResult();
        result.setMsg("错误的请求参数");
        result.setResult("1");
        return result;
    }

    public static InterfaceResult ok(Object object){
        HttpClientUtil util=new HttpClientUtil();
        String json = DESUtil.encryptString(JSON.toJSONString(object));
        String md5 = util.getStringMd5(json);
        InterfaceResult result=new InterfaceResult();
        result.setMsg("操作成功!");
        result.setResult("0");
        result.setMd5(md5);
        result.setReturnJson(json);
        return result;
    }

    public static InterfaceResult error(){
        InterfaceResult result=new InterfaceResult();
        result.setMsg("操作失败！");
        result.setResult("1");
        return result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getReturnJson() {
        return returnJson;
    }

    public void setReturnJson(String returnJson) {
        this.returnJson = returnJson;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }
}
