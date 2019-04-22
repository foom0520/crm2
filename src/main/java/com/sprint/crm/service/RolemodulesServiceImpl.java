package com.sprint.crm.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sprint.crm.mapper.RolemodulesMapper;
import com.sprint.crm.pojo.Rolemodules;

@Service
public class RolemodulesServiceImpl implements RolemodulesService {
	@Resource
	private RolemodulesMapper rolemodulesMapper;

	@Override
	public int insertSelective(Rolemodules record) {
		// TODO Auto-generated method stub
		return rolemodulesMapper.insertSelective(record);
	}

	@Override
	public Rolemodules selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return rolemodulesMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Rolemodules record) {
		// TODO Auto-generated method stub
		return rolemodulesMapper.updateByPrimaryKeySelective(record);
	}

}
