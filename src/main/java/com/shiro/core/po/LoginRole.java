package com.shiro.core.po;

import lombok.Data;

import java.util.Date;

/**
 * @author ruqiang
 * @version 1.0.0
 * @className: LoginRole
 * @Description 角色
 * @create 2019/11/25
 */
@Data
public class LoginRole {

    /**
     *编号
     */
    private Integer roleId;
    /**
     *上级ID
     */
    private Integer pid;
    /**
     *代号
     */
    private String codeNm;
    /**
     *角色名称
     */
    private String roleNm;
    /**
     *角色描述
     */
    private String description;
    /**
     *创建时间
     */
    private Date createTime;
    /**
     *状态：0 正常， 1 锁定
     */
    private Integer locked;

}