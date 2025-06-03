package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RemoveStud {

	public static void main(String[] args) {
		
		
		// Remove data from db
		SessionFactory sf= new Configuration()
				.addAnnotatedClass(com.example.Student1.class)
				.configure()
				.buildSessionFactory();
		
		
		Session session = sf.openSession();
	
		Student1 s4 = new Student1();
		s4 = session.get(Student1.class, 108);
		Transaction transaction2 = session.beginTransaction();
		session.remove(s4);
		transaction2.commit();
		
		session.close();
		sf.close();   
	}

}
