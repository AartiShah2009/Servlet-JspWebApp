package com.cts.dao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.utility.jdbcConnection;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PreparedStatement pstmt = null;
	
		
		{
			String name=request.getParameter("un");
			String password = request.getParameter("pass");
			String address = request.getParameter("address");
			String cpassword = request.getParameter("cpass");
			
			try{
				
				Connection con=(Connection) jdbcConnection.jsbConnec();
				pstmt=(PreparedStatement) con.prepareStatement("insert into reg(empName,password,address,confirmPassword) values(?,?,?,?)");
				pstmt.setString(1,name);
				pstmt.setString(2,address);
				pstmt.setString(3,password);
				pstmt.setString(4,cpassword);
				if(password.equals(cpassword)){
				int x=pstmt.executeUpdate();				
				if(x>0)
				{
					
				
					RequestDispatcher rd = request.getRequestDispatcher("/registSuccess.jsp");
					rd.forward(request, response);
					
				}
				else
				{
					RequestDispatcher rd = request.getRequestDispatcher("/registFailure.jsp");
					rd.forward(request, response);
				}
				
				}
				else
				{
					RequestDispatcher rd = request.getRequestDispatcher("/registFailure.jsp");
					rd.forward(request, response);
				}
					
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
