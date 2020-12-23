package com.recuit.controller;

import com.github.pagehelper.PageInfo;
import com.recuit.model.PositionModel;
import com.recuit.model.PositionSqModel;
import com.recuit.service.PositionOfferService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * 公司职位发布处理类
 */
@Controller
@RequestMapping("/position-offer")
public class PositionOfferController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PositionOfferService positionOfferService;

    /**
     * 跳转到职位发布列表页面
     * @param pageNum
     * @param pageSize
     * @param gwmc
     * @return
     */
    @RequestMapping(value = "/position-offer-list.do",method = RequestMethod.GET)
    public ModelAndView getPositionOfferList(int pageNum ,int pageSize ,String gwmc){
        ModelAndView mv = new ModelAndView();
        mv.addObject("pOfferList" , new PageInfo<PositionModel>(positionOfferService.getPositionOfferList(pageNum,pageSize,gwmc,true)));
        mv.addObject("gwmc",gwmc);
        mv.setViewName("/position-offer-list");
        return mv;
    }

    /**
     * 跳转到职位申请列表页面
     * @param pageNum
     * @param pageSize
     * @param gwmc
     * @return
     */
    @RequestMapping(value = "/position-list.do",method = RequestMethod.GET)
    public ModelAndView getPositionList(int pageNum ,int pageSize ,String gwmc){
        ModelAndView mv = new ModelAndView();
        mv.addObject("pOfferList" , new PageInfo<PositionModel>(positionOfferService.getPositionOfferList(pageNum,pageSize,gwmc, false)));
        mv.addObject("gwmc",gwmc);
        mv.setViewName("/position-list");
        return mv;
    }

    /**
     * 进入职位信息编辑页面
     * @param id
     * @param edit
     * @return
     */
    @RequestMapping(value = "/getPositionById.do",method = RequestMethod.GET)
    public ModelAndView getPositionById(String id,boolean edit){
        ModelAndView mv = new ModelAndView();
        PositionModel position = positionOfferService.getPositionById(id,edit);
        mv.addObject("position" , position);
        mv.setViewName("/position-edit");
        return mv;
    }

    /**
     * 保存或更新职位信息
     * @param positionModel
     * @return
     */
    @RequestMapping(value = "/save.do",method = RequestMethod.POST)
    public ModelAndView saveUser(PositionModel positionModel){
        return positionOfferService.saveOrUpdatePosition(positionModel);
    }

    /**
     * 进入到职位申请记录列表
     * @param pageNum
     * @param pageSize
     * @param gwmc
     * @return
     */
    @RequestMapping(value = "/position-sq-list.do",method = RequestMethod.GET)
    public ModelAndView getPositionSqList(int pageNum ,int pageSize ,String gwmc){
        ModelAndView mv = new ModelAndView();
        mv.addObject("sqList" , new PageInfo<PositionSqModel>(positionOfferService.getPositionSqList(pageNum,pageSize,gwmc)));
        mv.addObject("gwmc",gwmc);
        mv.setViewName("/position-sq-list");
        return mv;
    }

    /**
     * 申请岗位，申请完成后返回到职位申请页面
     * @param id
     * @return
     */
    @RequestMapping(value = "/offerPositionById.do",method = RequestMethod.GET)
    public ModelAndView offerPositionById(String id){
        ModelAndView mv = new ModelAndView();
        positionOfferService.offerPositionById(id);
        mv.addObject("message" , "申请成功");
        mv.setViewName("redirect:/position-offer/position-list.do?pageNum=1&pageSize=10&gwmc=");
        return mv;
    }

    /**
     * 进入到职位申请详情页面
     * @param id
     * @return
     */
    @RequestMapping(value = "/getSqPositionById.do",method = RequestMethod.GET)
    public ModelAndView getSqPositionById(String id){
        ModelAndView mv = new ModelAndView();
        Map<String,Object> user = positionOfferService.getSqPositionById(id);
        mv.addObject("user" , user);
        mv.setViewName("offer-info");
        return mv;
    }

    /**
     * 根据id删除已经申请的岗位
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteOfferPositionById.do",method = RequestMethod.GET)
    public ModelAndView deleteOfferPositionById(String id){
        ModelAndView mv = new ModelAndView();
        positionOfferService.deleteOfferPositionById(id);
        mv.addObject("message" , "删除成功");
        mv.setViewName("redirect:/position-offer/position-sq-list.do?pageNum=1&pageSize=10&gwmc=");
        return mv;
    }
}
