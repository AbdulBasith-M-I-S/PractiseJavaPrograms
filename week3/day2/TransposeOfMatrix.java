package week3.day2;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		
		/*1. Write a java program to transpose the matrix.
		Actual Matrix
		1 2 3 
		4 5 6 
		7 8 9 
		Transposed Matrix
		1 4 7 
		2 5 8 
		3 6 9*/
		
		
		int[][] array1 = { {1,2,3} , {4,5,6} , {7,8,9} };
		
		System.out.println("Actual Matrix");
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose Matrix");
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1.length; j++) {
			System.out.print(array1[j][i] + " ");	
			}
			System.out.println();
		}
		
		

	}

}
