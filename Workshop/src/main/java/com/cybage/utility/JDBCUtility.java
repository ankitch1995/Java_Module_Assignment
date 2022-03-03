package com.cybage.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUtility {
	
	private static Connection con;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/workshop", "root", "root");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
		
	}
	
	public static Statement getStatement() {
		try {
			Statement stmt = con.createStatement();
			return stmt;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
