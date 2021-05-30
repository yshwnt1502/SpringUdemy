package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class DeleteDemoApp {

	public static void main(String[] args) {
		SessionFactory theFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		Session theSession = theFactory.getCurrentSession();

		try {
			theSession.beginTransaction();
			int tempId = 3;
			InstructorDetail tempInstructorDetail = theSession.get(InstructorDetail.class, tempId);
		    theSession.delete(tempInstructorDetail);
			theSession.getTransaction().commit();
			System.out.println("DONE !!!");

		} finally {
			theSession.close();
			theFactory.close();
		}

	}

}
