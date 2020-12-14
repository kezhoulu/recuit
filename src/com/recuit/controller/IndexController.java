package com.recuit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 首页处理类
 */
@Controller
public class IndexController {

    @RequestMapping(value="/first.do",method = RequestMethod.GET)
    public String index(){
        return "/login.jsp";
    }

    @RequestMapping(value = "/register.do",method = RequestMethod.GET)
    public String register(){
        return "/register";
    }

    @RequestMapping(value = "/login.do",method = RequestMethod.POST)
    public String login(String username,String password){
        return "/main";
    }

    @RequestMapping(value = "/user-list.do",method = RequestMethod.POST)
    public String getUserList(){
        return "/user-list";
    }
}
