package com.sprint.crm.service;

import java.util.List;

import com.sprint.crm.pojo.User;

public interface UserService {

	int insertSelective(User record);

	User selectByPrimaryKey(Integer userId);

	int updateByPrimaryKeySelective(User record);
	
	/**
     * 通过角色名查该角色的所有用户
     * @param 角色名
     * @return 用户集合
     */
    List<User> selectZiXunShis(String name);

}