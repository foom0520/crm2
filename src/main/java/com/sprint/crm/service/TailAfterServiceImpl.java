package com.sprint.crm.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sprint.crm.mapper.TailAfterMapper;
import com.sprint.crm.pojo.TailAfter;

@Service
public class TailAfterServiceImpl implements TailAfterService {
	@Resource
	private TailAfterMapper tsailAfterMapper;

	@Override
	public int insertSelective(TailAfter record) {
		// TODO Auto-generated method stub
		return tsailAfterMapper.insertSelective(record);
	}

	@Override
	public TailAfter selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return tsailAfterMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(TailAfter record) {
		// TODO Auto-generated method stub
		return tsailAfterMapper.updateByPrimaryKeySelective(record);
	}

}
