package com.sprint.crm.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sprint.crm.mapper.StudentsMapper;
import com.sprint.crm.pojo.Students;
@Service
public class StudentsDaoImpl implements StudentsDao {
   @Resource
   private  StudentsMapper   studentsMapper;
	@Override
	public int insertSelective(Students record) {
		// TODO Auto-generated method stub
		return studentsMapper.insertSelective(record);
	}

	@Override
	public Students selectByPrimaryKey(Integer studentId) {
		// TODO Auto-generated method stub
		return studentsMapper.selectByPrimaryKey(studentId);
	}

	@Override
	public int updateByPrimaryKeySelective(Students record) {
		// TODO Auto-generated method stub
		return studentsMapper.updateByPrimaryKeySelective(record);
	}

}
