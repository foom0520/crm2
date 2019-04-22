package com.sprint.crm.mapper;

import com.sprint.crm.pojo.Roles;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RolesMapper {
  


    int insertSelective(Roles record);


    Roles selectByPrimaryKey(Integer roleId);



    int updateByPrimaryKeySelective(Roles record);


}