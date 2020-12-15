package com.recuit.service.impl;

import com.recuit.model.PositionModel;
import com.recuit.service.PositionService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {

    @Override
    public List<PositionModel> getPositionList() {
        return null;
    }
}
