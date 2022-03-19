package com.ssk.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssk.learning.model.Student;
import com.ssk.learning.services.StudentServices;

@Controller
public class HomePageController {
	
	@Autowired
	StudentServices studentServices;
	
	@RequestMapping("/")
	public String getHomePage(Model  model) {
		List<Student> students = studentServices.getAllStudents();
		System.out.println(students.toString());
		model.addAttribute("student", studentServices.getAllStudents());
		return "studentList";
	}

}
