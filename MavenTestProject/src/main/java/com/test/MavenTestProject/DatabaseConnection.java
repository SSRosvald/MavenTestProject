package com.test.MavenTestProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
	private static final String URL = "jbdc:mysql://localhost:3306/sakila";
	private static final String USER = "root";
	private static final String PASSWORD = "Element1";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
	
}
