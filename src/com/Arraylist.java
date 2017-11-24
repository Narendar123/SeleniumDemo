package com;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
      ArrayList<String> al=new ArrayList<String>();
      al.add("Nokia");
      al.add("samsung");
      al.add("Lg");
      al.add("BPL");
      al.add("Micromax");
      al.add("null");
      al.add("sony");
      al.add("Motorla");
      al.add("Dell"); 
      al.add("samsung");
      System.out.println("List:"+al);
      al.remove("Lg");
      al.remove(1);
      System.out.println("List2:"+al);
      Iterator it=al.iterator();
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
	}

}
