package com.sprint.crm.mapper;

import com.sprint.crm.pojo.Userroles;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserrolesMapper {




    int insertSelective(Userroles record);


    Userroles selectByPrimaryKey(Integer id);



    int updateByPrimaryKeySelective(Userroles record);

}