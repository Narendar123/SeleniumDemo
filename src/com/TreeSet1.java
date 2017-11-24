package com;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
        TreeSet<Integer> hs=new TreeSet<Integer>();
        hs.add(23);
        hs.add(34);
        hs.add(45);
        hs.add(56);
        hs.add(34);
        System.out.println("Set:" +hs);
        hs.remove(2);
        System.out.println("set:"+hs);
        Iterator it=hs.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        
	}

}
