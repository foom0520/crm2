package com.sprint.crm.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sprint.crm.BaseTest;
import com.sprint.crm.pojo.User;
import com.sprint.crm.service.UserDao;

public class TestUserDao extends BaseTest{
	@Autowired
	private UserDao userDao;
	@Test
	public void selectByPrimaryKey() {
		User selectByPrimaryKey = userDao.selectByPrimaryKey(1);
		System.out.println(selectByPrimaryKey);
	}
	

}
