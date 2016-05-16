package com.amit.DS;

/*
 *  Java Program to Implement Singly Linked List
 */

import java.util.Scanner;

          /*  Class Node  */
   class Node {
	   
	int data;
	Node link;

	/* Constructor */
	public Node(int d, Node n) {
		data = d;
		link = n;
	}
}

/* Class linkedList */
class linkedList {
	protected Node start;
	protected Node end;
	public int size;

	/* Constructor */
	public linkedList() {
		start = end = null;
		size = 0;
	}

	/* Function to check if list is empty */
	public boolean isEmpty() {
		return start == null;
	}

	/* Function to get size of list */
	public int getSize() {
		return size;
	}

	/* Function to insert an element at begining */
	public void insertAtStart(int val) {
		Node nptr = new Node(val, null);
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		} else {
			nptr.link = start;
			start = nptr;
		}
	}

	/* Function to insert an element at end */
	public void insertAtEnd(int val) {
		Node nptr = new Node(val, null);
		size++;
		if (start == null) {
			start = nptr;
			end = start;
		} else {
			end.link = nptr ;
			end = nptr;
		}
	}

	/* Function to insert an element at position */
	public void insertAtPos(int val, int pos) {
		Node nptr = new Node(val, null);
		Node ptr = start;
		pos = pos - 1;
		for (int i = 1; i < size; i++) {
			if (i == pos) {
				Node tmp = ptr.link;
				ptr.link = nptr;
				nptr.link = tmp;
				break;
			}
			ptr = ptr.link;
		}
		size++;
	}

	/* Function to delete an element at position */
	public void deleteAtPos(int pos) {
		if (pos == 1) {
			start = start.link;
			size--;
			return;
		}
		if (pos == size) {
			Node s = start;
			Node t = start;
			while (s != end) {
				t = s;
				s = s.link;
			}
			end = t;
			end.link = null;
			size--;
			return;
		}
		Node ptr = start;
		pos = pos - 1;
		for (int i = 1; i < size - 1; i++) {
			if (i == pos) {
				Node tmp = ptr.link;
				tmp = tmp.link;
				ptr.link =tmp;
				break;
			}
			ptr = ptr.link;
		}
		size--;
	}

	/* Function to display elements */
	public void display() {
		System.out.print("\nSingly Linked List = ");
		if (size == 0) {
			System.out.print("empty\n");
			return;
		}
		if (start.link == null) {
			System.out.println(start.data);
			return;
		}
		Node ptr = start;
		System.out.print(start.data + "->");
		ptr = start.link;
		while (ptr.link != null) {
			System.out.print(ptr.data + "->");
			ptr = ptr.link;
		}
		System.out.print(ptr.data + "\n");
	}
}

/* Class SinglyLinkedList */
public class SinglyLinkedList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* Creating object of class linkedList */
		linkedList list = new linkedList();
		System.out.println("Singly Linked List Test\n");
		char ch;
		/* Perform list operations */
		do {
			System.out.println("\nSingly Linked List Operations\n");
			System.out.println("1. insert at begining");
			System.out.println("2. insert at end");
			System.out.println("3. insert at position");
			System.out.println("4. delete at position");
			System.out.println("5. check empty");
			System.out.println("6. get size");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to insert");
				list.insertAtStart(scan.nextInt());
				break;
			case 2:
				System.out.println("Enter integer element to insert");
				list.insertAtEnd(scan.nextInt());
				break;
			case 3:
				System.out.println("Enter integer element to insert");
				int num = scan.nextInt();
				System.out.println("Enter position");
				int pos = scan.nextInt();
				if (pos <= 1 || pos > list.getSize())
					System.out.println("Invalid position\n");
				else
					list.insertAtPos(num, pos);
				break;
			case 4:
				System.out.println("Enter position");
				int p = scan.nextInt();
				if (p < 1 || p > list.getSize())
					System.out.println("Invalid position\n");
				else
					list.deleteAtPos(p);
				break;
			case 5:
				System.out.println("Empty status = " + list.isEmpty());
				break;
			case 6:
				System.out.println("Size = " + list.getSize() + " \n");
				break;
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}
			/* Display List */
			list.display();
			System.out.println("\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}
}
