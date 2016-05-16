package com.amit.algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Algorithms {
	
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	
    public static String reverseRecursively(String str) {
        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }
    
    /* * Find all duplicate characters in a String and print each of them. */ 
    public static void printDuplicateCharacters(String word) { 
    	char[] characters = word.toCharArray(); 
    	// build HashMap with character and number of times they appear in String 
    	Map<Character, Integer> charMap = new HashMap<Character, Integer>();
    	for (Character ch : characters) {
    		if (charMap.containsKey(ch)) { 
    			charMap.put(ch, charMap.get(ch) + 1);
    			} else {
    				charMap.put(ch, 1);
    				} 
    		} 
    	// Iterate through HashMap to print all duplicate characters of String
    	Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet(); 
    	System.out.printf("List of duplicate characters in String '%s' %n", word); 
    	for (Map.Entry<Character, Integer> entry : entrySet) { 
    		if (entry.getValue() > 1)
    		{
    			System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
    			} 
    		} 
    	} 
    
    
    public static void checkStringPalindrome(String str)
    {
       String original, reverse = "";
       original = str;
  
       int length = original.length();
  
       for ( int i = length - 1; i >= 0; i-- )
          reverse = reverse + original.charAt(i);
  
       if (original.equals(reverse))
          System.out.println("Entered string is a palindrome.");
       else
          System.out.println("Entered string is not a palindrome.");
  
    }



	

}
