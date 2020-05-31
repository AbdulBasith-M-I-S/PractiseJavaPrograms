package week3.day2;

public class Fibonacci {

	public static void main(String[] args) {

		/* Print the first 10 fibonacci numbers in reverse order
		output: 34,21,13,8,5,3,2,1,1,0*/
		
		//1st approach
		System.out.println("1st approach");
		int range=10, a= -1 , b = 1;
		int[] array = new int[range];
		
		for (int i = 0; i < range; i++) {
			array[i] = a+b;
			a=b;
			b=array[i];
		}
		
		for (int i = array.length-1; i >=0 ; i--) {
			System.out.print(array[i] + ",");
		}
		
		//2nd approach
		System.out.println("\n2nd approach");
		int num[] = new int[10]; 
        // assigning first and second elements 
        num[0] = 0; 
        num[1] = 1; 
        for (int i = 2; i < 10; i++) 
        { 
            // storing sum in the 
            // preceding location 
            num[i] = num[i - 2] + num[i - 1]; 
        } 
      
        for (int i = 10 - 1; i >= 0; i--)  
        { 
            // printing array in 
            // reverse order 
            System.out.print(num[i] +","); 
        }
		
		
		
		
		
	}

}
