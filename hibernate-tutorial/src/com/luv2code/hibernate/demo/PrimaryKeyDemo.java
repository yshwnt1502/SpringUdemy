package com.luv2code.hibernate.demo;

import java.text.ParseException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		SessionFactory theFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// Session theSession = theFactory.getCurrentSession();
		Session theSession = theFactory.getCurrentSession();

		try {
			String theDate = "21/02/1992";
			Date dateOfBirth = DateUtils.parseDate(theDate);
			Student theStudent1 = new Student("Manoj", "Tiwari", "callmemanoj.manoj@gmail.com", dateOfBirth);
			Student theStudent2 = new Student("Mahesh", "Kumar", "manoj@luv2code.com", dateOfBirth);
			Student theStudent3 = new Student("Aditya", "Tiwari", "aditya@manly.com", dateOfBirth);
			Student theStudent4 = new Student("Ravi", "Singh", "Ravisingh@gmail.com", dateOfBirth);
			theSession.beginTransaction();
			theSession.save(theStudent1);
			theSession.save(theStudent2);
			theSession.save(theStudent3);
			theSession.save(theStudent4);
			theSession.getTransaction().commit();
		} catch (ParseException e) {
			e.printStackTrace();
		} finally {
			theFactory.close();
		}
	}

}
