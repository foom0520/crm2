package com.sprint.crm.service;

import com.sprint.crm.pojo.Students;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentsDao {



    int insertSelective(Students record);


    Students selectByPrimaryKey(Integer studentId);



    int updateByPrimaryKeySelective(Students record);

    
}