package com.recuit.mapper;

import com.recuit.model.UserModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    public List<UserModel>  getUserList(@Param("username") String username);

    UserModel getUserById(@Param("id") String id);

    void saveUser(@Param("user") UserModel user);

    void updateUser(@Param("user") UserModel user);

    UserModel getUserByUsername(String username);

    void updateExtUser(@Param("user")UserModel user);

    UserModel getExtUserById(String id);

    void insertExtUser(@Param("user")UserModel user);
}
