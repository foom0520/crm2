package com.sprint.crm.mapper;

import com.sprint.crm.pojo.Students;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentsMapper {



    int insertSelective(Students record);


    Students selectByPrimaryKey(Integer studentId);



    int updateByPrimaryKeySelective(Students record);

    
}