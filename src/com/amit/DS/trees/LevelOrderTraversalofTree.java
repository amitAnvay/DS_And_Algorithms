package com.amit.DS.trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalofTree {

  
    
    class Node {
       int data;
       Node left;
       Node right;
       }
  
   void LevelOrder(Node root)
    {
       Queue<Node> q = new LinkedList<Node>();
       
       q.add(root);
       while(!q.isEmpty()){
           
           Node n = q.poll();
           
          System.out.print(n.data+" ");
           
           if(n.left != null){
               q.add(n.left);
           }
           if(n.right != null){
               q.add(n.right);
           }
           
       }
      
    }
	
}
