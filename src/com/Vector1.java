package com;

import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
     Vector<Integer> v=new Vector<Integer>();
     v.add(new Integer(11));
     v.add(new Integer(23));
     v.add(new Integer(34));
     v.add(new Integer(45));
     v.add(3, 56);
     v.add(67);
     v.add(98);
     v.add(new Integer(76));
     v.add(new Integer(98));
     v.add(new Integer(56));
     System.out.println(v);
     v.remove(6);
     System.out.println(v.size());
     System.out.print("...........");
     System.out.println("List using for Loop:");
     for(int i=0;i<v.size();i++)
     {
    	 System.out.println(v.get(i));
     }
     System.out.print("...........");
     System.out.println("List using for each Loop:");
     for(int x:v)
     {
    	 System.out.println(x+"");
     }
     System.out.print("...........");
     ListIterator LI=v.listIterator();
     System.out.println("List using forward direction:");
     while(LI.hasNext())
     {
    	 System.out.println(""+LI.next());
     }
     
     System.out.print("...........");
     ListIterator LI1=v.listIterator();
     System.out.println("List using backword direction:");
     while(LI.hasPrevious())
     {
    	 System.out.println(""+LI.previous());
     }
	}

}
