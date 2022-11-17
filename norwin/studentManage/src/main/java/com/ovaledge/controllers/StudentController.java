package com.ovaledge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.ovaledge.DAO.StduentDAO;

import com.ovaledge.api.Student;

@Controller
public class StudentController {
	@Autowired
	private StduentDAO dao;

	@GetMapping("/show")
	public String showStudent(Model model) {
		List<Student> studentList = dao.loaddetails();
		
		model.addAttribute("studentData", studentList);
		return "student-list";
	}
	@PostMapping("/register")
	public String register(Student student) {
		dao.register(student);
		return "success";
	}
}
