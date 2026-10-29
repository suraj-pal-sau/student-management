package com.management.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.student.entity.StudentEntity;
import com.management.student.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController
{
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("all")
	public List<StudentEntity> getAllStudents(){
		return studentService.getAllStudent();
	}

}
