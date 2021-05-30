package com.yashwant.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yashwant.entity.Employee;

public class CreateEmployee {

	public static void main(String[] args) {

		SessionFactory theFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();

		Session session = theFactory.getCurrentSession();

		try {
			session.beginTransaction();
			Employee emp1 = new Employee("Yashwant", "Kumar", "Cognizant");
			Employee emp2 = new Employee("Yashwant", "Gupta", "TCS");
			Employee emp3 = new Employee("Yashwant", "Sigh", "Deloite");
			Employee emp4 = new Employee("Yashwanti", "Kumari", "SAP");
			session.save(emp1);
			session.save(emp2);
			session.save(emp3);
			session.save(emp4);
			session.getTransaction().commit();

		} finally {
			theFactory.close();
		}

	}
}
