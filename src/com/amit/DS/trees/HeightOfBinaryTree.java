package com.amit.DS.trees;

public class HeightOfBinaryTree {
	
  
    
    class Node{ 
       int data;
       Node left;
       Node right;
    }
   
   int height(Node root)
    {
     
       if(root == null){
       return -1;//height with respect to all edges
       //return 0; height with respect to all nodes
       }else {
       
       
       int lDepth = height(root.left);
       int rDepth = height(root.right);
       
       if(lDepth > rDepth){
       return lDepth + 1;
       }else {
           return rDepth + 1;
       }
       }
         
    }


}
