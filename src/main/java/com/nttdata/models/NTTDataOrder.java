package com.nttdata.models;

import java.util.ArrayList;

public class NTTDataOrder {
	private int orderID;
	private String orderReceiver;
	private String orderAddress;
	private NTTDataOrderDestination orderDestination;
	private ArrayList<NTTDataProduct> orderProducts;
	
	public NTTDataOrder() {
		super();
		// TODO Auto-generated constructor stub
		this.orderProducts = new ArrayList<NTTDataProduct>();
	}
	
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int i) {
		this.orderID = i;
	}
	public String getOrderReceiver() {
		return orderReceiver;
	}
	public void setOrderReceiver(String orderReceiver) {
		this.orderReceiver = orderReceiver;
	}
	public String getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}
	public NTTDataOrderDestination getOrderDestination() {
		return orderDestination;
	}
	public void setOrderDestination(NTTDataOrderDestination orderDestination) {
		this.orderDestination = orderDestination;
	}
	public ArrayList<NTTDataProduct> getOrderProducts() {
		return orderProducts;
	}
	public void setOrderProducts(ArrayList<NTTDataProduct> orderProducts) {
		this.orderProducts = orderProducts;
	}
	
	
}	
