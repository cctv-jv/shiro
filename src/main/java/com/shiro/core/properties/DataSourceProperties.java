package com.shiro.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ruqiang
 * @version 1.0.0
 * @className: DataSourceProperties
 * @Description DataSourceProperties
 * @create 2019/11/23
 */
@ConfigurationProperties(prefix = "spring.datasource")
@Data
public class DataSourceProperties {

    /**
     * 数据库连接url
     */
    private String url;
    /**
     * 数据库用户名
     */
    private String username;
    /**
     * 数据库密码
     */
    private String password;
    /**
     * 驱动名称
     */
    private String driverClassName;
    /**
     * 连接池初始连接个数
     */
    private int initialSize;
    /**
     * 连接池最大连接个数
     */
    private int maxActive;
    /**
     * 连接池最小连接个数
     */
    private int minIdle;
    /**
     * 获取连接最大等待时间
     */
    private long maxWait;
    /**
     * 用来检测连接是否有效的sql
     */
    private String validationQuery;
    /**
     * 申请连接时执行validationQuery检测连接是否有效
     */
    private boolean testOnBorrow;
    /**
     * 如果空闲时间大于timeBetweenEvictionRunsMillis，执行validationQuery检测连接是否有效
     */
    private boolean testWhileIdle;
    /**
     * testWhileIdle的判断依据，详细看testWhileIdle属性的说明
     */
    private long timeBetweenEvictionRunsMillis;
    /**
     * 属性类型是字符串，通过别名的方式配置扩展插件，常用的插件有：监控统计用的filter:stat、日志用的filter:log4j、防御sql注入的filter:wall
     */
    private String filters;

}