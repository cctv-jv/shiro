package com.shiro.core.response;

import com.shiro.core.enums.ResponseCode;

import java.io.Serializable;

/**
 * @author ruqiang
 * @version 1.0.0
 * @className: ApiResponse
 * @Description 封装结果集
 * @create 2019/11/23
 */
public class ApiResponse<T> implements Serializable {

    private static final long serialVersionUID = -2342598956617529288L;

    private int code;

    private String msg;

    private T data;


    private ApiResponse(int code, String  msg, T data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static  <T> ApiResponse<T> OK(T data){
        return new ApiResponse<>(ResponseCode.SUCCESS.getCode(),ResponseCode.SUCCESS.getMsg(),data);
    }

    public static <T> ApiResponse<T> ERROR(int code, String msg,T data){
        return new ApiResponse<>(code,msg,data);
    }

    public static <T> ApiResponse<T> response(int code, String msg, T data){
        return new ApiResponse<>(code,msg,data);
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

}