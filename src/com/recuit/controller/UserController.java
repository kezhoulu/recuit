package com.recuit.controller;

import com.github.pagehelper.PageInfo;
import com.recuit.model.UserModel;
import com.recuit.service.UserService;
import com.recuit.util.SpringSecurityUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 用户角色处理类
 */
@RequestMapping("/user")
@Controller
public class UserController {
    Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user-list.do",method = RequestMethod.GET)
    public ModelAndView getUserList(){
        log.info("============");
        ModelAndView mv = new ModelAndView();
        mv.addObject("userList" , new PageInfo<UserModel>(userService.getUserList()));
        mv.setViewName("/user-list");
        return mv;
    }

}
