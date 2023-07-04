package com.kk.training;

public class StringTypes {

	public static void main(String[] args) {
		
		String name = " kar,thik ";
		int number =1999;
		
		System.out.println(name.charAt(0));
		System.out.println(name.concat("keyan"));
		System.out.println(name.contains("i"));
		System.out.println(name.equals("kk"));
		System.out.println(name.equalsIgnoreCase("KARTHI"));
        System.out.println(name.indexOf("k"));
        System.out.println(name.isEmpty());
        System.out.println(name.indexOf("k", 5));
        System.out.println(name.length());
        System.out.println(name.substring(1));
        System.out.println(name.substring(1, 6));
        System.out.println(name.replace("a", "A"));
        System.out.println(name.replace("karthik", "Maha"));
        System.out.println(name.trim());
        System.out.println(String.valueOf(number));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(String.join("-", "Sales","Quotation"));
        System.out.println(String.join("/", "11","06","1999"));
        
         String [] splitit = name.split(",");
         for(String name1: splitit) {	
         System.out.println(name1);
	}
	}
}

