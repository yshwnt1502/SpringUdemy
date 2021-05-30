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
			int id=3;
			Course myCourse1= new Course("abacus");
//			Course myCourse2= new Course("kubernet");
//			Course myCourse3= new Course("python");
//			Course myCourse4= new Course("c");
//			Course myCourse5= new Course("C++");
			
			Instructor instructor =theSession.get(Instructor.class, id);
			instructor.setCourses(Arrays.asList(new Course[] {myCourse1}));
//			instructor.setCourses(Arrays.asList(new Course[] {myCourse1,myCourse2,myCourse3,myCourse4,myCourse5}));
////			theSession.save(instructor);
//			instructor.add(Arrays.asList(new Course[] {myCourse1,myCourse2,myCourse3,myCourse4,myCourse5}));
//			instructor.add(myCourse2);
//			instructor.add(myCourse3);
//			instructor.add(myCourse4);
//			theSession.save(myCourse1);
//			theSession.save(myCourse2);
//			theSession.save(myCourse3);
//			theSession.save(myCourse4);
//			theSession.save(myCourse5);
			
			
			theSession.getTransaction().commit();
			
			System.out.println("Done !!!!!");
		}
		finally {
			theSession.close();
			theFactory.close();
		}
		
	}

}
