package com.example.app;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
	
	@Value("21")
	private int age;
	
	@Autowired
	@Qualifier("laptop")    // we can also use primary instead of qualifier
	private Computer com;
	
	public Alien() {
		System.out.println("Alien Object Created");
	}

//	@ConstructorProperties({"age", "lap"})
//	public Alien(int age, Computer lap) {
//		super();
//		this.age = age;
//		this.lap = lap;
//	}


	public int getAge() {
		return age;
	}



	public void setAge(int age) {
	//	System.out.println("Setter called");
		this.age = age;
	}




//	public void setLap(Computer lap) {
//		this.lap = lap;
//	}



	public void code() {
		System.out.println("Coding......");
		com.compile();
		
	}

	
	
	public Computer getLap() {
		return com;
	}

	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

	
}
