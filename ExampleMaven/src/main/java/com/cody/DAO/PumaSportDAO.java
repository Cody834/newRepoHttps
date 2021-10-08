package com.cody.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cody.models.PumaSportsShoe;


public class PumaSportDAO {

public List<PumaSportsShoe> getAllPumaSportShoe(){
		
		List<PumaSportsShoe> pumasportshoeList = new ArrayList<PumaSportsShoe>();
		
		try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sporty_shoes","root","Kigo2020$");
					
					PreparedStatement statement = connection.prepareStatement("SELECT * FROM PumaShoes;");
					
					ResultSet rs = statement.executeQuery();
					while(rs.next()){
						PumaSportsShoe shoes = new PumaSportsShoe();
						shoes.setpName(rs.getString(1));
						shoes.setpType(rs.getString(2));
						shoes.setpPrice(rs.getString(3));
						System.out.println(shoes);
						pumasportshoeList.add(shoes);
					}
					connection.close();
					
				}catch (Exception ex) {
					System.out.println(ex.getMessage());
			}
			
				return pumasportshoeList;
				
			
			}
	
}
