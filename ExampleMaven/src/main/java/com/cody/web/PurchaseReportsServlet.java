package com.cody.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cody.DAO.PurchaseReportsDAO;
import com.cody.models.PurchaseReports;
@WebServlet(name ="PurchaseReportsServlet", value = { "/PurchaseReportsServlet " , "/listPurchaseReports"})
public class PurchaseReportsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	PurchaseReportsDAO purchasereportsDAO = new PurchaseReportsDAO();
	 
     public PurchaseReportsServlet() {
        
    	 super();
       }

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			String action = request.getServletPath();
			System.out.println(action);
			
		try {
			switch(action) {
			
			case "/listPuchaseReports":
				listPurchaseReports(request, response);
				
				default:
					listPurchaseReports(request, response);
					break;
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
		
	private void listPurchaseReports(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		List<PurchaseReports> purchasereportsList = purchasereportsDAO.getAllPurchaseReports();
		request.setAttribute("PurchaseReports", purchasereportsList)	;
		RequestDispatcher dispatcher = request.getRequestDispatcher("PurchaseReports.jsp");
		dispatcher.forward(request, response);
	
		
		
	}


	

}
		



