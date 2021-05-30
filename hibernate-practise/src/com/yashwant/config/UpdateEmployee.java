package com.yashwant.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.yashwant.entity.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory theFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class)
				.buildSessionFactory();
		
		Session session =theFactory.getCurrentSession();
		Session session2 =theFactory.getCurrentSession();
		try {
//			session.beginTransaction();
//			session.createQuery("Update Employee Set lastName='Manohar' where firstName='Yashwant'").executeUpdate();
//			session.getTransaction().commit();
			
			session2.beginTransaction();
			int id=2;
			Employee emp2= session2.get(Employee.class, id);
			emp2.setLastName("Kumar");
					session.getTransaction().commit();
		}
		finally {
			theFactory.close();
		}
	}

}
