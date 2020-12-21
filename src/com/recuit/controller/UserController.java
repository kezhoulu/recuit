package com.recuit.controller;

import com.github.pagehelper.PageInfo;
import com.recuit.cache.UserCache;
import com.recuit.config.PropertyConfigUtil;
import com.recuit.model.RoleModel;
import com.recuit.model.UserModel;
import com.recuit.service.UserService;
import com.recuit.util.SpringSecurityUtil;
import com.recuit.util.UUIDUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * 用户角色处理类
 */
@RequestMapping("/user")
@Controller
public class UserController {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;

    /**
     * 用户的列表展示
     * @return
     */
    @RequestMapping(value = "/user-list.do",method = RequestMethod.GET)
    public ModelAndView getUserList(int pageNum ,int pageSize ,String username){
        logger.info("查找所有的用户信息");
        ModelAndView mv = new ModelAndView();
        mv.addObject("userList" , new PageInfo<UserModel>(userService.getUserList(pageNum,pageSize, StringUtils.isBlank(username)?null:username)));
        mv.addObject("username",username);
        mv.setViewName("/user-list");
        return mv;
    }

    @RequestMapping(value = "/getUserById.do",method = RequestMethod.GET)
    public ModelAndView getUserById(String id,boolean edit){
        ModelAndView mv = new ModelAndView();
        UserModel user =  userService.getUserById(id,edit);
        mv.addObject("user" , user);
        mv.setViewName("user-edit");
        return  mv;
    }

    @RequestMapping(value = "/save.do",method = RequestMethod.POST)
    public ModelAndView saveUser(UserModel user){
        return userService.saveOrUpdateUser(user);
    }

    @RequestMapping(value = "/register_url.do",method = RequestMethod.GET)
    public ModelAndView register_url(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/register");
        return mv;
    }

    @RequestMapping(value = "/register.do",method = RequestMethod.POST)
    public ModelAndView register(String username , String password , String right){
        return userService.register(username,password,right);
    }

    @RequestMapping(value = "/updateinfo.do",method = RequestMethod.GET)
    public ModelAndView updateinfo(){
        ModelAndView mv = new ModelAndView();
        UserModel user = userService.getUserById(SpringSecurityUtil.currentUser().getId(),true);
        mv.addObject("user",user);
        mv.setViewName("/update-info");
        return mv;
    }

    @RequestMapping(value = "/update-submit.do",method = RequestMethod.POST)
    public ModelAndView updateSubmit(@RequestParam(value="files",required=false) MultipartFile files , UserModel user ) throws IOException {
        user = userService.updateSubmit(files,user);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/main");
        return mv;
    }

}
