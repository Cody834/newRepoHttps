package com.cody.web;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.sql.*;
import java.util.*;

@WebServlet(name ="SearchBook", value = {"/SearchBookServlet"})
public class SearchBookServlet extends HttpServlet {
private static final long serialVersionUID = 1L;

public void doPost(HttpServletRequest request, HttpServletResponse response)
throws ServletException,IOException{
response.setContentType("text/html"); 
HttpSession session = request.getSession(true);
List customershoelist=new ArrayList();
Connection con = null;

String url = "jdbc:mysql://localhost:3306/";
String db = "sporty_shoes";
String driver = "com.mysql.jdbc.Driver";
String user = "root";
String pass = "Kigo2020$";

String csShoe="";
String csType="";
String csPrice="";
csShoe=request.getParameter("csShoe");
csType=request.getParameter("csType");
csPrice=request.getParameter("csPrice");
String sqlqueary="SELECT * FROM CustomerShoes WHERE csShoe LIKE '%%' ";
if(csShoe!=null && !(csShoe.equals(""))){
sqlqueary+=" and Shoe='"+csShoe+"'";
}
if(csType!=null && !(csType.equals("-1"))){
sqlqueary+=" and Type='"+csType+"'";
}
if(csPrice!=null && !(csPrice.equals("-1"))){
sqlqueary+=" and Price='"+csPrice+"'";
}

try{
Class.forName(driver);
con = DriverManager.getConnection(url+db, user, pass);
try{
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(sqlqueary);
while (rs.next()) {
List shoe=new ArrayList();
shoe.add(rs.getString(1));
shoe.add(rs.getString(2));
shoe.add(rs.getString(3));
customershoelist.add(shoe);
}
}catch (SQLException s){
System.out.println("SQL statement is not executed!");
}
}
catch (Exception e){
e.printStackTrace();
}
request.setAttribute("customershoelist",customershoelist); 
RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/searchbook.jsp");
dispatcher.forward(request, response); 
}

}