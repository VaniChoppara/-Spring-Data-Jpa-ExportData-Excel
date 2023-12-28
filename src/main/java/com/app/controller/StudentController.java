package com.app.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.controller.util.ExcelGenerator;
import com.app.entity.Student;
import com.app.service.StudentService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/save-students")
	public String saveStudents() {
		Student s1=new Student();
		s1.setStudName("Sandya");
		s1.setStudEmail("infooooo@gamil.com");
		s1.setStudMobile(9202902);
		
		Student s2=new Student();
		s2.setStudName("Ravi");
		s2.setStudEmail("infooooo@gamil.com");
		s2.setStudMobile(9202902);
		
		Student s3=new Student();
		s3.setStudName("Sanvik");
		s3.setStudEmail("infooooo@gamil.com");
		s3.setStudMobile(9202902);
		
		Student s4=new Student();
		s4.setStudName("Radya");
		s4.setStudEmail("infoto@gamil.com");
		s4.setStudMobile(9202902);		
		
		List<Student> studList= Arrays.asList(s1,s2,s3,s4);
		
		studentService.saveAllStudents(studList);
		
		return "Students saved";
	}
	

	@GetMapping("/export-excel")
	public void exportIntoExcel(HttpServletResponse response)throws IOException {
		response.setContentType("application/octet-stream");
        //DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = (LocalDateTime.now()).toString();
        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=student" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);
        
        
		List<Student> allStudents = studentService.getAllStudents();
        ExcelGenerator generator = new ExcelGenerator(allStudents);
        generator.generateExcelFile(response);


		
	}
}
