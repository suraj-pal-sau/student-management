package com.management.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.student.entity.StudentEntity;
import com.management.student.repository.StudentRepository;

@Service
public class StudentService
{
	
	@Autowired
	StudentRepository studentRepository;
	
	public List<StudentEntity> getAllStudent(){
		return studentRepository.findAll();
	}

}
