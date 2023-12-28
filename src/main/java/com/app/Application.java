package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.entity.Student;
import com.app.repository.StudentRepository;

@SpringBootApplication
public class Application  implements CommandLineRunner{
	
	@Autowired
	StudentRepository studentRepo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++) {
			Student s1=new Student();
			s1.setStudName("Sandya" + i);
			s1.setStudEmail(i+"infoto@gamil.com" );
			s1.setStudMobile(9202902);
			studentRepo.save(s1);
		}
	}
	
	

}
