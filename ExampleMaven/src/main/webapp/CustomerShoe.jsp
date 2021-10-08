<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Sporty Shoes</title>
</head>
<body>

<%@include file ="searchbookform.jsp" %>
<h2>Sporty Shoes </h2>
	<table border="1" cellpadding ="10" >
		<thead>
			<tr>
				<th>Shoe Brand</th>
				<th>Type</th>
				<th>Price</th>
				<th></th>
			</tr>
		</thead>
				<tbody>
					<c:forEach items ="${Customershoes}" var="cs">
					<tr>			<!-- Items above refers to what you set Attribute as in Servlet -->
						<td>${cs.csShoe}</td> 
						<td>${cs.csType}</td>
						<td>${cs.csPrice}</td>
						<td>
						<form method="get" action="Buy.jsp">
						<button type="submit" >Buy</button>
						</form>
						</td>
						
						
				        </tr>
				   	</c:forEach>
			</tbody>
		</table>
	</body>
</html>