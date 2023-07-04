package com.kk.training;

public class Returntype {
	
	
	public int amount=1000;
	
	public int collectamount() {
		System.out.println("amount collected"  +  amount);
		return amount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Returntype cash = new Returntype();
		int amt= cash.collectamount();

	   System.out.println("amount received " +amt);
	}

}
