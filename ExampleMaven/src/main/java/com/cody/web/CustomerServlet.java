package com.cody.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


import javax.servlet.RequestDispatcher;

import com.cody.DAO.CustomerDAO;

import com.cody.models.Customers;



@WebServlet(name ="CustomerServlet", value = { "/CustomerServlet " , "/listCustomer"})
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	CustomerDAO customerDAO = new CustomerDAO();
	 
     public CustomerServlet() {
        
    	 super();
       }

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			String action = request.getServletPath();
			System.out.println(action);
			
		try {
			switch(action) {
			
			
			case "/listCustomer":
				listCustomer(request, response);
				
				default:
					listCustomer(request, response);
					break;
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
		
	private void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		List<Customers> customersList = customerDAO.getAllCustomers();
		request.setAttribute("Customers", customersList)	;
		RequestDispatcher dispatcher = request.getRequestDispatcher("Customers.jsp");
		dispatcher.forward(request, response);
	
		
		
	}

	

}
		


