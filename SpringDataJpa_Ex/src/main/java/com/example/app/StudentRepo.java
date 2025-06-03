package com.example.app;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.app.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	// findByName
	
	// @Query("select s from Student s where s.name = ?1")
	List<Student> findByName(String name);

	
	// findByMarks
	List<Student> findByMarks(int marks);
	
	// find list whose marks is greater than 90
	
	List<Student> findByMarksGreaterThan(int marks);
	
}
