<%@page import="java.util.*;"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Search</title>

</head>

<body>

<table align="center">

<%

List customershoelist=new ArrayList();

customershoelist=(ArrayList)request.getAttribute("customershoelist");

if(customershoelist!=null && customershoelist.size()>0 ){

%>

<h2 align="center">Shoe List</h2>

<tr>

<th>Shoe</th>

<th>Type</th>

<th>Price</th>

</tr>

<%

for(int i=0;i<customershoelist.size();i++){

List shoes=(List)customershoelist.get(i);

%>

<tr>

<td><%=shoes.get(1) %></td>

<td><%=shoes.get(2) %></td>

<td><%=shoes.get(3) %></td>

</tr>

<%

}

}else{

%>

No Shoes

<%}%>

</table>

</body>

</html>