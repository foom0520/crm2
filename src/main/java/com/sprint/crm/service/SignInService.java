package com.sprint.crm.service;

import com.sprint.crm.pojo.SignIn;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SignInDao {





    int insertSelective(SignIn record);


    SignIn selectByPrimaryKey(Integer id);



    int updateByPrimaryKeySelective(SignIn record);


}