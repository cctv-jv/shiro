package com.shiro.core.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author ruqiang
 * @version 1.0.0
 * @className: RedisUtil
 * @Description redis工具类
 * @create 2019/11/23
 */
@Component
public class RedisUtil {

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 保存，时间单位：分钟
     * @param key
     * @param value
     * @param timeout
     */
    public void save(String key,String value,long timeout) {
        redisTemplate.opsForValue().set(key, value, timeout, TimeUnit.MINUTES);
    }

    /**
     * 保存
     * @param key
     * @param value
     * @param timeout
     * @param timeUnit
     */
    public void save(String key,String value,long timeout,TimeUnit timeUnit) {
        redisTemplate.opsForValue().set(key, value, timeout, timeUnit);
    }


    /**
     * 根据key查询值
     * @param key
     * @return
     */
    public Object selectObjectByKey(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 删除
     * @param key
     */
    public void delete(String key){
        redisTemplate.delete(key);
    }


}