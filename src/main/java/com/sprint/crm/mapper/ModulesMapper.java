package com.sprint.crm.mapper;

import com.sprint.crm.pojo.Modules;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModulesMapper {


 

   

    int insertSelective(Modules record);

  

    Modules selectByPrimaryKey(Integer moduleId);

 

    int updateByPrimaryKeySelective(Modules record);


}