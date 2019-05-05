package com.sprint.crm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sprint.crm.mapper.StudentsMapper;
import com.sprint.crm.pojo.Students;

@Service
public class StudentsServiceImpl implements StudentsService {
	@Resource
	private StudentsMapper studentsMapper;

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

	@Override
	public List<Students> pageData(Students students, int start, int rows) {
		// TODO Auto-generated method stub
		return studentsMapper.pageData(students, start, rows);
	}

	@Override
	public int pageCount(Students students) {
		// TODO Auto-generated method stub
		return studentsMapper.pageCount(students);
	}

	@Override
	public List<Students> fenpeis(String ids) {
		// TODO Auto-generated method stub
		return studentsMapper.fenpeis(ids);
	}

	@Override
	public int updatefenpeis(String ids, int userId) {
		// TODO Auto-generated method stub
		return studentsMapper.updatefenpeis(ids, userId);
	}

	@Override
	public int deleteByStudentId(Integer studentId) {
		// TODO Auto-generated method stub
		return studentsMapper.deleteByStudentId(studentId);
	}

	@Override
	public int deleteByStudentIds(String ids) {
		// TODO Auto-generated method stub
		return studentsMapper.deleteByStudentIds(ids);
	}

}
