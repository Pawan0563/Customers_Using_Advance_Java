package com.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String em=request.getParameter("email");
		 String ps=request.getParameter("pass");
		 
		 if(em.equals("Test@sunbasedata.com") &&ps.equals("Test@123")) {
			 
			 response.sendRedirect("user-list.jsp");
			 
		 }else {
			 response.sendRedirect("login.jsp");
			 
		 }

		 
	}

}
