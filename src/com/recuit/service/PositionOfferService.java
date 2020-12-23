package com.recuit.service;

import com.recuit.model.PositionModel;
import com.recuit.model.PositionSqModel;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

public interface PositionOfferService {

    /**
     * 根据职位的id职位信息
     * @param id
     * @param edit
     * @return
     */
    PositionModel getPositionById(String id, boolean edit);

    /**
     * 获取本公司发布的职位
     * @return
     */
    List<PositionModel> getPositionOfferList(int pageNum, int pageSize, String gwmc, boolean rightFilter);

    ModelAndView saveOrUpdatePosition(PositionModel positionModel);

    List<PositionSqModel> getPositionSqList(int pageNum, int pageSize, String gwmc);

    void offerPositionById(String id);

    /**
     * 获取职位申请详情信息
     * @param id
     * @return
     */
    Map<String, Object> getSqPositionById(String id);

    /**
     * 根据申请id申请记录
     * @param id
     */
    void deleteOfferPositionById(String id);
}
