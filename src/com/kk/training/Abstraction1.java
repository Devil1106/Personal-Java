package com.kk.training;

public class Abstraction1 extends Abstraction {
	
	
	public int kk = 1999;
	
	@Override
	public void a() {
		System.out.println("Overrided a abstraction1 "+ kk);
	}
	
	@Override
	public void b() {
		System.out.println("Overrided b abstraction1 "+ kk);
	}

	public static void main(String[] args) {
		
		Abstraction ab = new Abstraction1();
		ab.a();
		ab.b();

	}

}
