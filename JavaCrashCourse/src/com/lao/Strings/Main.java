package com.lao.Strings;
import java.util.*;


public class Main {
    public static void main(String[] args) {
    	Set<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C"));

    	// Element to find
    	String searchElement = "B";

    	// Iterate through the Set to find and return the element
    	String foundElement = null;
    	
    	//For each Loop
    	
    	for (String element : set1) {
    	    if (element.equals(searchElement)) {
    	        foundElement = element;
    	        break;
    	    }
    	}

    	if (foundElement != null) {
    	    System.out.println("Found: " + foundElement);
    	} else {
    	    System.out.println("Element not found");
    	}

    		
    	
  
    }
}