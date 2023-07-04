package com.kk.training;

public class OverridingChild extends OverridingParent{

	
	 
	@Override
	public void dessert (int a) {
		
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		OverridingParent result = new OverridingChild();
		result.order();
		result.dessert(123);
	

	}

}
