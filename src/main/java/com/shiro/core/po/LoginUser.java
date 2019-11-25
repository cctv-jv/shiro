package com.shiro.core.po;

import lombok.Data;

import java.util.Date;

/**
 * @author ruqiang
 * @version 1.0.0
 * @className: LoginUser
 * @Description 用户
 * @create 2019/11/25
 */
@Data
public class LoginUser {

    /**
     * 编号
     */
    private Integer userId;
    /**
     *账号
     */
    private String account;
    /**
     *密码（MD5（密码加盐））
     */
    private String password;
    /**
     *盐
     */
    private String salt;
    /**
     *手机号
     */
    private Integer phoneNo;
    /**
     *性别(0:未知,1:男,2:女)
     */
    private Integer sex;
    /**
     *昵称
     */
    private String nickName;
    /**
     *头像
     */
    private String icon;
    /**
     *注册时间
     */
    private Date createTime;
    /**
     *注册IP地址
     */
    private String registryIp;
    /**
     *最后登录时间
     */
    private Date lastLoginTime;
    /**
     *最后登录IP地址
     */
    private String lastLoginIp;
    /**
     *状态：0 正常， 1 锁定
     */
    private Integer locked;
    /**
     *备注
     */
    private String memo;

}