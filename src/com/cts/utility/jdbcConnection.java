package com.cts.utility;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class jdbcConnection {
	private static final long serialVersionUID = 1L;
	
   public static Connection jsbConnec() throws ClassNotFoundException, SQLException
   {
	   Class.forName("com.mysql.jdbc.Driver");
	   Connection   con= DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeRegister","root","adm@123");
		return con;
		
   }
}
