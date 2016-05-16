package com.amit.DS.singlyLinkedList;

public class ReverseLinkedList {
	
	
//	  Reverse a linked list and return pointer to the head
//	  The input list will have at least one element  
//	  Node is defined as  
	  class Node {
	     int data;
	     Node next;
	  }
	
	    // This is a "method-only" submission. 
	    // You only need to complete this method. 
	Node Reverse(Node head) {
	    
	    Node prev = null;
	    Node next = null;
	    Node cur = head;
	    while(cur != null){
	        next = cur.next;
	        cur.next = prev;
	        prev = cur;
	        cur = next;
	    }
	    head = prev;
	     return head;
	}

}
