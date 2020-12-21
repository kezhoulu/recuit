package com.recuit.util;

import com.recuit.cache.util.CacheUtil;
import com.recuit.model.UserModel;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.security.core.userdetails.UserDetails;

import javax.servlet.http.HttpSession;

public class SpringSecurityUtil {
    /**
     * 获取当前登录人信息
     * @return
     */
    public static UserModel currentUser() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        if(userDetails.getUsername()==null){
            return null;
        }
        net.sf.ehcache.Element element = CacheUtil.getCache("userCache")
                .get(userDetails.getUsername());
        if (element == null)
            return null;
        return (UserModel) element.getObjectValue();
    }
}
