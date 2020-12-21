package com.recuit.mapper;

import com.recuit.model.RoleModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.access.method.P;

import java.util.List;

public interface RoleMapper {


    public List<RoleModel> getRoleList(@Param("roleName") String roleName) ;

    RoleModel getRoleById(@Param("id") String id);

    void updateUser(@Param("role") RoleModel role);

    RoleModel getRoleByKey(String key);

    void saveRole(@Param("role") RoleModel role);
}
