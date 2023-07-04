package com.kk.condition;

public class Ifelse {
	
	
	 String Tester="vivek";
	
	public void getresult() {
		
		 if (Tester.equals("vivek")) {
	    	   for (int i=1; i<=5; i++)
	    	   
	    	   System.out.println("No you are wrong");
	       }else if(Tester.equals("Mani")) {
	    	   System.out.println("No you are wrong");
	       }else
	    	   System.out.println("Yes you are right!!");
	}
	
	public static void main(String[] args) {
		Ifelse test = new Ifelse();
		test.getresult();
		
	}
}

