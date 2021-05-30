package com.yashwant.config;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yashwant.entity.Employee;

public class ReadEmpoyee {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory theFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		Session session =theFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			List<Employee> myEmployee =session.createQuery("from Employee").getResultList();
			System.out.println("The details of the Emplyee are  :-" +myEmployee);
			session.getTransaction().commit();
		}
		finally {
			theFactory.close();
		}
	}

}
