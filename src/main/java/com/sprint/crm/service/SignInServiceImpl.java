package com.sprint.crm.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sprint.crm.mapper.SignInMapper;
import com.sprint.crm.pojo.SignIn;
@Service
public class SignInDaoImpl implements SignInDao {
   @Resource
   private SignInMapper   signInMapper;
	@Override
	public int insertSelective(SignIn record) {
		// TODO Auto-generated method stub
		return signInMapper.insertSelective(record);
	}

	@Override
	public SignIn selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return signInMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(SignIn record) {
		// TODO Auto-generated method stub
		return signInMapper.updateByPrimaryKeySelective(record);
	}

}
