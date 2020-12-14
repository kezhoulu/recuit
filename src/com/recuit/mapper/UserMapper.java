package com.recuit.mapper;

import com.recuit.model.UserModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    public List<UserModel>  getUserList();

    UserModel getUserById(@Param("id") String id);
}
