package com.recuit.service.impl;

import com.recuit.cache.UserCache;
import com.recuit.model.UserModel;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;

import java.util.ArrayList;
import java.util.List;

public class UserLoginServiceImpl implements UserDetailsService {

    @Autowired
    private UserCache userCache;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        //后期实现数据库校验，并做cache缓存
        UserModel user1 = userCache.getUserCache(userName);
        User user = new User(user1.getUserName(), user1.getPassWord(), StringUtils.equals("1",user1.getStatus()),
                true, true, true, getAuthority(user1));
        return user;
    }

    //作用就是返回一个List集合，集合中装入的是角色描述
    public List<SimpleGrantedAuthority> getAuthority(UserModel user) {
        String right = user.getRight();
        List<SimpleGrantedAuthority> list = new ArrayList<>();
        if(StringUtils.isNotBlank(right)){
            String[] rights = right.split(",");
            for(String r : rights){
                list.add(new SimpleGrantedAuthority("ROLE_"+r));
            }
        }
        return list;
    }
}
