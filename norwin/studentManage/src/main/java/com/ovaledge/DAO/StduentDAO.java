package com.ovaledge.DAO;

import java.util.List;

import com.ovaledge.api.Student;

public interface StduentDAO {
	List<Student> loaddetails();
	int register(Student student);
	
}
