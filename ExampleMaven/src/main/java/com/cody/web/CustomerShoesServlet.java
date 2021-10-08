package com.cody.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cody.DAO.CustomerShoeDAO;
import com.cody.models.CustomerShoe;


@WebServlet(name ="CustomerShoesServlet", value = {"/CustomerShoesServlet" , "/listCustomerShoe" , "/SearchCustomerShoe"})
public class CustomerShoesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	CustomerShoeDAO customershoeDAO = new CustomerShoeDAO();
	 
  
    public CustomerShoesServlet() {
        super();
      

    }
    
   
    protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			String action = request.getServletPath();
			System.out.println(action);
			
		try {
			switch(action) {
			
			case "/SearchCustomerShoe":
				SearchCustomerShoe(request,response);
				
			case "/listCustomerShoe":
				listCustomerShoe(request, response);
				
				default:
					listCustomerShoe(request, response);
					break;
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
    
    public void SearchCustomerShoe(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    }
		
	public void listCustomerShoe(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		List<CustomerShoe> customershoeList = customershoeDAO.getAllCustomerShoe();
		request.setAttribute("Customershoes", customershoeList)	;
		RequestDispatcher dispatcher = request.getRequestDispatcher("CustomerShoe.jsp");
		dispatcher.forward(request, response);
	
		
		
	}

	

	


}
		