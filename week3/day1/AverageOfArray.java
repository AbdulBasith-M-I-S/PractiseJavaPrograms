package week3.day1;

public class AverageOfArray {
	
	public static void main(String[] args) {
		
		/*Write a java program to find the average of the numbers in an array.
		input: int[] array= {20, 30, 25, 35, -16, 60, -100};
		output: Average: 7*/
		
		int[] array1= {20, 30, 25, 35, -16, 60, -100};
		
		//1st approach
		System.out.println("1st approach");
		//for loop
		int sum = 0;
		for (int i = 0; i < array1.length; i++) {
			sum = sum + array1[i];
		}
		System.out.println("Average");
		System.out.println(sum/array1.length);
		
		
		//2nd approach
		System.out.println("2nd approach");
		//for each
		int sum2 = 0;
		for (int eachNum : array1) {
			sum2 = sum2 + eachNum;
		}
		System.out.println("Average");
		System.out.println(sum2/array1.length);
		
	}

}
