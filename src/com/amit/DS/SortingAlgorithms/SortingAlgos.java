package com.amit.DS.SortingAlgorithms;

import com.amit.algorithms.Permutation;

public class SortingAlgos {
	
	/**
	 * Traverse through the array, and place the smallest element in the left by swapping, repeat this by the no. of elements.
	 * 
	 * @param arr
	 * @return
	 */
    public static int[] doSelectionSort(int[] arr){
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
    
    /**
     * Compare adjecent elements while iterating from left to right, swap elements if left one is greater than right.
     * In the process move the largest element to the right. Iterate this for all the elements.
     * @param a
     * @param n
     */
	public static void bubble_srt(int a[], int n) {
		int i, j, temp = 0;
		for (i = 0; i < n; i++) {
			for (j = 1; j < (n - i); j++) {
				if (a[j - 1] > a[j]) {
					temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	/**
	 * 
	 * @param a
	 * @param n
	 */
	public static void insert_sort(int a[], int n){
		
		for(int i = 1; i < n; i++){
			int temp = a[i];
			int j;
			for(j = i - 1; j >= 0 && a[j] > temp; j-- ){
				a[j + 1] = a[j];
			}
			a[j + 1] = temp;
		}
		
	}
	/**
	 *   e.g. array [7,2,5,3,4,6], innitially hole = 1, value = 2, 
	 *   Dividing the array into sorted array [7] and unsorted array [2,5,3,4,6]
	 *   Pick a hole from unsorted array and sort it in the sorted array by shifting elements there
	 * @param a
	 * @param n
	 */
	public static void insertionSort(int a[], int n){
		for(int i = 1; i < n; i++){
			int hole = i;
			int value = a[i];
			while(hole > 0 && a[hole -1]> value){
				a[hole] = a[hole - 1];
				hole = hole -1;
			}
			a[hole] = value;
		}
	}
	
	
    private int[] array;
    private int[] tempMergArr;
    private int length;
	
    	
    private void doMergeSort(int lowerIndex, int higherIndex) {
        
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }
 
    /**
     * Merge both the parts making the resulting array sorted in ascending order
     * @param lowerIndex
     * @param middle
     * @param higherIndex
     */
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
 
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {//do we need to run this while loop for j too
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
    }

    /**
     * sort the elements such that the elements less than pivot(middle element) are to the left and elements greater than pivot
     * are to the right.
     * @param arr
     * @param left
     * @param right
     * @return
     */
    int partition(int arr[], int left, int right)
    {
          int i = left, j = right;
          int tmp;
          int pivot = arr[(left + right) / 2];
         
          while (i <= j) {
                while (arr[i] < pivot)
                      i++;
                while (arr[j] > pivot)
                      j--;
                if (i <= j) {
                      tmp = arr[i];
                      arr[i] = arr[j];
                      arr[j] = tmp;
                      i++;
                      j--;
                }
          };
         
          return i;//should we return pivot or i
    }
     
    void quickSort(int arr[], int left, int right) {
          int index = partition(arr, left, right);
          if (left < index - 1)
                quickSort(arr, left, index - 1);
          if (index < right)
                quickSort(arr, index, right);
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
      int a[] = {2,5,4,7,9,1,3,6};
      bubble_srt(a, a.length);
      //insertionSort(a, a.length);
      for(int val: a){
    	  System.out.println("SortingAlgos.main()"+val);  
      }
	}  
	

}
