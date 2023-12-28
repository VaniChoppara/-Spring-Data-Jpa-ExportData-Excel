package com.app.service;

import java.util.List;

import com.app.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	void saveAllStudents(List<Student> studList);
}
