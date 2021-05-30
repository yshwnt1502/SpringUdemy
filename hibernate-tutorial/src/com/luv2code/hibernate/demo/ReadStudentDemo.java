package com.luv2code.hibernate.demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class ReadStudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory theFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session theSession = theFactory.getCurrentSession();

		try {
			Date theDate = DateUtils.parseDate("12/12/2000");

			Student theStudent = new Student("Rana", "Pavinder", "ranapavinder@gmail.com", theDate);
			theSession.beginTransaction();
			theSession.save(theStudent);
			theSession.getTransaction().commit();

			theSession = theFactory.getCurrentSession();
			theSession.beginTransaction();
			System.out.println("\n We will get the Student id " + theStudent.getId());
			Student mystudent = theSession.get(Student.class, theStudent.getId());
			System.out.println("\nthe student deatils for id " + theStudent.getId() + " are : " + mystudent);

			int studentid = 2;

			Student mystudent2 = theSession.get(Student.class, studentid);
			mystudent.setFirstName("Manohar");
			theSession.getTransaction().commit();
			System.out.println("The details of the student are as folows :" + mystudent2);

			theSession = theFactory.getCurrentSession();
			theSession.beginTransaction();
			theSession.createQuery(" UPDATE Student s SET s.email='abc@gmail.com'").executeUpdate();
			System.out.println("Done");
			theSession.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			theFactory.close();

		}

	}

}
