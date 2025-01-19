package com.example.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionUtil {
	private static final String URL = "jdbc:mysql://localhost:3306/employee_db";
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	
	public static Connection createDBConnection(){
	    try{
	        Class.forName(DRIVER);
	        String unicode="useSSL=false&autoReconnect=true&useUnicode=yes&characterEncoding=UTF-8";
	        return DriverManager.getConnection(URL+"?"+unicode, USERNAME, PASSWORD);
	    }catch(Exception ex){
	        System.out.println(ex.getMessage());
	        System.out.println("couldn't connect database!");
	        throw new RuntimeException(ex);
	    }
	}
}
