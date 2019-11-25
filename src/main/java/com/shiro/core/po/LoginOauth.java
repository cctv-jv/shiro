package com.shiro.core.po;

import lombok.Data;

/**
 * @author ruqiang
 * @version 1.0.0
 * @className: LoginOauth
 * @Description 认证方式
 * @create 2019/11/25
 */
@Data
public class LoginOauth {

    /**
     * 编号
     */
    private Integer oauthId;
    /**
     * 认证方式名称
     */
    private String oauthName;

}