package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/hb-04-one-to-many-uni?useSSL=false&serverTimeZone=UTC";
		String user = "hbstudent";
		String pass = "hbstudent";
		try (Connection myConnection = DriverManager.getConnection(url, user, pass)) {
			// System.out.println("Connecting to my database :"+url);
			// Connection myConnection=DriverManager.getConnection(url,user,pass);
			System.out.println("Connection successful");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
