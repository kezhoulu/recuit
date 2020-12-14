package com.recuit.cache.util;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;

/**
 * CacheUtil缓存工具类
 * @version 1.0
 *
 */
public class CacheUtil {
    
    private static CacheManager cacheManager = CacheManager.create(CacheUtil.class.getResource("/config/ehcache.xml"));
    
    public static CacheManager getCacheManager() {
        return cacheManager;
    }
    
    public static Cache getCache(String key) {
        Cache cache = getCacheManager().getCache(key);
        return cache;
    }

}
