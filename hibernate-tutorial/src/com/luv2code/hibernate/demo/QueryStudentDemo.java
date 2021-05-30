package com.luv2code.hibernate.demo;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args)throws SQLException{

		SessionFactory theFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = theFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			List<Student> studentList = session.createQuery(" from Student ").list();
			System.out.println("\n The student details are as follows : "+studentList);
			displayStudents(studentList);
			List<Student> studentDetils = session.createQuery("from Student s where s.id=2").getResultList();
			displayStudents(studentDetils);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
//		Iterator<Student> itr= studentList.iterator();
//			while(itr.hasNext())
//			{
//				System.out.println("\n The details are : "+itr.next());
//			}
//		}
		finally {
			theFactory.close();
		}

	}

	private static void displayStudents(List<Student> studentList) {
		for (Student student : studentList) {
			System.out.println("the students details for id " + student.getId() + " are : " + student);
		}
	}

}
