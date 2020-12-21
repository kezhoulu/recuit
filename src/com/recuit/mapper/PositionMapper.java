package com.recuit.mapper;

import com.recuit.model.PositionModel;
import com.recuit.model.PositionSqModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface PositionMapper {

    /**
     * 获取职位列表，filterRight为true时需要过滤本公司
     * @param filterRight
     * @param gwmc
     * @return
     */
    List<PositionModel> getPositionOfferList(@Param("filterRight") boolean filterRight, @Param("gwmc") String gwmc);

    void updatePosition(@Param("position") PositionModel positionModel);

    void savePosition(@Param("position")PositionModel positionModel);

    PositionModel getPositionById(String id);

}
