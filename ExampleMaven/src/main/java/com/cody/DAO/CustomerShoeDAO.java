package com.cody.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cody.models.CustomerShoe;

public class CustomerShoeDAO {

public List<CustomerShoe> getAllCustomerShoe(){
		
		List<CustomerShoe> customershoeList = new ArrayList<CustomerShoe>();
		
		try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sporty_shoes","root","Kigo2020$");
					
					PreparedStatement statement = connection.prepareStatement("SELECT * FROM CustomerShoes;");
					
					ResultSet rs = statement.executeQuery();
					while(rs.next()){
						CustomerShoe shoes = new CustomerShoe();
						shoes.setCsShoe(rs.getString(1));
						shoes.setCsType(rs.getString(2));
						shoes.setCsPrice(rs.getString(3));
						System.out.println(shoes);
						customershoeList.add(shoes);
					}
					connection.close();
					
				}catch (Exception ex) {
					System.out.println(ex.getMessage());
			}
			
				return customershoeList;
				
			
			}
}
