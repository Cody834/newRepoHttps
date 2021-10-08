<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Puma Sports Shoes</title>
</head>
<body>
		<%
			session = request.getSession(false);
		if(session.getAttribute("uname") == null){
			response.sendRedirect("Login.jsp");
		}
		%>
		


<br/>
<h2>Puma Sports Shoes </h2>
	<table border="1" cellpadding ="10" >
		<thead>
			<tr>
				<th>Shoe Name</th>
				<th>Style</th>
				<th>Price</th>
			</tr>
		</thead>
				<tbody>
					<c:forEach var="p" items="${PumaSportShoe}">
					<tr>
						<td>${p.pName}</td>
						<td>${p.pType}</td>
						<td>${p.pPrice}</td>
						
				        </tr>
				   	</c:forEach>
			</tbody>
		</table>
	</body>
</html>