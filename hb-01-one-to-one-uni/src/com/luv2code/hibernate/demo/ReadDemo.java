package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class ReadDemo {

	public static void main(String[] args) {
		
		
		SessionFactory theFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session theSession = theFactory.getCurrentSession();
		
		
		
		try {
			
			theSession.beginTransaction();
			int tempId=1;
			InstructorDetail instructorDetail=theSession.get(InstructorDetail.class,tempId);
			System.out.println("The Instrcuor_Details are : "+instructorDetail);
		    System.out.println("The details for instructor are : "+instructorDetail.getInstructor());
		}
		finally {
			theFactory.close();
		}

	}

}
