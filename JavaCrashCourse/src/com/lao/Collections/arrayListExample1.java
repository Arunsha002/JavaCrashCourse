package com.lao.Collections;

import java.util.ArrayList;
import java.util.*;

public class arrayListExample1 {
    public static void main(String[] args) {
        // Use List interface and name the list L1
        List<String> L1 = new ArrayList<>();
        List<String> L2 = new ArrayList<>();
        L1.add("Arun");
        System.out.println(L1);
        L1.set(0,"A");
        System.out.println(L1);
        L1.add(1,"B");
        System.out.println(L1);
        L1.addAll(Arrays.asList("C","D","E","F"));
        System.out.println(L1);
        System.out.println(L1.subList(0, 5));
        L2.addAll(L1);
        System.out.println(L2);
        L2.subList(0, 5).clear();
        System.out.println(L2);
        L2.clear();
        System.out.println(L2);
        
        
        List<String> L3 = new ArrayList<>();
        L3.addAll(L1);
        System.out.println(L3);
        System.out.println(L3.get(0));
        L3.set(0, "a");
        System.out.println(L1);
        System.out.println(L2.isEmpty());
        
        //for (int i=0; i < L1.size(); i++)
        //		{
        //			System.out.println(L1.get(i));
       // }
        
        //for (String iterate1 : L1) {
        //	System.out.println(iterate1);
        //}
        
       // System.out.println(L1.subList(0, 3));
        
        /* ListIterator<String> iterator2 =L1.listIterator();
        
        while(iterator2.hasNext())
        		{
        	System.out.println(iterator2.next());
        		}
        
        while(iterator2.hasPrevious())
        {
        	System.out.println(iterator2.previous());
        } 
        
        Iterator<String> iterator3 = L1.iterator();
        
        while(iterator3.hasNext())
        {
        	System.out.println(iterator3.next());
        } */
        
        LinkedList<String> Linked1 = new LinkedList<>();
        Linked1.add("Link1");
      //  System.out.println(Linked1);
        Linked1.addFirst("Link0");
        Linked1.add(2, "Link2");
       // System.out.println(Linked1);
        Linked1.addLast("Link3");
       // System.out.println(Linked1);
        
        //for (int i=0; i<Linked1.size(); i++)
       // {
       // 	System.out.println(Linked1.get(i));
      //  }
        
        
       
      //for (String Linked2 : Linked1) {
      // System.out.println(Linked2);
     // }
      
      Iterator<String> Link1 = Linked1.iterator();
      
     // while(Link1.hasNext())
     // {
    //	  System.out.println(Link1.next());
     // }
  
      ListIterator<String> Link2 = Linked1.listIterator();
      {
    	  while (Link2.hasNext()) {
    		  System.out.println(Link2.next());
		}
      }
        
        
        
        
    
    }
}
