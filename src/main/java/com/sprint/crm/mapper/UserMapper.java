package com.sprint.crm.mapper;

import com.sprint.crm.pojo.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {




    int insertSelective(User record);


    User selectByPrimaryKey(Integer userId);



    int updateByPrimaryKeySelective(User record);

}