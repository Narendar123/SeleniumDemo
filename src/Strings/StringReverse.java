package Strings;

public class StringReverse {

	public static void main(String[] args) {
       String str="HelloIndia";
       String res="";
       System.out.println(str.length());
       for(int i=str.length()-1;i>=0;i--)
       {
    	   res=res+str.charAt(i);
       }
       System.out.println("String Reverse is:" +res);
       
       StringBuffer str1=new StringBuffer(str);
       StringBuffer reverse=str1.reverse();
       System.out.println(reverse);
       
      // res=new StringBuffer(str).reverse().toString();
      
	}

}
