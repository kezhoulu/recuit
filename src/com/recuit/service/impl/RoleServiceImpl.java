package com.recuit.service.impl;

import com.github.pagehelper.PageHelper;
import com.recuit.mapper.RoleMapper;
import com.recuit.model.RoleModel;
import com.recuit.service.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RoleMapper roleMapper;

    /**
     * 获取角色列表
     *
     * @return
     * @param pageNum
     */
    @Override
    public List<RoleModel> getRoleList(int pageNum,String roleName) {
        PageHelper.startPage(pageNum,10);
        List<RoleModel> roleList = roleMapper.getRoleList(roleName);
        return roleList;
    }

    /**
     * 根据角色id角色
     *
     * @param id
     * @param edit
     * @return
     */
    @Override
    public ModelAndView getRoleById(String id, boolean edit) {
        RoleModel role = roleMapper.getRoleById(id);
        ModelAndView mv = new ModelAndView();
        role.setEdit(edit);
        mv.addObject("role",role);
        mv.setViewName("/role-edit");
        return mv;
    }
}
