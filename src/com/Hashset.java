package com;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
            HashSet<Integer> hs=new HashSet<Integer>();
            hs.add(23);
            hs.add(34);
            hs.add(45);
            hs.add(56);
            hs.add(34);
            hs.add(null);
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
