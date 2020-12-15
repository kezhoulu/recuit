package com.recuit.service;

import com.recuit.model.RoleModel;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public interface RoleService {
    /**
     * 获取角色列表
     * @return
     * @param pageNum
     */
    List<RoleModel> getRoleList(int pageNum,String roleName);

    /**
     * 根据角色id角色
     * @param id
     * @param edit
     * @return
     */
    ModelAndView getRoleById(String id, boolean edit);
}
