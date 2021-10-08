package com.cody.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cody.models.AdidasSportsShoe;


public class AdidasSportDAO {

	public List<AdidasSportsShoe> getAllAdidasSportShoe(){
		
		List<AdidasSportsShoe> adidassportshoeList = new ArrayList<AdidasSportsShoe>();
		
		try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sporty_shoes","root","Kigo2020$");
					
					PreparedStatement statement = connection.prepareStatement("SELECT * FROM AdidasShoes;");
					
					ResultSet rs = statement.executeQuery();
					while(rs.next()){
						AdidasSportsShoe shoes = new AdidasSportsShoe();
						shoes.setAdName(rs.getString(1));
						shoes.setAdType(rs.getString(2));
						shoes.setAdPrice(rs.getString(3));
						System.out.println(shoes);
						adidassportshoeList.add(shoes);
					}
					connection.close();
					
				}catch (Exception ex) {
					System.out.println(ex.getMessage());
			}
			
				return adidassportshoeList;
				
			
			}
	
	
}