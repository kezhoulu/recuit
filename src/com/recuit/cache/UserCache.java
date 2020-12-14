package com.recuit.cache;

import com.recuit.cache.util.CacheUtil;
import com.recuit.mapper.UserMapper;
import com.recuit.model.UserModel;
import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 用户信息缓存类
 * 少量数据放在内存中 ，数据量大的时候需要换成redis
 */
public class UserCache {

     private Logger logger = LoggerFactory.getLogger(this.getClass());

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    @Autowired
    private UserMapper userNapper;

    public void reload() {
        logger.debug("加载【用户信息缓存】");

        try {
            List<Element> elements = new ArrayList<>();
            List<UserModel> userList = userNapper.getUserList();


            for (UserModel user : userList) {
                net.sf.ehcache.Element item = new net.sf.ehcache.Element(user.getId(),user);
                elements.add(item);
            }
            Cache c = CacheUtil.getCache("userCache");
            this.writeLock();
            c.putAll(elements);
        } catch (Exception e) {
            logger.error("加载【用户信息缓存】出错", e);
        } finally {
            this.writeRelease();
        }
    }

    public UserModel getUserCache(String id) {
        try {
            this.readLock();
            net.sf.ehcache.Element element = CacheUtil.getCache("userCache")
                    .get(id);
            if (element == null)
                return null;
            return (UserModel) element.getObjectValue();
        } finally {
            this.readRelease();
        }
    }



    protected void readLock() {
        lock.readLock().lock();
    }

    protected void readRelease() {
        lock.readLock().unlock();
    }

    protected void writeLock() {
        lock.writeLock().lock();
    }

    protected void writeRelease() {
        lock.writeLock().unlock();
    }
}
