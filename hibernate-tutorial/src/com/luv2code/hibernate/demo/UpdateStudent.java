package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class UpdateStudent {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session s1 = factory.getCurrentSession();
		s1.beginTransaction();

//		int studentId = 3;
//		Student student = s1.get(Student.class, studentId);
//		System.out.println(" the required student is " + student);
//		s1.delete(student);

		s1.getTransaction().commit();
        s1=factory.getCurrentSession();
		s1.beginTransaction();
		int i1 = s1.createQuery("delete from Student ").executeUpdate();
		System.out.println("the details are " + i1);
		s1.getTransaction().commit();
		
	}

}
