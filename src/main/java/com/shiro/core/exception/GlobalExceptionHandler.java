package com.shiro.core.exception;

import com.shiro.core.enums.ResponseCode;
import com.shiro.core.response.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ruqiang
 * @version 1.0.0
 * @className: GlobalExceptionHandler
 * @Description 全局异常拦截
 * @create 2019/11/23
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    /**
     * 处理UnauthorizedException
     *
     * @param e
     * @return
     */
    @ExceptionHandler(UnauthorizedException.class)
    @ResponseBody
    public ApiResponse apiExceptionHandler(UnauthorizedException e) {
        log.error("权限不足：", e);
        ApiResponse apiResponse = ApiResponse.response(ResponseCode.UNAUTHORIZED.getCode(), ResponseCode.UNAUTHORIZED.getMsg(), "当前用户无访问权限");
        return apiResponse;
    }

    /**
     * 处理ApiException
     *
     * @param exception
     * @return
     */
    @ExceptionHandler(ApiException.class)
    @ResponseBody
    public ApiResponse apiExceptionHandler(ApiException exception) {
        log.error("ApiException：", exception);
        ApiResponse apiResponse = ApiResponse.response(exception.getErrorCode(), exception.getErrorMsg(), null);
        return apiResponse;
    }

    /**
     * 处理其他的Exception
     *
     * @param exception
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ApiResponse apiExceptionHandler(Exception exception) {
        log.error("系统错误：", exception);
        ApiResponse apiResponse = ApiResponse.response(ResponseCode.SYSTEM_ERROR.getCode(), ResponseCode.SYSTEM_ERROR.getMsg(), null);
        return apiResponse;
    }
}