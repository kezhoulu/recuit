package com.recuit.cache;

import com.recuit.cache.util.CacheUtil;
import com.recuit.mapper.CodeMapper;
import com.recuit.mapper.UserMapper;
import com.recuit.model.CodeModel;
import com.recuit.model.UserModel;
import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CodeCache {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    @Autowired
    private CodeMapper codeMapper;

    public void reload() {
        logger.debug("加载【单值代码信息缓存】");

        try {
            List<Element> elements = new ArrayList<>();
            Map<String,Map<String,Object>> map = new HashMap<>();
            List<CodeModel> codeList = codeMapper.getCodeList();
            for (CodeModel code : codeList) {
                Map<String,Object> pidCode = map.get(code.getPid());
                if(pidCode == null){
                    Map codeMap = new HashMap();
                    codeMap.put(code.getCode(),code);
                    map.put(code.getPid(),codeMap);
                }else{
                    pidCode.put(code.getCode(),code);
                    map.put(code.getPid(),pidCode);
                }
            }
            for (Map.Entry<String, Map<String,Object>> entry : map.entrySet()) {
                net.sf.ehcache.Element item = new net.sf.ehcache.Element(entry.getKey(),entry.getValue());
                elements.add(item);
            }
            Cache c = CacheUtil.getCache("codeCache");
            this.writeLock();
            c.putAll(elements);
        } catch (Exception e) {
            logger.error("加载【单值代码信息缓存】出错", e);
        } finally {
            this.writeRelease();
        }
    }

    public CodeModel getCodeCache(String pid,String code) {
        try {
            this.readLock();
            net.sf.ehcache.Element element = CacheUtil.getCache("codeCache")
                    .get(pid);
            if (element == null)
                return null;
            return (CodeModel) ((Map) element.getObjectValue()).get(code);
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
