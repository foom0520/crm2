package com.sprint.crm.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sprint.crm.mapper.RolesMapper;
import com.sprint.crm.pojo.Roles;
@Service
public class RolesDaoImpl implements RolesDao {
   @Resource
   private RolesMapper rolesMapper;
	@Override
	public int insertSelective(Roles record) {
		// TODO Auto-generated method stub
		return rolesMapper.insertSelective(record);
	}

	@Override
	public Roles selectByPrimaryKey(Integer roleId) {
		// TODO Auto-generated method stub
		return rolesMapper.selectByPrimaryKey(roleId);
	}

	@Override
	public int updateByPrimaryKeySelective(Roles record) {
		// TODO Auto-generated method stub
		return rolesMapper.updateByPrimaryKeySelective(record);
	}

}
