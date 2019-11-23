package com.shiro.core.session;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.SessionListener;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ruqiang
 * @version 1.0.0
 * @className: OverrideSessionListener
 * @Description 监听
 * @create 2019/11/23
 */
@Slf4j
public class OverrideSessionListener implements SessionListener {

    /**
     * 统计在线人数
     * 线程安全自增
     */
    private final AtomicInteger sessionCount = new AtomicInteger(0);


    @Override
    public void onStart(Session session) {
        log.info("会话创建：" + session.getId());
        //会话创建，在线人数加一
        sessionCount.incrementAndGet();
        log.info("当前在线人数：" + sessionCount);
    }

    @Override
    public void onStop(Session session) {
        log.info("会话停止：" + session.getId());
        //会话退出,在线人数减一
        sessionCount.decrementAndGet();
    }

    @Override
    public void onExpiration(Session session) {
        log.info("会话过期：" + session.getId());
        //会话过期,在线人数减一
        sessionCount.decrementAndGet();
    }

    /**
     * 获取在线人数使用
     * @return
     */
    public AtomicInteger getSessionCount() {
        return sessionCount;
    }
}