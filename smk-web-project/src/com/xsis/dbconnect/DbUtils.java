package com.xsis.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbUtils {
	private static Connection CONN = null;
	private static final String USERNAME = "hr";
	private static final String PASSWORD = "hr";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	//connection 
	public static Connection getConnect(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			CONN= DriverManager.getConnection(URL, USERNAME, PASSWORD);
		}catch(Exception e){
			e.printStackTrace();
			System.err.println("connection failed!!");
		}
		
		return CONN;
	}
	
	
	//query
	public static PreparedStatement 
			getPreparedStatement(String sql, Connection connect){
		PreparedStatement preparedStatement = null;
		try {
			 preparedStatement = connect.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return preparedStatement;
	}

}
