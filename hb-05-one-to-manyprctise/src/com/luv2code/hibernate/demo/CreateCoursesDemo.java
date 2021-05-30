package com.luv2code.hibernate.demo;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class CreateCoursesDemo {

	public static void main(String[] args) {
		
		SessionFactory theFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class)
				.buildSessionFactory();
		
		Session theSession = theFactory.getCurrentSession();
		
		
		
		try {
			
			theSession.beginTransaction();
			Instructor ins=new Instructor("Yashwant","Manoj","devivilla@gmail.com");
			Course myCourse1= new Course("champistano");
			Instructor inst =theSession.get(Instructor.class,ins.getId());
			
			myCourse1.setId(inst.getId());
			
			theSession.save(myCourse1);
			
			theSession.getTransaction().commit();
			
			System.out.println("Done !!!!!");
		}
		finally {
			theSession.close();
			theFactory.close();
		}
		
	}

}
