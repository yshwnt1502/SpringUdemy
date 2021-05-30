package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Course;
import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;
import com.luv2code.hibernate.demo.entity.Review;

public class CreateCoursesAndReviewsDemo {

	public static void main(String[] args) {
		
		SessionFactory theFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).addAnnotatedClass(Review.class)
				.buildSessionFactory();
		
		Session theSession = theFactory.getCurrentSession();
		
		
		
		try {
			
			theSession.beginTransaction();
			
			Course theCourse= new Course("Learning with SQl");
			
			theCourse.addReview(new Review("Very Good"));
			theCourse.addReview(new Review("Satisfactory"));
			theCourse.addReview(new Review("Average"));
			theCourse.addReview(new Review("Excllent"));
			theSession.save(theCourse);
			
			theSession.getTransaction().commit();
			
			System.out.println("Done !!!!!");
		}
		finally {
			theSession.close();
			theFactory.close();
		}
		
	}

}
