package com.recuit.controller;

import com.github.pagehelper.PageInfo;
import com.recuit.model.PositionModel;
import com.recuit.service.PositionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/position")
public class PositionController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PositionService positionService;

    @RequestMapping(value = "/position-list.do",method = RequestMethod.GET)
    public ModelAndView getPositionOfferList(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("pList" , new PageInfo<PositionModel>(positionService.getPositionList()));
        mv.setViewName("/position-list");
        return mv;
    }

}
