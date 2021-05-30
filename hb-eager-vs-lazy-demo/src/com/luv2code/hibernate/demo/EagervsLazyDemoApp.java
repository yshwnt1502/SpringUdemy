package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class EagervsLazyDemoApp {

	public static void main(String[] args) {
		
		SessionFactory theFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session theSession = theFactory.getCurrentSession();
		
		
		
		try {
			
			theSession.beginTransaction();
			int id=1;
			Instructor ins =theSession.get(Instructor.class, id);
			System.out.println("The instructor details are :"+ins);
			
			System.out.println("The instructor and courses details are :"+ins.getCourses());
			
			theSession.getTransaction().commit();
			
			System.out.println("Done !!!!!");
		}
		finally {
			theSession.close();
			theFactory.close();
		}
		
	}

}
