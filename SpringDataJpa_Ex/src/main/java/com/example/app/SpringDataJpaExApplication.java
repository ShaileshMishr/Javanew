package com.example.app;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.app.model.Student;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);
		
		StudentRepo repo = context.getBean(StudentRepo.class);
		
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);
		Student s4 = context.getBean(Student.class);
		
		s1.setRollNo(101);
		s1.setName("Shailesh");
		s1.setMarks(95);
		
		s2.setRollNo(102);
		s2.setName("Sakshi");
		s2.setMarks(90);
		
		s3.setRollNo(103);
		s3.setName("Shanu");
		s3.setMarks(97);
		
		s4.setRollNo(104);
		s4.setName("Naman");
		s4.setMarks(78);
		
		repo.save(s1);
		repo.save(s2);
		repo.save(s3);
		repo.save(s4);
		
		// findAll
		System.out.println(repo.findAll());
		
		// findById
		System.out.println(repo.findById(102));
		
		Optional<Student> s = repo.findById(103);
		System.out.println(s.orElse(new Student()));
		
		// findByName
		
		System.out.println(repo.findByName("Shailesh"));
		
		//findByMarks
		
		System.out.println(repo.findByMarks(90));
		
		// find list whose marks is greater than 90
		
		System.out.println(repo.findByMarksGreaterThan(90));
		
		
		// Update s4 name Naman to Suyash
		
		s4.setName("Suyash");
		repo.save(s4);
		
		// delete s4
		
	  //	repo.delete(s4);
	}

}
