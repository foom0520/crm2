package com.sprint.crm.mapper;

import com.sprint.crm.pojo.SignIn;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SignInMapper {





    int insertSelective(SignIn record);


    SignIn selectByPrimaryKey(Integer id);



    int updateByPrimaryKeySelective(SignIn record);


}