package com.cody.web;


import java.util.List;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cody.DAO.NikeSportDAO;
import com.cody.models.NikeSportsShoe;



@WebServlet(name ="NikeSportServlet", value = { "/NikeSportServlet " , "/listNikeSport"})
public class NikeSportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	NikeSportDAO nikesportDAO = new NikeSportDAO();
	 
     public NikeSportServlet() {
        
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

		
		List<NikeSportsShoe> nikesportshoeList = nikesportDAO.getAllNikeSportShoe();
		request.setAttribute("NikeSportShoe", nikesportshoeList)	;
		RequestDispatcher dispatcher = request.getRequestDispatcher("NikeSportsShoe.jsp");
		dispatcher.forward(request, response);
	
		
		
	}

	

	


}
		


