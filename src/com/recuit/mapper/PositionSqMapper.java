package com.recuit.mapper;

import com.recuit.model.PositionModel;
import com.recuit.model.PositionSqModel;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.access.method.P;

import java.util.List;
import java.util.Map;

public interface PositionSqMapper {

    void insertPositionSq(@Param("sq") PositionSqModel sq);

    List<PositionSqModel> getPositionSqList( @Param("gwmc") String gwmc, @Param("userId") String userId,@Param("filter") String filter);
}
