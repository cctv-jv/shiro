package com.shiro.core.session;

import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.CachingSessionDAO;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author ruqiang
 * @version 1.0.0
 * @className: SessionService
 * @Description  SessionDao的实现类
 *               AbstractSessionDAO提供了SessionDAO的基础实现，如生成会话ID等;
 *               CachingSessionDAO提供了对开发者透明的会话缓存的功能，只需要设置相应的CacheManager即可;
 *               MemorySessionDAO直接在内存中进行会话维护;
 *               EnterpriseCacheSessionDAO提供了缓存功能的会话维护，默认情况下使用MapCache实现，内部使用ConcurrentHashMap保存缓存的会话.
 * @create 2019/11/23
 */
@Slf4j
@Service
public class SessionService extends CachingSessionDAO {

    @Override
    protected Serializable doCreate(Session session) {
        return null;
    }

    @Override
    protected void doDelete(Session session) {

    }

    @Override
    protected void doUpdate(Session session) {

    }

    @Override
    protected Session doReadSession(Serializable sessionId) {
        return null;
    }
}