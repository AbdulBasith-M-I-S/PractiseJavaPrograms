package week3.day2;

public class AddtionOfTwoMatrix {

	public static void main(String[] args) {
		
		/*Write a java program to add to matrices
		Matrices 1:
		1 2 3 
		4 5 6 
		7 8 9 
		Matrices 2:
		9 8 7 
		6 5 4 
		3 2 1 
		Solution: 
		10 10 10 
		10 10 10 
		10 10 10 */
		
		
		
		int[][] array2 = { {1,2,3} , {4,5,6} , {7,8,9} };
		int[][] array3 = { {9,8,7} , {6,5,4} , {3,2,1} };
		int[][] result = new int [3] [3] ;
		
		//To show Matrix 1 data
		System.out.println("Matrix1");
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		
		//To show Matrix 2 data
		System.out.println("Matrix2");
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3.length; j++) {
				System.out.print(array3[i][j] + " ");
			}
			System.out.println();
		}
		
		//To add Matrix 1 and Matrix 2
		System.out.println("Addition of Matrix 1 and Matrix 2");
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2.length; j++) {
						result[i][j] = array2[i][j] + array3[i][j];
						System.out.print(result[i][j] + " ");
					}
				System.out.println();
			}
		
		

		
		
	}

}
