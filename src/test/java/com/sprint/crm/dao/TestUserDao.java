package com.sprint.crm.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sprint.crm.BaseTest;
import com.sprint.crm.pojo.User;
import com.sprint.crm.service.UserService;

public class TestUserDao extends BaseTest{
	@Autowired
	private UserService userDao;
	@Test
	public void selectByPrimaryKey() {
		User selectByPrimaryKey = userDao.selectByPrimaryKey(1);
		System.out.println(selectByPrimaryKey);
	}
	

}
