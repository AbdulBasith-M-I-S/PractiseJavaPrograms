package week3.day1;

import java.util.Arrays;
import java.util.Collections;

public class SortAndReveseNumbers {

	public static void main(String[] args) {
		
	/*   Write a java program to sort it and reverse it.
	Input: int[] array = {5,1,33,79,22,11,45};
	output: 
	Sorted: {1,5,11,22,33,45,79}
	reversed: {79,45,33,22,11,5,1}  */
	
		
	//1st approach (Using Integer class)
	System.out.println("1st approach");
		//Sorted - Ascending
	Integer[] array1 = new Integer[] {5,1,33,79,22,11,45};
	Arrays.sort(array1);
	System.out.println("Sorted:");
	for (int i = 0; i < array1.length; i++) {
		System.out.print(array1[i]+",");
	}
	
		//Reversed 
	Arrays.sort(array1, Collections.reverseOrder());
	System.out.println("\nReversed:");
	for (int i = 0; i < array1.length; i++) {
		System.out.print(array1[i]+",");
	}
	
	
	//2nd approach (Using int[] array)
	System.out.println("\n2nd approach");
	int[] array2 ={5,1,33,79,22,11,45};
		//Sorted - Ascending
	Arrays.sort(array2);
	System.out.println("Sorted:");
	for (int i = 0; i < array2.length; i++) {
		System.out.print(array2[i]+",");
	}
	
		//Reversed
	System.out.println("\nReversed:");
	for (int i =array2.length -1 ; i >=0; i--) {
		System.out.print(array2[i]+",");
	}
	
	
	//3rd approach
	System.out.println("\n3rd approach");
			//Sorted - Ascending
	Integer[] array3 = new Integer[] {5,1,33,79,22,11,45};
	Arrays.sort(array3);
	System.out.println("Sorted : ");
	System.out.println(Arrays.asList(array3));    //method 1 to print the sorted value
	System.out.println(Arrays.toString(array3));  //method 2 to print the sorted value
			//Reversed
	System.out.println("Reversed : ");
	Collections.reverse(Arrays.asList(array3));
	System.out.println(Arrays.asList(array3));    //method 1 to print the reversed value
	System.out.println(Arrays.toString(array3));  //method 2 to print the reversed value
	}	
}
