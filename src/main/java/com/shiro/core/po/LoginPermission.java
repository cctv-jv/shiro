package com.shiro.core.po;

import lombok.Data;

import java.util.Date;

/**
 * @author ruqiang
 * @version 1.0.0
 * @className: LoginPermission
 * @Description 权限
 * @create 2019/11/25
 */
@Data
public class LoginPermission {

    /**
     * 编号
     */
    private Integer permission;
    /**
     * 所属上级
     */
    private Integer pid;
    /**
     * 名称
     */
    private String name;
    /**
     * 类型(0001:菜单,0002:子菜单,0003:功能)
     */
    private String type;
    /**
     * 全限值
     */
    private String permissionValue;
    /**
     * 路径
     */
    private String url;
    /**
     * 状态(0:禁止,1:正常)
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date createTime;
}