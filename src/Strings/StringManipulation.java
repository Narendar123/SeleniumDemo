package Strings;

public class StringManipulation {

	public static void main(String[] args) {
       String str="The rains have started here";
       String str1="The Rains Have started here";
       System.out.println(str.length());
       System.out.println(str.charAt(10));
       System.out.println(str.indexOf("v"));
       System.out.println(str.indexOf("rains"));
       System.out.println(str.indexOf('a', str.indexOf('a')+1));
       System.out.println(str.indexOf("room"));//-1
      
       //string comparison
       System.out.println(str.equals(str1));
       
       System.out.println(str.equalsIgnoreCase(str1));
       
       //substring
       System.out.println(str.substring(0,8));
       
       //trim
       String s="  Hello  World  ";
       System.out.println(s.trim());
       
       System.out.println(s.replace(" ", ""));
       
       String date="01-01-2017";
       System.out.println(date.replace("-","/"));
       
       //split:
       String test="Hello_World_Test_Selenium";
       String testval[]=test.split("_");
       for(int i=0;i<testval.length;i++){
    	   System.out.println(testval[i]);
       }
	}

}
