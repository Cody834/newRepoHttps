package com.cody.models;

public class CustomerShoe {
	
	private String csShoe;
	private String csType;
	private String csPrice;
	
	public String getCsShoe() {
		return csShoe;
	}
	
	
	public void setCsShoe(String csShoe) {
		this.csShoe = csShoe;	
	}
	
	
	public String getCsType() {
		return csType;
	}
	
	
	public void setCsType(String csType) {
		this.csType = csType;
	}
	
	
	public String getCsPrice() {
		return csPrice;
	}
	
	
	public void setCsPrice(String csPrice) {
		this.csPrice = csPrice;
	}
	
	
	@Override
	public String toString() {
		return "CustomerShoe [csShoe=" + csShoe + ", csType=" + csType + ", csPrice=" + csPrice + "]";
	}
	
	

}
