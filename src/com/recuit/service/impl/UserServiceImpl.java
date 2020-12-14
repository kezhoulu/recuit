package com.recuit.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.recuit.mapper.UserMapper;
import com.recuit.model.UserModel;
import com.recuit.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserMapper userMapper;

    /**
     * 获取所有的用户信息
     *
     * @return
     */
    @Override
    public List<UserModel> getUserList() {

        PageHelper.startPage(1,15);
        List<UserModel> userList = userMapper.getUserList();
        return userList;
    }

    /**
     * 根据用户id用户信息
     * @param id
     * @return
     */
    @Override
    public UserModel getUserById(String id) {
        return userMapper.getUserById(id);
    }
}
