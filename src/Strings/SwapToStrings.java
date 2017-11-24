package Strings;

import java.util.Scanner;

public class SwapToStrings {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the first string::");
     String s1=sc.nextLine();
     System.out.println("enter the second string::");
     String s2=sc.nextLine();
     
     System.out.println("Before swaping");
     System.out.println("first string is::"+s1);
     System.out.println("first string is::"+s2);
     System.out.println("After swaping");
	  s1=s1+s2;
	s2=s1.substring(0,s1.length()-s2.length());
	s1=s1.substring(s2.length());
	 System.out.println("first string is::"+s1);
	 System.out.println("first string is::"+s2);
	
	
	
	}

}
