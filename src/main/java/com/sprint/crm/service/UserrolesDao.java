package com.sprint.crm.service;

import com.sprint.crm.pojo.Userroles;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserrolesDao {




    int insertSelective(Userroles record);


    Userroles selectByPrimaryKey(Integer id);



    int updateByPrimaryKeySelective(Userroles record);

}