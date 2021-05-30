package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class CreateInstructorDemo {

	public static void main(String[] args) {
		
		SessionFactory theFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session theSession = theFactory.getCurrentSession();
		
		
		
		try {
			Instructor instructor =new Instructor("Nivedita","Nandani","nivilyfnivedita@gmail.com");
			Instructor instructor2 =new Instructor("jaya","Rani","jaya@gmail.com");
			InstructorDetail instructorDetail= new InstructorDetail("http://www.youtube.com/nivedita","Singing");
			InstructorDetail instructorDetail2= new InstructorDetail("http://www.youtube.com/Jaya","Dancing");
			instructor.setInstructorDetail(instructorDetail);
			instructor2.setInstructorDetail(instructorDetail2);
			
			theSession.beginTransaction();
			theSession.save(instructor);
			theSession.save(instructor2);
			theSession.getTransaction().commit();
			
			System.out.println("Done !!!!!");
		}
		finally {
			theFactory.close();
		}
		
	}

}
