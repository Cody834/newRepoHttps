package com.cody.models;

public class PurchaseReports{
	
		private String puDate;
		private String puItems;
		private String puPrice;
		public String getPuDate() {
			return puDate;
		}
		public void setPuDate(String puDate) {
			this.puDate = puDate;
		}
		public String getPuItems() {
			return puItems;
		}
		public void setPuItems(String puItems) {
			this.puItems = puItems;
		}
		public String getPuPrice() {
			return puPrice;
		}
		public void setPuPrice(String puPrice) {
			this.puPrice = puPrice;
		}
		@Override
		public String toString() {
			return "PurchaseReports [puDate=" + puDate + ", puItems=" + puItems + ", puPrice=" + puPrice + "]";
		}
		
		
}
