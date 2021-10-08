package com.cody.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cody.models.NikeSportsShoe;


public class NikeSportDAO {

	public List<NikeSportsShoe> getAllNikeSportShoe(){
		
		List<NikeSportsShoe> nikesportshoeList = new ArrayList<NikeSportsShoe>();
		
		try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sporty_shoes","root","Kigo2020$");
					
					PreparedStatement statement = connection.prepareStatement("SELECT * FROM NikeShoes;");
					
					ResultSet rs = statement.executeQuery();
					while(rs.next()){
						NikeSportsShoe shoes = new NikeSportsShoe();
						shoes.setNsName(rs.getString(1));
						shoes.setNsType(rs.getString(2));
						shoes.setNsPrice(rs.getString(3));
						System.out.println(shoes);
						nikesportshoeList.add(shoes);
					}
					connection.close();
					
				}catch (Exception ex) {
					System.out.println(ex.getMessage());
			}
			
				return nikesportshoeList;
				
			
			}

}