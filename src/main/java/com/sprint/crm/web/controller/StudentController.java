package com.sprint.crm.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sprint.crm.pojo.Paging;
import com.sprint.crm.pojo.Students;
import com.sprint.crm.service.StudentsService;

@Controller
@RequestMapping("students")
public class StudentController {

	@Autowired
	private StudentsService studentsService;

	@RequestMapping("mystudent")
	public String list() {
		return "students/mystudent";
	}

	@ResponseBody
	@RequestMapping("pageData")
	public Map<String, Object> pageData(Students students, int page, int rows) {
		int start = (page - 1) * rows;
		Map<String, Object> map = new HashMap<String, Object>();// 空map集合
		map.put("total", studentsService.pageCount(students));// 添加商品总个数
		map.put("rows", studentsService.pageData(students, start, rows));// 添加所有商品
		return map;// 返回数据
	}
	/**
	 * 根据多个学生id查询学生集合
	 * @param students
	 * @param page
	 * @param rows
	 * @return
	 */
	@ResponseBody
	@RequestMapping("fenpeis")
	public List<Students> fenpeis(String ids) {
		return studentsService.fenpeis(ids);
	}
	
	/**
	 * 批量分配
	 * @param ids
	 * @param userId
	 * @return
	 */
	@ResponseBody
	@RequestMapping("updatefenpeis")
	public Integer updatefenpeis(@Param("ids") String ids,@Param("userId") int userId) {
		return studentsService.updatefenpeis(ids, userId);
	}
	
	@ResponseBody
	@RequestMapping("delete")
	public Integer delete(@Param("studentId") int studentId) {
		return studentsService.deleteByStudentId(studentId);
	}
	
	@ResponseBody
	@RequestMapping("deletes")
	public Integer deletes(@Param("ids") String ids) {
		return studentsService.deleteByStudentIds(ids);
	}

}
