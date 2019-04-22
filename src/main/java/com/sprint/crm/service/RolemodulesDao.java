package com.sprint.crm.service;

import com.sprint.crm.pojo.Rolemodules;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolemodulesDao {
  


    int insertSelective(Rolemodules record);



    Rolemodules selectByPrimaryKey(Integer id);

   
    int updateByPrimaryKeySelective(Rolemodules record);

}