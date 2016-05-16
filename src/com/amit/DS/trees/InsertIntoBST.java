package com.amit.DS.trees;

public class InsertIntoBST {
	
	//Node is defined as :
	 class Node {
	    int data;
	    Node left;
	    Node right;
	 }
	    
	    

	 Node Insert(Node root,int value)
	    {
	        Node cur = root;
	        Node n = new Node();
	        n.data = value;
	        if(root == null){
	            root = n;
	            return n;
	        }
	    
	        while(true){
	         
	            if(value > cur.data){
	              if(cur.right == null){
	                  cur.right = n;
	                  break;
	              }else {
	                  cur = cur.right;
	              }
	            }else {
	                 if(cur.left == null){
	                 cur.left = n;
	                     break;
	                 }else {
	                     cur = cur.left;
	                 }
	                
	            }
	        
	        }
	    return root;
	       
	    }



}
