package com.luv2code.hibernate.demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory theFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
		
		Session theSession = theFactory.getCurrentSession();
		
		Student theStudent = new Student("Yashwant","Kumar","callmeyash.yash@gmail.com" ,new Date(26/12/2020));
		
		try {
			
			theSession.beginTransaction();
			theSession.save(theStudent);
			theSession.getTransaction().commit();
		}
		finally {
			theFactory.close();
		}
		
	}

}
