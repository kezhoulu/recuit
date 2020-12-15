package com.recuit.controller;

import com.github.pagehelper.PageInfo;
import com.recuit.model.PositionModel;
import com.recuit.model.RoleModel;
import com.recuit.service.PositionOfferService;
import com.recuit.service.PositionService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 公司职位发布处理类
 */
@Controller
@RequestMapping("/position-offer")
public class PositionOfferController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PositionOfferService positionOfferService;

    @RequestMapping(value = "/position-offer-list.do",method = RequestMethod.GET)
    public ModelAndView getPositionOfferList(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("pOfferList" , new PageInfo<PositionModel>(positionOfferService.getPositionOfferList()));
        mv.setViewName("/position-offer-list");
        return mv;
    }

    @RequestMapping(value = "/getPositionById.do",method = RequestMethod.GET)
    public ModelAndView getPositionById(String id){
        PositionModel position = new PositionModel();
        ModelAndView mv = new ModelAndView();
        if(StringUtils.isNotBlank(id)){
            position = positionOfferService.getPositionById(id);
        }
        mv.addObject("position" , position);
        mv.setViewName("/position-edit");
        return mv;
    }
}
