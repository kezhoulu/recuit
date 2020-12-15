package com.recuit.service.impl;


import com.github.pagehelper.PageHelper;
import com.recuit.mapper.PositionMapper;
import com.recuit.model.PositionModel;
import com.recuit.model.UserModel;
import com.recuit.service.PositionOfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionOfferServiceImpl implements PositionOfferService {

    @Autowired
    private PositionMapper positionMapper;

    /**
     * 获取本公司发布的职位
     *
     * @return
     */
    @Override
    public List<PositionModel> getPositionOfferList() {
        PageHelper.startPage(1,15);
        List<PositionModel> positionList = positionMapper.getPositionOfferList();
        return positionList;
    }

    /**
     * 根据职位的id职位信息
     *
     * @param id
     * @return
     */
    @Override
    public PositionModel getPositionById(String id) {
        return null;
    }
}
