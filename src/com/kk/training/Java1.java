package com.kk.training;

public class Java1 {

	static int accountnumber = 1231233333;
	String name = "gayathri";
	long balance = 123456789955l;
	
   Java1(int accountnumber, String name){
	   
	   System.out.println("My acc number is "+ accountnumber + "  "+ "My name is "+ name);
	   
   }
	
	
	public static void main(String[] args) {
		Java account = new Java();
		account.getaccountnumber();
		accountnumber = 1000;
		account.getaccountnumber();
		
		//Java1 jv = new Java1(1999,"karthi");
	}

}
