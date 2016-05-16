package com.amit.searchAlgorithms;

public class BinarySearch {
	
	public static void binarySearchTest(){
		
		int [] array = {2, 5, 9, 11, 13, 14, 15, 17, 20, 24, 29, 31};
		System.out.println("Search result: "+search(array, 11));
		System.out.println("Search result: "+search(array, 24));
		System.out.println("Search result: "+search(array, 25));
	}
	
	
	
	public static boolean search(int[] array, int searchElement){
		boolean found = false;
		int size = array.length;
		int start = 0;
		int end = size -1;
		int middle = (start + end)/2;
		
		while(start <= end){
			middle = (start + end)/2;
			if(array[middle] > searchElement){
			   end = middle -1;	
			}else if(array[middle] < searchElement){
				start = middle + 1;
			}else if (array[middle] == searchElement){  // element is found
				System.out.println("Element Found at position:"+ middle);
				return true;
			}
		}
		return false;
	}
	
	

}
