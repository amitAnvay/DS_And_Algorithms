package com.amit.bitwiseOperations;


public class BitwiseOperation {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	       int x = -4;
	       System.out.println(x>>1);   
	       int y = 4;
	       System.out.println(y>>1); 
	       
	       int p = 1;
	       int q = -1;
	       System.out.println("BitwiseOperation.main(-------)");
	       System.out.println(p>>>4);   
	       System.out.println(q>>>1); 
	       System.out.println(q>>>2); 
	       System.out.println(q>>>3); 
	       System.out.println(q>>>4); 
	       System.out.println(q>>>28); //00000001111
	       System.out.println(q>>>29); //00000000111
	       System.out.println(q>>>30); //00000000011
	       System.out.println(q>>>31);  //00000000001
	       System.out.println(q>>>32);  //00000000000
	       System.out.println(q>>>33); 
	       

	}

}
