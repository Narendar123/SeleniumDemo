package Strings;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateString {

	public static void main(String[] args) {
   String names[]=new String[]{"java","c","c++","php","linux","java","c"};
    for(int i=0;i<names.length;i++)
    {
    	for(int j=i+1;j<names.length;j++)
    	{
    		if(names[i].equals(names[j]))
    		{
    			System.out.println("string duplicats are::"+names[i]);
    		}
    	}
    }
    System.out.println("*****************");
    Set<String> values=new HashSet<String>();
    for(String name :names)
    {
    	if(values.add(name)==false)
    	{
    		System.out.println("string duplicats are::"+name);
    	}
    }
	}
}
