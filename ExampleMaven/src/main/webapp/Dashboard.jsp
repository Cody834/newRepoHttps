<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DashBoard</title>
</head>
	<body>
		
		<h2>Sporty Shoes</h2>

			<a href = "NikeSportServlet">Nike Sport Shoes</a>
			<br></br>
			<a href = "AdidasSportServlet">Adidas Sport Shoes</a>
			<br></br>
			<a href ="PumaSportServlet">Puma Sport Shoes</a>
			<br></br>
			<a href ="CustomerServlet">Customers</a>
			<br></br>
			<a href ="PurchaseReportsServlet">Purchase Reports</a>
			<a href ="CustomerShoesServlet">CustomerShoes</a>
				<% 
				
					session = request.getSession(false);
					if(session != null){
						
					}else{
					response.sendRedirect("AdminLogin.jsp");
					}
				%>

	</body>
</html>