package Strings;

import java.util.Scanner;

public class RevereNumber {

	public static void main(String[] args) {
		int n,reverse=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number:");
    n=sc.nextInt();
   while(n!=0)
   {
	   reverse=reverse*10+n%10;
	   n=n/10;
   }
         	     System.out.println("Reverse number is:" +reverse);
         	     long num1=43216;
         	     System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
         	     
         	     
	}

}
