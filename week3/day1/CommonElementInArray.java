package week3.day1;

public class CommonElementInArray {

	public static void main(String[] args) {
		
		/* Write a java program to print the common numbers in between the two arrays.
		int[] array1 = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int[] array2 = { 1, 0, 6, 15, 6, 4, 7, 0 };*/
		
		int[] array1 = { 1, 2, 5, 5, 8, 9, 7, 10 };
		int[] array2 = { 1, 0, 6, 15, 6, 4, 7, 0 };
		
		//for loop
		System.out.println("1st approach");
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if(array1[i]==array2[j]) {
					System.out.println("Common Element" +array1[i]);
				}
			}       //for j
		}           //for i
		
		
		//for each
		System.out.println("2nd approach");
		for (int eachNum1 : array1) {
			for (int eachNum2 : array2) {
				
				if(eachNum1==eachNum2) {
					System.out.println("Common Element" +eachNum1);
				}
			}    //for each array2
		}        //for each array1

		
		
	}

}
