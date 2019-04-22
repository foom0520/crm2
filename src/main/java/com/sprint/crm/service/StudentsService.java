package com.sprint.crm.service;

import com.sprint.crm.pojo.Students;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentsService {

	int insertSelective(Students record);

	Students selectByPrimaryKey(Integer studentId);

	int updateByPrimaryKeySelective(Students record);

}