package com.gonghanxun.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.gonghanxun.entity.Student;

public interface StudentMapper {
	@Select("select * from t_student")
	List<Student> list();

}
