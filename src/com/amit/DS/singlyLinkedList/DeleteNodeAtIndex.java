package com.amit.DS.singlyLinkedList;

public class DeleteNodeAtIndex {
	
	
//	  Insert Node at the end of a linked list 
//	  head pointer input could be NULL as well for empty list
//	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	
	    // This is a "method-only" submission. 
	    // You only need to complete this method. 

	Node Delete(Node head, int position) {
	  // Complete this method
	    if(position == 0){
	        head = head.next;
	    }else {
	        int k = 0;
	        Node ptr = head;
	        while(k < (position -1)){
	            ptr = ptr.next;
	            k++;
	        }
	        ptr.next = ptr.next.next;
	    }

	    return head;
	}

}
