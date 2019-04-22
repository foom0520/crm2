package com.sprint.crm.dao;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sprint.crm.BaseTest;
import com.sprint.crm.entity.Users;

public class Stu extends BaseTest{
	@Autowired
	private UserService userDao;
	@Test
	public void testquery() {
		List<Users> queryUser = userDao.queryUser();
		System.out.println(queryUser.get(0).getUsername());
	}
}
