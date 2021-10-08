<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customers</title>
</head>
<body>
		<%
			session = request.getSession(false);
		if(session.getAttribute("uname") == null){
			response.sendRedirect("AdminLogin.jsp");
		}
		%>
		


<br/>
<h2>Customers</h2>
	<table border="1" cellpadding ="10" S>
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Surname</th> 
				<th>Date Joined</th>
				<th>Loyalty</th>
				
				
			</tr>
		</thead>
				<tbody>
					<c:forEach items="${Customers}" var="cust">
					<tr>			<!-- Items above refers to what you set Attribute as in Servlet -->
						<td>${cust.cuID}</td>
						<td>${cust.cuName}</td>
						<td>${cust.cuSurname}</td>
						<td>${cust.cuDate}</td>
						<td>${cust.cuLoyalty}</td>
						
				        </tr>
				   	</c:forEach>
			</tbody>
		</table>
	</body>
</html>