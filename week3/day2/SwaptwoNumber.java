package week3.day2;

public class SwaptwoNumber {

	public static void main(String[] args) {
		
		/*Write a java program to swap two numbers
		Input: a = 5, b= 10
		output: a = 10, b = 5*/
		
		//With using third variable
		System.out.println("1st approch");
		
		int a1 = 5;
		int b1 = 10;
		int x;
		System.out.println("Before Swapping a1 = " +a1);
		System.out.println("Before Swapping b1 = "+b1);
		
		x=a1;	// a1 = 5 value is stored in x = 5 
		a1=b1;  // b1=10 value is stored in a1 (It will change from 5 to 10 )
		b1=x;	// x = 5 value is stored in b1 (It will change form 10 to 5 )
		
		System.out.println("After Swapping a1 = "+a1);
		System.out.println("After Swapping b1 = "+b1);

		//Without using third variable
		System.out.println("2nd approach");
		int a2 = 5;
		int b2 = 10;
		System.out.println("Before Swapping a2 = " +a2);
		System.out.println("Before Swapping b2 = "+b2);
		
		a2 = a2+b2;  // a2 = (5+10) = 15
		b2 = a2-b2;	 // b2 = (15-10) = 5
		a2 = a2-b2;  // a2 = (15-5) = 10

		System.out.println("After Swapping a2 = "+a2);
		System.out.println("After Swapping b2 = "+b2);
		

	}

}
