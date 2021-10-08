<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Purchase Reports</title>
</head>
<body>
		<%
			session = request.getSession(false);
		if(session.getAttribute("uname") == null){
			response.sendRedirect("AdminLogin.jsp");
		}
		%>
		


<br/>
<h2>Purchase Reports </h2>
	<table border="1" cellpadding ="10" S>
		<thead>
			<tr>
				<th>Purchase Date</th>
				<th>Num of Items</th>
				<th>Total Price</th>
			</tr>
		</thead>
				<tbody>
					<c:forEach items="${PurchaseReports}" var="pur">
					<tr>			<!-- Items above refers to what you set Attribute as in Servlet -->
						<td>${pur.puDate}</td>
						<td>${pur.puItems}</td>
						<td>${pur.puPrice}</td>
						
						
				        </tr>
				   	</c:forEach>
			</tbody>
		</table>
	</body>
</html>