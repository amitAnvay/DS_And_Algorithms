package com.amit.DS.singlyLinkedList;

public class GetNodeValueFromTail {
	
	
//	  Get Nth element from the end in a linked list of integers
//	  Number of elements in the list will always be greater than N.
//	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	
	    
	int GetNode(Node head,int n) {
	     // This is a "method-only" submission. 
	     // You only need to complete this method. 
	     int i = 0;
	     Node ptr = head;
	     
	     while(ptr != null){
	         i++;
	         ptr = ptr.next;
	     }
	    i--;
	    int k = 0;
	    while(head != null){
	        if(k == (i - n)){
	            break;
	        }
	        k++;
	        head = head.next;
	    }
	return head.data;
	}

}
