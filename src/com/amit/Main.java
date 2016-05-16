/**
 * 
 */
package com.amit;

import com.amit.DS.Link;
import com.amit.algorithms.Algorithms;
import com.amit.algorithms.Permutation;
import com.amit.searchAlgorithms.BinarySearch;

/**
 * @author Amit_Gupta
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		Link.LinkedListTest();
		//BinarySearch.binarySearchTest();
        //Algorithms.permutation("ABC");
		
		Permutation  permutation = new Permutation("ABC");
		permutation.permute();
	
		
	//	String s = "ABC";
	//	System.out.println(""+s.substring(0, 0));

	}

}
