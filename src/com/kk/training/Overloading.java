package com.kk.training;

public class Overloading {
	

	public void method(int a) {

		System.out.println(a);
	}

	public void method(int b, String a) {

		System.out.println(b + "  " +  a);
	}

	public void method(float a) {

		System.out.println(a);
	}

	public static void main(String[] args) {
  
		 Overloading load = new Overloading();
//		 sir s = new sir();
//		 collegue c = new collegue();
//		 friend f = new friend();
		 load.method(1000);
		 load.method(100, "karthi");
		 load.method(1212f);
		
		
	}

}
