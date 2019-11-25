package com.shiro.core.po;

import lombok.Data;

/**
 * @author ruqiang
 * @version 1.0.0
 * @className: LoginSpi
 * @Description 存放clientId即OpenId和secret
 * @create 2019/11/25
 */
@Data
public class LoginSpi {

    /**
     * clientId或OpenId
     */
    private String spiId;
    /**
     * 服务提供方名称
     */
    private String spiName;
    /**
     * 密钥
     */
    private String spiSecret;

}