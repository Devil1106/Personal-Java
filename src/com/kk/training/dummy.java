package com.kk.training;

 

class dummy {

    public static void main (String[] args) {

       String name = "Karthi";
       String Reversename = "";
       char lilly;
       
       System.out.println("Original Name = " +name);
       
       for (int i=0;i<name.length();i++) {

    	   lilly = name.charAt(i);
    	   Reversename = lilly+Reversename;
    	  System.out.println("Reverse Name ="+  " " +Reversename);
   	   
    	   
    	   
       }
       System.out.println("Reverse Name = "+ " " +Reversename);
       
    }

}
