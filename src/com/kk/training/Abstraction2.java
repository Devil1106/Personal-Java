package com.kk.training;

public class Abstraction2 extends Abstraction{
	
	
	public String kk = "kk training";
	
	@Override
	public void a() {
		System.out.println("Overrided a abstraction2 "+ kk);
	}
	
	@Override
	public void b() {
		System.out.println("Overrided b abstraction2 "+ kk);
	}
	

	public static void main(String[] args) {
		
		Abstraction ab = new Abstraction2();

		ab.a();
		ab.b();
	}

}
