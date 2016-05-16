package com.amit.DS.trees;

public class HuffmanDecoding {
	
	
	   class Node{
	      public  int frequency; // the frequency of this tree
	       public  char data;
	       public  Node left, right;
	}    
	

	void decode(String S ,Node root)
	    {
	      Node cur = root;
	      StringBuilder sbuilder = new StringBuilder();
	    
	      while(!S.isEmpty()){
	       
	          if(S.charAt(0) == '0'){
	              cur = cur.left;
	              S = S.substring(1);
	          }else {
	              cur = cur.right;
	              S = S.substring(1);
	          }
	          if(cur.left == null && cur.right == null){
	              sbuilder.append(cur.data);
	              cur = root;
	          }
	          
	      }
	    System.out.println(sbuilder.toString());
	    
	    }

}
