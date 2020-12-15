package com.recuit.service;

import com.recuit.model.PositionModel;

import java.util.List;

public interface PositionOfferService {
    /**
     * 获取本公司发布的职位
     * @return
     */
    List<PositionModel> getPositionOfferList();

    /**
     * 根据职位的id职位信息
     * @param id
     * @return
     */
    PositionModel getPositionById(String id);
}
