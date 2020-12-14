package com.recuit.service;

import com.github.pagehelper.PageInfo;
import com.recuit.model.UserModel;

import java.util.List;

public interface UserService {

    /**
     * 获取所有的用户信息
     * @return
     */
    public List<UserModel> getUserList();
}
