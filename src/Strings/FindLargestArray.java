package Strings;

import java.util.Arrays;

public class FindLargestArray {

	public static void main(String[] args) {
       
		int[] numbers={10,20,30,43,54,76,-87,-45};
		int largest=numbers[0];
		int smallest=numbers[0];
		for(int i=1;i<numbers.length;i++){
			if(numbers[i]>largest){
				largest=numbers[i];
			}
			else
				if(numbers[i]<smallest){
					smallest=numbers[i];
				}
		}
		System.out.println("\nArray values is::" +Arrays.toString(numbers));
		System.out.println("largest values is::" +largest);
		System.out.println("smallest values is::" +smallest);
		}

}
