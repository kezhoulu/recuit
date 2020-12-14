package com.recuit.controller;

import com.github.pagehelper.PageInfo;
import com.recuit.model.UserModel;
import com.recuit.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用户角色处理类
 */
@RequestMapping("/user")
@Controller
public class UserController {
    Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;

    /**
     * 用户的列表展示
     * @return
     */
    @RequestMapping(value = "/user-list.do",method = RequestMethod.GET)
    public ModelAndView getUserList(){
        log.info("查找所有的用户信息");
        ModelAndView mv = new ModelAndView();
        mv.addObject("userList" , new PageInfo<UserModel>(userService.getUserList()));
        mv.setViewName("/user-list");
        return mv;
    }

    @RequestMapping(value = "/getUserById.do",method = RequestMethod.GET)
    public ModelAndView getUserById(String id){
        ModelAndView mv = new ModelAndView();
        mv.addObject("user" , userService.getUserById(id));
        mv.setViewName("user-edit");
        return  mv;
    }

    @RequestMapping(value = "/save.do",method = RequestMethod.POST)
    public ModelAndView saveUser(String right,String status){
        return null;
    }


}
