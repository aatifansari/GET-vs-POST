package com.skywalker.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		
		// get username and password from client
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<h2>Sorry I got your secret out. It's visible in the url</h2><br>");
		out.println("HELP - Use POST method<br><br>");
		
		
		// return username and password
		out.println("<strong>Username = </strong>" + userName+"<br><br>");
		out.println("<strong>Password = </strong>" + password+"<br><br>");
		
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{
		
		// get username and password from client
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<h2>Your secret is <strong>Safe</strong></h2><br>");
		
		// return username and password
		out.println("<strong>Username = </strong>" + userName+"</br>");
		out.println("<strong>Password = </strong>" + password+"</br>");
		
	}

}
