package com.sprint.crm.service;

import com.sprint.crm.pojo.Students;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentsService {

	int insertSelective(Students record);

	Students selectByPrimaryKey(Integer studentId);

	int updateByPrimaryKeySelective(Students record);
	
	/**
     * 分页数据方法
     * @param students
     * @param start
     * @param rows
     * @return
     */
    List<Students> pageData(@Param("students") Students students,@Param("start") int start,@Param("rows") int rows);
    
    /**
     * 分页总条数数据方法
     * @param students
     * @param start
     * @param rows
     * @return
     */
    int pageCount(@Param("students") Students students);
    
    List<Students> fenpeis(@Param("ids") String ids);
    
    /**
     * 批量分配
     * @param ids 要修改的学生id
     * @param userId 咨询师ID
     * @return 修改行数
     */
    int updatefenpeis(@Param("ids") String ids,@Param("userId") int userId);
    
    /**
     * 根据id删除
     * @param studentId
     * @return
     */
    int deleteByStudentId(@Param("studentId") Integer studentId);
    
    /**
     * 根据ids删除
     * @param studentId
     * @return
     */
    int deleteByStudentIds(@Param("ids") String ids);

}