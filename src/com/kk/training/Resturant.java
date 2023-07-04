package com.kk.training;

public class Resturant extends Registration{
	
	String Customername;
	String OrderName;
	
	Resturant (String Customer, String Order){
		
		Customername = Customer;
		OrderName = Order;		
		
	}
	
	public void getordermethod() {
		
		System.out.println("Customer name is :  "+ Customername +"  " + Customername + "  Order is : "+ OrderName);
		
	}
	

	public static void main(String[] args) {
		
		Resturant resturant = new Resturant("Zameer", "Briyani");
		resturant.getordermethod();

	}

}
