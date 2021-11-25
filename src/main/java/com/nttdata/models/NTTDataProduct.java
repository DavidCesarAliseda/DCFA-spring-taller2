package com.nttdata.models;

public class NTTDataProduct {
	private int productId;
	private String productName;
	private double productPricePVP;
	private double productPriceTaxLess;
	
	public NTTDataProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPricePVP() {
		return productPricePVP;
	}
	public void setProductPricePVP(double productPricePVP) {
		this.productPricePVP = productPricePVP;
	}
	public double getProductPriceTaxLess() {
		return productPriceTaxLess;
	}
	public void setProductPriceTaxLess(double productPriceTaxLess) {
		this.productPriceTaxLess = productPriceTaxLess;
	}
	
	
}
