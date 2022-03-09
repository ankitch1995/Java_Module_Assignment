package com.cybage.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtility {
	
	private static Connection connection;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/workshop", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
		
	}
	
	public static Statement getStatement() {
		try {
			Statement stmt = connection.createStatement();
			return stmt;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
