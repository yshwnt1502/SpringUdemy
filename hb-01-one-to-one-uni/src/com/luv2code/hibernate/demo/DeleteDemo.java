package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Instructor;
import com.luv2code.hibernate.demo.entity.InstructorDetail;

public class DeleteDemo {

	public static void main(String[] args) {

		SessionFactory theFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		Session theSession = theFactory.getCurrentSession();

		try {
			theSession.beginTransaction();
			int id = 2;
			Instructor tempInstructor = theSession.get(Instructor.class, id);
			System.out.println("Instrucor details : -" + tempInstructor);
			if (tempInstructor != null) {
				theSession.delete(tempInstructor);
				System.out.println("Going to delete !!!");
			}
			theSession.getTransaction().commit();

			System.out.println("Done !!!!!");
		} finally {
			theFactory.close();
		}

	}

}
