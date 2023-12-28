package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Student;
import com.app.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepository studentRepository;
	
	public StudentServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> studList = studentRepository.findAll();
		return studList;
	}

	@Override
	public void saveAllStudents(List<Student> studList) {
		// TODO Auto-generated method stub
		studentRepository.saveAll(studList);
	}

}
