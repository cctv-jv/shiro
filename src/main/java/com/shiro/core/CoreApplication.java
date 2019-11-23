package com.shiro.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ruqiang
 * @version 1.0.0
 * @className: CoreApplication
 * @Description CoreApplication
 * @create 2019/11/23
 */
@SpringBootApplication(scanBasePackages="com.shiro.core")
public class CoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreApplication.class, args);
    }

}
