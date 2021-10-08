package com.cody.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.cody.DAO.PumaSportDAO;
import com.cody.models.PumaSportsShoe;

@WebServlet(name ="PumaSportServlet", value = { "/PumaSportServlet "  , "/listPumaSport"})
public class PumaSportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	PumaSportDAO pumasportDAO = new PumaSportDAO();
	 
     public PumaSportServlet() {
        
    	 super();
       }

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
			String action = request.getServletPath();
			System.out.println(action);
			
		try {
			switch(action) {
			
		
			case "/listSportsShoe":
				listSportsShoe(request, response);
				
				default:
					listSportsShoe(request, response);
					break;
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
		
	private void listSportsShoe(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		List<PumaSportsShoe> pumasportshoeList = pumasportDAO.getAllPumaSportShoe();
		request.setAttribute("PumaSportShoe", pumasportshoeList)	;
		RequestDispatcher dispatcher = request.getRequestDispatcher("PumaSportsShoe.jsp");
		dispatcher.forward(request, response);
	
		
		
	}



}
		



