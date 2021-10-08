package com.cody.models;

public class Customers{
		private int cuID;
		private String cuName;
		private String cuSurname;
		private String cuDate;
		private String cuLoyalty;
		public int getCuID() {
			return cuID;
		}
		public void setCuID(int cuID) {
			this.cuID = cuID;
		}
		public String getCuName() {
			return cuName;
		}
		public void setCuName(String cuName) {
			this.cuName = cuName;
		}
		public String getCuSurname() {
			return cuSurname;
		}
		public void setCuSurname(String cuSurname) {
			this.cuSurname = cuSurname;
		}
		public String getCuDate() {
			return cuDate;
		}
		public void setCuDate(String cuDate) {
			this.cuDate = cuDate;
		}
		public String getCuLoyalty() {
			return cuLoyalty;
		}
		public void setCuLoyalty(String cuLoyalty) {
			this.cuLoyalty = cuLoyalty;
		}
		@Override
		public String toString() {
			return "Customers [cuID=" + cuID + ", cuName=" + cuName + ", cuSurname=" + cuSurname + ", cuDate=" + cuDate
					+ ", cuLoyalty=" + cuLoyalty + "]";
		}
		
		
}