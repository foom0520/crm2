package com.sprint.crm.service;

import com.sprint.crm.pojo.Modules;

public interface ModulesService {

	int insertSelective(Modules record);

	Modules selectByPrimaryKey(Integer moduleId);

	int updateByPrimaryKeySelective(Modules record);
}
