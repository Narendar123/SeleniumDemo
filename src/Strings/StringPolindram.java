package Strings;

import java.util.Scanner;

public class StringPolindram {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("please enter a string");
     String str=s.nextLine();
     String reverse="";
     char[] chars=str.toCharArray();
     for(int i=chars.length-1;i>=0;i--)
     {
    	 reverse=reverse+chars[i];
     }
     System.out.println("Reverse string is:" +reverse);
     if(str.equalsIgnoreCase(reverse))
     {
    	 System.out.println("string is polindrome");
     }
     else
     {
    	 System.out.println("string is not polindrome");
     }
	}

}
