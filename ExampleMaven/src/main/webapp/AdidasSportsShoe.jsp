<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Adidas Sports Shoes</title>
</head>
<body>
		<%
			session = request.getSession(false);
		if(session.getAttribute("uname") == null){
			response.sendRedirect("Login.jsp");
		}
		%>
		


<br/>
<h2>Adidas Sports Shoes </h2>
	<table border="1" cellpadding ="10" >
		<thead>
			<tr>
				<th>Shoe Name</th>
				<th>Style</th>
				<th>Price</th>
			</tr>
		</thead>
				<tbody>
					<c:forEach var="ad" items="${AdidasSportShoe}">
					<tr>
						<td>${ad.adName}</td>
						<td>${ad.adType}</td>
						<td>${ad.adPrice}</td>
				 	</tr>
				   	</c:forEach>
			</tbody>
		</table>
	</body>
</html>