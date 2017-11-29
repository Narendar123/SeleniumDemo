package Strings;

public class StringPattern {

	public static void main(String[] args) {
        String str="JAVAJ2EE";
        char [] c=str.toCharArray();
	for(int i=0;i<c.length;i++){
		for(int j=0;j<i;j++){
			System.out.print(c[j]);
		}
		System.out.println();
	}
	
	}

}
