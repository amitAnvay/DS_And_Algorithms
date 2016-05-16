package com.amit.DS.singlyLinkedList;

public class RemoveAllDuplicatesFromSortedList {
	/* Drier program to test above functions */
	public static void main(String args[])
	{
		LinkedList llist = new LinkedList();
		llist.push(20);
		llist.push(18);
		llist.push(16);
		llist.push(16);
		llist.push(15);
		llist.push(13);
		llist.push(13);
		llist.push(12);
		llist.push(11);
		llist.push(11);
		llist.push(11);
		
		System.out.println("List before removal of duplicates");
		llist.printList();
		
		llist.removeDuplicates();
		
		System.out.println("List after removal of elements");
		llist.printList();
	}
}

//Java program to remove duplicates from a sorted linked list
class LinkedList
{
	Node head; // head of list

	/* Linked list Node*/
	class Node
	{
		int data;
		Node next;
		Node(int d) {data = d; next = null; }
	}
    
	//remove all duplicates (e.g.   1->1->1>2->3->3->4->5->5->5->6   =  2->4->6)
	void removeDuplicates()
	{
     Node cur;
     
     if(head == null){
         return;
     }
     cur = head;
     boolean flag = false;
     Node prev = head;
     while(cur.next != null){
         
         if(cur.data == cur.next.data){
             cur.next = cur.next.next;
             flag = true;
         }else {
             if(flag){
                 if(prev == head){
                     head = prev.next;
                     prev = prev.next;
                 }else {
                 prev.next = prev.next.next;
                 }
             }
             else {
             prev = cur;
             }
             cur = cur.next;
             flag = false;
         }
         
     }
	}
					
	/* Utility functions */

	/* Inserts a new Node at front of the list. */
	public void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/* Function to print linked list */
	void printList()
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		} 
		System.out.println();
	}


} 


