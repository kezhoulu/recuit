package com.recuit.mapper;

import com.recuit.model.CodeModel;
import com.recuit.model.UserModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CodeMapper {


    List<CodeModel> getCodeList();
}
