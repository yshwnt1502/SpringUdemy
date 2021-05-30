package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class CreateDemo {

	public static void main(String[] args) {
		
		SessionFactory theFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();
		
		Session theSession = theFactory.getCurrentSession();
		
		
		
		try {
			Instructor instructor =new Instructor("Richa","Singh","RichaSingh@gmail.com");
			InstructorDetail instructorDetail= new InstructorDetail("http://www.youtube.com/Richa","Singing");
			instructor.setInstructorDetail(instructorDetail);
			
			theSession.beginTransaction();
			theSession.save(instructor);
			theSession.getTransaction().commit();
			
			System.out.println("Done !!!!!");
		}
		finally {
			theFactory.close();
		}
		
	}

}
