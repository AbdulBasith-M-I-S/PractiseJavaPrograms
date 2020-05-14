package week1.day1;

public class SumOfNumInString {
	
	public static void main(String[] args) {
		
	
	/*1. Write a java code to find the sum of the given numbers
	Input: "asdf1qwer9as8d7"
	output: 1+9+8+7 = 25*/
	
	//1st approach (Character)
	System.out.println("1st approach");
	String text1 = "asdf1qwer9as8d7";
	int sum = 0;
	
	for(int i = 0; i < text1.length(); i++) {
	    if(Character.isDigit(text1.charAt(i))) {
	    	sum = sum + Integer.parseInt(text1.charAt(i) + "");
	    	//sum = sum + Character.getNumericValue(text1.charAt(i));
	    } 
	}
	System.out.println(sum);
	
		
	//2rd approach (RegEx)
	System.out.println("2nd approach");
	String text2 = "asdf1qwer9as8d7";
	String strNumber2 = text2.replaceAll("[\\D]", "");
	int num = Integer.parseInt(strNumber2);
	int sum2 = 0 ;
	while (num != 0) 
    { 
        sum2 = sum2 + num % 10; 
        num = num/10; 
    } 
	System.out.println(sum2);

}
}
