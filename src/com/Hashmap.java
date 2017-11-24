package com;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
    HashMap<String,Integer> hm=new HashMap<String, Integer>();
    hm.put("abcd", 12);
    hm.put("ab",23);
    hm.put("abc",54);
    hm.put("jkl",76);
    hm.put("xyz",87);
    hm.put("lmn",72);
    hm.put("ab",50);
    hm.put("imn",87);
    System.out.println(hm);
    hm.remove("imn");
    System.out.println(hm);
    Set s=hm.keySet();
    System.out.println(s);
    Iterator it=s.iterator();
    while(it.hasNext()){
    	Object obj=it.next();
    	String str=(String)obj;
    	System.out.println(hm.get(str));
    }
     Collection<Integer> c=hm.values();
     System.out.println(c);
     System.out.println(hm.containsKey("jkl"));
     System.out.println(hm.containsValue(50));
	}

}
