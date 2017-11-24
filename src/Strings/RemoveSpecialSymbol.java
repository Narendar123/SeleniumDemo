package Strings;

public class RemoveSpecialSymbol {

	public static void main(String[] args) {

		String str="@$%& java 1234 ^%#@@ operation in india^%$$";
		String s1=str.replaceAll("[^a-zA-Z0-9]","");
		System.err.println(s1);
	}

}
