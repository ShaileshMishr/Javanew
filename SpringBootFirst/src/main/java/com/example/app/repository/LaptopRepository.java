package com.example.app.repository;

import org.springframework.stereotype.Repository;

import com.example.app.model.Laptop;

@Repository
public class LaptopRepository {

	public void save(Laptop lap) {
		System.out.println("Saved in Database");
	}
}
