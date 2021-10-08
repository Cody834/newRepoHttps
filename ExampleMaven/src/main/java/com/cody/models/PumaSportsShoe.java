package com.cody.models;

public class PumaSportsShoe {
		
	
		private String pName;
		private String pType;
		private String pPrice;
		public String getpName() {
			return pName;
		}
		public void setpName(String pName) {
			this.pName = pName;
		}
		public String getpType() {
			return pType;
		}
		public void setpType(String pType) {
			this.pType = pType;
		}
		public String getpPrice() {
			return pPrice;
		}
		public void setpPrice(String pPrice) {
			this.pPrice = pPrice;
		}
		@Override
		public String toString() {
			return "PumaSportsShoe [pName=" + pName + ", pType=" + pType + ", pPrice=" + pPrice + "]";
		}
		
		
}
