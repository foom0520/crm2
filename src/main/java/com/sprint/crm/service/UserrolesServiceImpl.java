package com.sprint.crm.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sprint.crm.mapper.UserrolesMapper;
import com.sprint.crm.pojo.Userroles;

@Service
public class UserrolesServiceImpl implements UserrolesService {
	@Resource
	private UserrolesMapper userrolesMapper;

	@Override
	public int insertSelective(Userroles record) {
		// TODO Auto-generated method stub
		return userrolesMapper.insertSelective(record);
	}

	@Override
	public Userroles selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return userrolesMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Userroles record) {
		// TODO Auto-generated method stub
		return userrolesMapper.updateByPrimaryKeySelective(record);
	}

}
