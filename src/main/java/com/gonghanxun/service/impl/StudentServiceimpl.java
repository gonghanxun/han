package com.gonghanxun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gonghanxun.dao.StudentMapper;
import com.gonghanxun.entity.Student;
import com.gonghanxun.service.StudentService;
@Service
public class StudentServiceimpl implements StudentService {
	@Autowired
	StudentMapper mapper;

	@Override
	public List<Student> list() {
		// TODO Auto-generated method stub
		return mapper.list();
	}
	
	
}
