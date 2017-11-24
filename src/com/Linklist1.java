package com;

import java.util.LinkedList;
import java.util.List;

public class Linklist1 {

	public static void main(String[] args) {
      List linklist=new LinkedList<String>();
      linklist.add("23");
      linklist.add(34);
	  linklist.add("ram");
	  linklist.add(null);
      linklist.add(43);
	  linklist.add("hyderabad");
	  linklist.add(43.45);
	  linklist.add(null);
	  System.out.println("List:" +linklist);
	linklist.remove(2);
	linklist.remove(3);
	System.out.println(linklist.size());
	 System.out.println("List:" +linklist);
	}

}
