package com.cody.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cody.models.Customers;



public class CustomerDAO {

	public List<Customers> getAllCustomers(){
		
		List<Customers> customersList = new ArrayList<Customers>();
		
		try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sporty_shoes","root","Kigo2020$");
					
					PreparedStatement statement = connection.prepareStatement("SELECT * FROM Customers;");
					
					ResultSet rs = statement.executeQuery();
					while(rs.next()){
						Customers cus = new Customers();
						cus.setCuID(rs.getInt(1));
						cus.setCuName(rs.getString(2));
						cus.setCuSurname(rs.getString(3));
						cus.setCuDate(rs.getString(4));
						cus.setCuLoyalty(rs.getString(5));
						System.out.println(cus);
						customersList.add(cus);
					}
					connection.close();
					
				}catch (Exception ex) {
					System.out.println(ex.getMessage());
			}
			
				return customersList;
				
			
			}
	
	

	}
