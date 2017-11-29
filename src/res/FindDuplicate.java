package res;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {

	String str[]=new String[]{"java","hyd","mumbai","ajay","java","kiran","tinku","hyd"};
	for(int i=0;i<str.length;i++)
	{
		for(int j=i+1;j<str.length;j++)
		{
			if(str[i].equals(str[j])){
				System.out.println("dupilcate numbers are:::"+str[i]);
			}
		}
	}
	Set<String> values=new HashSet<String>();
	for(String name : str){
		if(values.add(name)==false)
			System.out.println(name);
		{
			
		}
	}
	
	}

}
