package com.recuit.controller;

import com.github.pagehelper.PageInfo;
import com.recuit.model.RoleModel;
import com.recuit.model.UserModel;
import com.recuit.service.RoleService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 角色管理类
 */
@Controller
@RequestMapping("/role")
public class RoleController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/role-list.do",method = RequestMethod.GET)
    public ModelAndView getRoleList(int pageNum,String roleName){
        ModelAndView mv = new ModelAndView();
        mv.addObject("roleList" , new PageInfo<RoleModel>(roleService.getRoleList(pageNum, StringUtils.isNotBlank(roleName)?roleName:null)));
        mv.setViewName("/role-list");
        return mv;
    }

    @RequestMapping(value = "/getRoleById.do",method = RequestMethod.GET)
    public ModelAndView getRoleById(String id,boolean edit){
        return roleService.getRoleById(id,edit);
    }
}
