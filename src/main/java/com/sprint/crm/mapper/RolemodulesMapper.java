package com.sprint.crm.mapper;

import com.sprint.crm.pojo.Rolemodules;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolemodulesMapper {
  


    int insertSelective(Rolemodules record);



    Rolemodules selectByPrimaryKey(Integer id);

   
    int updateByPrimaryKeySelective(Rolemodules record);

}