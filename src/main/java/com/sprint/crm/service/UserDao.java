package com.sprint.crm.service;

import com.sprint.crm.pojo.User;

public interface UserDao {




    int insertSelective(User record);


    User selectByPrimaryKey(Integer userId);



    int updateByPrimaryKeySelective(User record);

}