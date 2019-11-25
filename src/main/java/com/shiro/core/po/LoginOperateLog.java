package com.shiro.core.po;

import lombok.Data;

import java.math.BigInteger;

/**
 * @author ruqiang
 * @version 1.0.0
 * @className: LoginOperateLog
 * @Description 操作日志
 * @create 2019/11/25
 */
@Data
public class LoginOperateLog {

    /**
     * 编号
     */
    private Integer operateLogId;
    /**
     * 操作描述
     */
    private String description;
    /**
     * 操作人
     */
    private String userName;
    /**
     * 操作时间
     */
    private BigInteger startTime;
    /**
     * 消耗时间
     */
    private Integer spendTime;
    /**
     * 根路径
     */
    private String basePath;
    /**
     * 资源路径
     */
    private String uri;
    /**
     * url
     */
    private String url;
    /**
     * 请求类型
     */
    private String method;
    /**
     * 请求参数
     */
    private String parameter;
    /**
     * 用户标识
     */
    private String userAgent;
    /**
     * IP地址
     */
    private String ip;
    /**
     * 请求结果
     */
    private String result;
    /**
     * 权限值
     */
    private String permission;

}