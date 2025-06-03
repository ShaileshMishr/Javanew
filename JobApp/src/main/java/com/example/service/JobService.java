package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.JobPost;
import com.example.repo.JobRepo;

@Service
public class JobService {

	@Autowired(required = false)
	private JobRepo repo;
	
	// method to add a jobPost
	public void addJob(JobPost jobPost) {
		repo.addJob(jobPost);
	}
	
	// method to return all JobPosts
	public List<JobPost> getAllJobs(){
		return repo.getAllJobs();
		
	}
}
