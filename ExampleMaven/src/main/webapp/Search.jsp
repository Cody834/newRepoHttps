<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP Page</title>
</head>
<body>
	<center>
		<table border="1">
			<tr>
				<th>Shoe Brand</th>
				<th>Type</th>
				<th>Price</th>
			</tr>S
	</table>
	String shoe = request.getParameter("csShoe");
			if (shoe !=null && shoe.length()<0){
			rs=statement.executeQuery("SELECT * FROM Customershoes WHERE csShoe = '" + csShoe +"'");
			}else{
			rs=statement.executeQuery("SELECT * FROM CustomerShoes");
</body>
</html>