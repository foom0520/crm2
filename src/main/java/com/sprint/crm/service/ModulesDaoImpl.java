package com.sprint.crm.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sprint.crm.mapper.ModulesMapper;
import com.sprint.crm.pojo.Modules;

@Service
public class ModulesDaoImpl  implements ModulesDao {
	@Resource
	private ModulesMapper modulesMapper;

	@Override
	public int insertSelective(Modules record) {
		// TODO Auto-generated method stub
		return modulesMapper.insertSelective(record);
	}

	@Override
	public Modules selectByPrimaryKey(Integer moduleId) {
		// TODO Auto-generated method stub
		return modulesMapper.selectByPrimaryKey(moduleId);
	}

	@Override
	public int updateByPrimaryKeySelective(Modules record) {
		// TODO Auto-generated method stub
		return updateByPrimaryKeySelective(record);
	}
  
}
