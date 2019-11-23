package com.shiro.core.exception;

/**
 * @author ruqiang
 * @version 1.0.0
 * @className: ApiException
 * @Description 自定义异常处理
 * @create 2019/11/23
 */
public class ApiException extends RuntimeException{

    private int errorCode;

    private String errorMsg;

    public ApiException(){}


    public ApiException(String message) {
        super(message);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiException(int errorCode, String errorMsg){
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }


    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}