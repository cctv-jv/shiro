package com.shiro.core.enums;

/**
 * @author ruqiang
 * @version 1.0.0
 * @className: ResponseCode
 * @Description 响应信息
 * @create 2019/11/23
 */
public enum ResponseCode {

    /**
     * success
     */
    SUCCESS(0, "成功"),

    /**
     * failed
     */
    FAILED(1, "失败"),
    /**
     * Unauthorized
     */
    UNAUTHORIZED(40001, "未被授权"),
    /**
     * SystemInfo error
     */
    SYSTEM_ERROR(50000,"系统错误"),
    /**
     * Illegal parameter
     */
    ILLEGAL_PARAM(50001,"非法参数");


    private int code;

    private String msg;

    private ResponseCode(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}