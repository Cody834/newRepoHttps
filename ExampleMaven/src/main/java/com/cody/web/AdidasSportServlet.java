package com.cody.web;



import java.util.List;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cody.DAO.AdidasSportDAO;
import com.cody.models.AdidasSportsShoe;



@WebServlet(name ="AdidasSportServlet", value = { "/AdidasSportServlet " , "/listAdidasSport"})
public class AdidasSportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	AdidasSportDAO adidassportDAO = new AdidasSportDAO();
	 
     public AdidasSportServlet() {
        
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

		
		List<AdidasSportsShoe> adidassportshoeList = adidassportDAO.getAllAdidasSportShoe();
		request.setAttribute("AdidasSportShoe", adidassportshoeList)	;
		RequestDispatcher dispatcher = request.getRequestDispatcher("AdidasSportsShoe.jsp");
		dispatcher.forward(request, response);
	
		
		
	}

	

}
		



