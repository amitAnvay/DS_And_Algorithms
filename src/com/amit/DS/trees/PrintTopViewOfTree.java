package com.amit.DS.trees;

import java.util.Stack;

public class PrintTopViewOfTree {
	
	   class Node {
	       int data;
	       Node left;
	       Node right;
	       }
	
	void top_view(Node root)
	{
	    Node cur = root;
	    Stack<Node> stack = new Stack<Node>();
	     while(cur != null){
	         stack.push(cur);
	         cur = cur.left;
	     }
	    
	    while(!stack.isEmpty()){
	        Node n = stack.pop();
	        System.out.print(n.data+" ");
	    }
	    root = root.right;
	   while(root != null){
	     System.out.print(root.data+" ");
	       root = root.right;
	   }
	  
	}
}
