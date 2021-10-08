package com.cody.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cody.models.PurchaseReports;

public class PurchaseReportsDAO {
	
		public List<PurchaseReports> getAllPurchaseReports(){
			
			List<PurchaseReports> purchasereportsList = new ArrayList<PurchaseReports>();
			
			try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						
						Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sporty_shoes","root","Kigo2020$");
						
						PreparedStatement statement = connection.prepareStatement("SELECT * FROM purchasereports;");
						
						ResultSet rs = statement.executeQuery();
						while(rs.next()){
							PurchaseReports pus = new PurchaseReports();
							pus.setPuDate(rs.getString(1));
							pus.setPuItems(rs.getString(2));
							pus.setPuPrice(rs.getString(3));
							System.out.println(pus);
							purchasereportsList.add(pus);
						}
						connection.close();
						
					}catch (Exception ex) {
						System.out.println(ex.getMessage());
				}
				
					return purchasereportsList;
					
				
				}
		
		

		}




