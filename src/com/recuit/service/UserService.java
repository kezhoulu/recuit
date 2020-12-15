package com.recuit.service;

import com.recuit.model.UserModel;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public interface UserService {

    /**
     * 获取所有的用户信息
     * @return
     */
    public List<UserModel> getUserList(int pageNum, int pageSize, String username);

    /**
     * 根据用户id获取用户信息
     * @param id
     * @param edit
     * @return
     */
    UserModel getUserById(String id, boolean edit);

    /**
     * 新建用户时的保存方法
     * @param user
     */
    void saveUser(UserModel user);

    /**
     * 更新用户方法
     * @param user
     */
    void updateUser(UserModel user);

    UserModel getUserByUsername(String username);

    ModelAndView saveOrUpdateUser(UserModel user);

    ModelAndView register(String username, String password, String right);
}
