package com.gonghanxun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gonghanxun.entity.Student;
import com.gonghanxun.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService service;
	
	
	@RequestMapping("list")
	public String list(Model m) {
		List<Student> list = service.list();
		m.addAttribute("list", list);
		return "list";
	}
	
}
