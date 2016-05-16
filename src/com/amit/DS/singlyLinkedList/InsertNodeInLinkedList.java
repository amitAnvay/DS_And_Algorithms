package com.amit.DS.singlyLinkedList;

public class InsertNodeInLinkedList {
	
	
//	  Insert Node at a given position in a linked list 
//	  head can be NULL 
//	  First element in the linked list is at position 0
//	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	
	    

	Node InsertNth(Node head, int data, int position) {
	   // This is a "method-only" submission. 
	    // You only need to complete this method. 
	    Node n = new Node();
	    n.data = data;
	  if(position == 0){
	      n.next = head;
	      head = n;
	  }else{
	      int pos = position;
	      int k = 1;
	      Node ptr = head;
	      while(k <pos){
	       ptr = ptr.next;
	          k++;
	      }
	      Node temp = ptr.next;
	      ptr.next = n;
	      n.next = temp;
	  }
	    return head;
	}

}
