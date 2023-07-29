package com.project.StudentmanagementSystem;

import com.project.StudentmanagementSystem.entity.Student;
import com.project.StudentmanagementSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import static com.project.StudentmanagementSystem.repository.StudentRepository.*;

@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan(basePackages = {"controller"})
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired

	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Suryakant", "Prasad", "surya@gmail.com");
//		studentRepository.save(student);



	}
}
