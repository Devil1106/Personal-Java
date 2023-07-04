package com.kk.training;

public class OverridingParent {

	public void order() {
		
		System.out.println("Biryani");
	}
	
	protected void dessert(int a) {
		
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		OverridingParent results = new OverridingParent();
		results.dessert(1999);
		results.order();

	}

}
