package com.recuit.service.impl;


import com.github.pagehelper.PageHelper;
import com.recuit.aop.annotation.Convert;
import com.recuit.mapper.PositionMapper;
import com.recuit.mapper.PositionSqMapper;
import com.recuit.model.PositionModel;
import com.recuit.model.PositionSqModel;
import com.recuit.model.UserModel;
import com.recuit.service.PositionOfferService;
import com.recuit.util.SpringSecurityUtil;
import com.recuit.util.UUIDUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class PositionOfferServiceImpl implements PositionOfferService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private PositionMapper positionMapper;

    @Autowired
    private PositionSqMapper positionSqMapper;

    /**
     * 获取本公司发布的职位
     *
     * @return
     */
    @Override
    @Convert
    public List<PositionModel> getPositionOfferList(int pageNum, int pageSize, String gwmc, boolean rightFilter) {
        PageHelper.startPage(pageNum,pageSize);
        List<PositionModel> positionList = positionMapper.getPositionOfferList(rightFilter,StringUtils.isNotBlank(gwmc)?gwmc:null);
        return positionList;
    }

    @Override
    public ModelAndView saveOrUpdatePosition(PositionModel positionModel) {
        ModelAndView mv = new ModelAndView();
        positionModel.setSsgs(SpringSecurityUtil.currentUser().getId());
        try{
            if(positionModel.getEdit()){ //编辑
                positionMapper.updatePosition(positionModel);
            }else{  //保存
                positionModel.setId(UUIDUtil.getUuid());
                positionMapper.savePosition(positionModel);
            }
            mv.setViewName("redirect:/position-offer/position-offer-list.do?pageNum=1&pageSize=10&username=");
        }catch (Exception e){
            logger.error("保存或更新失败",e);
            mv.addObject("position",positionModel);
            mv.setViewName("position-edit");
        }

        return mv;
    }

    /**
     * 获取申请的职位列表
     * @param pageNum
     * @param pageSize
     * @param gwmc
     * @return
     */
    @Override
    @Convert
    public List<PositionSqModel> getPositionSqList(int pageNum, int pageSize, String gwmc) {
        String filter = "";
        UserModel user = SpringSecurityUtil.currentUser();
        if(StringUtils.contains(user.getRight(),"COMPANY")){//公司用户看那些人申请了本公司的职位
            filter = "COMPANY";
        } else{
            filter = "USER";//其余的默认为是普通用户，只能看自己申请了哪些职位
        }
        PageHelper.startPage(pageNum,pageSize);
        List<PositionSqModel> positionList = positionSqMapper.getPositionSqList(StringUtils.isNotBlank(gwmc)?gwmc:null,user.getId(),filter);
        return positionList;
    }

    /**
     * 申请职位
     * 插入一条记录到t_offer_position 表中
     * @param id
     */
    @Override
    public void offerPositionById(String id) {
        UserModel user = SpringSecurityUtil.currentUser();
        PositionModel position = positionMapper.getPositionById(id);
        PositionSqModel sq = new PositionSqModel();
        sq.setId(UUIDUtil.getUuid());
        sq.setPositionId(id);
        sq.setSqgs(position.getSsgs());
        sq.setSqgw(position.getGwmc());
        sq.setSqrq(new Date());
        sq.setUserId(user.getId());
        sq.setUserName(user.getUserNameCn());
        positionSqMapper.insertPositionSq(sq);
    }

    /**
     * 根据职位的id职位信息
     *
     * @param id
     * @param edit
     * @return
     */
    @Override
    public PositionModel getPositionById(String id, boolean edit) {
        PositionModel positionModel = new PositionModel();
        if(edit){
            positionModel = positionMapper.getPositionById(id);
        }
        positionModel.setEdit(edit);
        return positionModel;
    }

    /**
     * 获取职位申请详情信息
     *
     * @param id
     * @return
     */
    @Override
    public Map<String, Object> getSqPositionById(String id) {
        return positionSqMapper.getSqPositionById(id);
    }

    /**
     * 根据申请id申请记录
     *
     * @param id
     */
    @Override
    public void deleteOfferPositionById(String id) {
        positionSqMapper.deleteOfferPositionById(id);
    }

    /**
     * 根据id已经发布的职位
     *
     * @param id
     */
    @Override
    public void deletePositionById(String id) {
        positionMapper.deletePositionById(id);
    }
}
