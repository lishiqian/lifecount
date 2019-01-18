package com.lifecount.common;

import com.google.gson.Gson;

public class ErrorCode {
    public static Gson gson = new Gson();
    private int code;
    private String message;
    private Object data;

    public ErrorCode(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
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

    public static ErrorCode ok(Object data){
        return new ErrorCode(200,null,data);
    }

    public static ErrorCode ok(){
        return new ErrorCode(200,null,null);
    }

    public static ErrorCode bulid(int code,String message,Object data){
        return new ErrorCode(code,message,data);
    }

    @Override
    public String toString() {
        return gson.toJson(this);
    }
}
