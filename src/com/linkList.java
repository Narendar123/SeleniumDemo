package com;

import java.util.Iterator;
import java.util.LinkedList;

public class linkList {

	public static void main(String[] args) {
   LinkedList<student> ll=new LinkedList<student>();
     ll.add(new student(12));
     ll.add(new student(23));
     ll.add(new student(34));
     ll.add(new student(45));
     ll.add(new student(56));
     ll.add(new student(67));
     ll.add(new student(78));
     ll.add(new student(89));
     ll.add(new student(89));
     System.out.println(ll);
     ll.remove(4);
     ll.remove(6);
     System.out.println(ll);
     System.out.println("size:"+ll.size());
     Iterator it=ll.iterator();
     while(it.hasNext())
     {
    	 System.out.println(it.next());
     }
	}

}

class student {
	int rollNo;
	 student(int rollNo) {
		 this.rollNo=rollNo;
	}
	 public String toString(){
		return "" +rollNo;
		 
	 }
}