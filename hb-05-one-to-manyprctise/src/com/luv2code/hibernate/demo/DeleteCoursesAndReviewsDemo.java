package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;

public class DeleteCoursesAndReviewsDemo {

	public static void main(String[] args) {
		
		SessionFactory theFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).addAnnotatedClass(Review.class)
				.buildSessionFactory();
		
		Session theSession = theFactory.getCurrentSession();
		
		
		
		try {
			
			theSession.beginTransaction();
			
			int id=10;
			
			Course course= theSession.get(Course.class, id);
			System.out.println("the course details : "+course);
			System.out.println("the course wih reviews :"+course.getReview());
			theSession.delete(course);
			theSession.getTransaction().commit();
			System.out.println("Done !!!!!");
		}
		finally {
			theSession.close();
			theFactory.close();
		}
		
	}

}
