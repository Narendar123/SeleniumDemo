package com;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist2 {

	public static void main(String[] args) {
     ArrayList<Integer> al1=new ArrayList<Integer>();
     al1.add(12);
     al1.add(13);
     al1.add(42);
     al1.add(12);
     al1.add(14);
     al1.add(63);
     al1.add(42);
     al1.add(56);
     al1.add(43);
     System.out.println("List:"+al1);
     Iterator it=al1.iterator();
     while(it.hasNext())
     {
    	 System.out.println(it.next());
     }
	}

}
