package com.sprint.crm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sprint.crm.service.ModulesDaoImpl;

@Controller
public class ModulesController {
@Resource
private ModulesDaoImpl modulesDaoImpl;
@RequestMapping("selectByPrimaryKey")
@ResponseBody
public String  test() {
	return "测试数据";
}
}
