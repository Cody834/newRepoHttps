<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Nike Sports Shoes</title>
</head>
<body>
		<%
			session = request.getSession(false);
		if(session.getAttribute("uname") == null){
			response.sendRedirect("AdminLogin.jsp");
		}
		%>
		


<br/>
<h2>Nike Sports Shoes </h2>
	<table border="1" cellpadding ="10" >
		<thead>
			<tr>
				<th>Shoe Name</th>
				<th>Type</th>
				<th>Price</th>
			</tr>
		</thead>
				<tbody>
					<c:forEach items="${NikeSportShoe}" var="nikeshoe">
					<tr>			<!-- Items above refers to what you set Attribute as in Servlet -->
						<td>${nikeshoe.nsName}</td>
						<td>${nikeshoe.nsType}</td>
						<td>${nikeshoe.nsPrice}</td>
						
						
				        </tr>
				   	</c:forEach>
			</tbody>
		</table>
	</body>
</html>