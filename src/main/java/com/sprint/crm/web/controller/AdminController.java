package com.sprint.crm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	@RequestMapping("admin")
	public String admin() {
		System.out.println("aaa");
		return "index";
	}
}
