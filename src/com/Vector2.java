package com;

import java.util.Vector;

public class Vector2 {

	public static void main(String[] args) {
       Vector<String> v1=new Vector<String>();
       v1.add(new String("ram"));
       v1.add(new String("raju"));
       v1.add(new String("ravi"));
       v1.add(new String("rajesh"));
       v1.add(new String("manoj"));
       v1.add(new String("akhil"));
       v1.add("ajay");
       v1.add(5,"lohith");
       System.out.println(v1);
       System.out.println(v1.size());
       v1.remove(3);
       v1.capacity();
       System.out.print("------------\n");
       System.out.println("elements display in for loop:");
       for(int i=0;i<v1.size();i++)
       {
    	   System.out.println(""+v1.get(i));
       }
       System.out.println("List display in for each loop:");
       for(String x : v1)
       {
    	   System.out.println(x);
       }
       
	}

}
