package com.cody.models;

public class NikeSportsShoe {
			
			private String nsName;
			private String nsType;
			private String nsPrice;
			
			
			
			
			public String getNsName() {
				return nsName;
			}




			public void setNsName(String nsName) {
				this.nsName = nsName;
			}




			public String getNsType() {
				return nsType;
			}




			public void setNsType(String nsType) {
				this.nsType = nsType;
			}




			public String getNsPrice() {
				return nsPrice;
			}




			public void setNsPrice(String nsPrice) {
				this.nsPrice = nsPrice;
			}




			@Override
			public String toString() {
				return "NikeSportsShoe [nsName=" + nsName + ", nsType=" + nsType + ", nsPrice=" + nsPrice + "]";
			}
			
	}


