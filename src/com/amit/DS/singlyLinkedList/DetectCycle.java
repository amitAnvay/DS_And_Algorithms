package com.amit.DS.singlyLinkedList;

public class DetectCycle {
	
	
	
//	  Detect cycle in the list
//	  head pointer input could be NULL as well for empty list
//	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	
	  //Floyd’s Cycle-Finding Algorithm
	int HasCycle(Node head) {
	    
	    Node ptr1 = head;
	    Node ptr2 = head;
	    
	    while(ptr1 != null && ptr1.next != null){
	        ptr1 = ptr1.next;
	        ptr2 = ptr2.next.next;
	        
	        if(ptr1 == null || ptr2 == null){
	            return 0;
	          }
	        if(ptr1 == ptr2){
	            return 1;
	        }  
	    }
	    return 0;

	}

}
