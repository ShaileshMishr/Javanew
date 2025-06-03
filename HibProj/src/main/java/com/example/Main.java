package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
	
		// add data into db
		Student1 s1 = new Student1();

		s1.setsName("Ranu");
		s1.setRollNo(105);
		s1.setsAge(20);
		
//		Configuration cfg = new Configuration();
//		cfg.addAnnotatedClass(com.example.Student1.class);
//		cfg.configure();
//		
//		SessionFactory sf= cfg.buildSessionFactory();
		
		
		
		SessionFactory sf= new Configuration()
				.addAnnotatedClass(com.example.Student1.class)
				.configure()
				.buildSessionFactory();
		
		
		Session session = sf.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		 session.save(s1);
		session.persist(s1);
		transaction.commit();
		
		// print the data from db
	
		Student1 s2 = null;
		s2 = session.get(Student1.class, 101);
		System.out.println(s2);
		
	
		
		// Update data into db
				Student1 s3 = new Student1();

				s3.setsName("Madhu");
				s3.setRollNo(109);
				s3.setsAge(33);
			
			Transaction transaction1 = session.beginTransaction();
				session.merge(s3);
				transaction1.commit();
				
				
	}

}
