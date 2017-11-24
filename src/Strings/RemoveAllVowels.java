package Strings;

import java.util.Scanner;

public class RemoveAllVowels {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any string: ");
      String inputstring=sc.nextLine();
     String  newinputstring=inputstring.replaceAll("[AEIOUaeiou]","");
     System.out.println("print the values::"+newinputstring);
      
	}

}
