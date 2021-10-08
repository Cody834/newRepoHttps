package com.cody.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class AdminLoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
   
    public AdminLoginServlet2() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("Text/Html");

		String Username = request.getParameter("Username");
		String Password = request.getParameter("Password");
		
		if(Username.equals("Admin") && Password.equals("Admin123")) {
			// default getSession parameter is true ,
			//Thus it Creates New Session Object 
			HttpSession session = request.getSession(true);
			session.setAttribute("uname",Username);
			response.sendRedirect("Dashboard.jsp");
			
			out.println("Succesfull Login ");
		}else {
			out.println("Unsuccesful login ");
			RequestDispatcher dispatcher = request.getRequestDispatcher("AdminLogin.jsp");
			dispatcher.include(request, response);
			out.println("<h3 style = 'color:red ' >Invalid Credentials , Please Try Again </h3>");
		}
		
		
	}

}
