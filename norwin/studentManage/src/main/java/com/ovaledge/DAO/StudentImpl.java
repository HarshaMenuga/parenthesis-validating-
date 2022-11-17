package com.ovaledge.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ovaledge.api.Student;
import com.ovaledge.rowmapper.StudentRowMapper;

@Repository
public class StudentImpl implements StduentDAO {
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@Override
	public List<Student> loaddetails() {
		String sql = "SELECT * FROM students";
		List<Student> studentList = jdbctemplate.query(sql, new StudentRowMapper());
		return studentList;
	}

	@Override
	public int register(Student student) {
		String sql = "insert into students (name,age,course,password) values(?,?,?,?)";
		Object[] obj = {student.getName(),student.getAge(),student.getCourse(),student.getPassword()};
		return jdbctemplate.update(sql,obj);
	}

}
