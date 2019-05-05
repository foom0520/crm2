package com.sprint.crm.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sprint.crm.pojo.Paging;
import com.sprint.crm.pojo.Students;
import com.sprint.crm.pojo.User;
import com.sprint.crm.service.StudentsService;
import com.sprint.crm.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	
	@ResponseBody
	@RequestMapping("selectZiXunShis")
	public List<User> selectZiXunShis() {
		return userService.selectZiXunShis("×ÉÑ¯Ê¦");
	}

}
