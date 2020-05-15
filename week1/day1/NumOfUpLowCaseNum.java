package week1.day1;

public class NumOfUpLowCaseNum {
	public static void main(String[] args) {


		/*Write a java program to find the number of Uppercase, lowercase, numbers 
        and spaces in the following String.
		Input: "1. It is Work from Home not Work for Home"*/


		//1st approach (conditon)
		System.out.println("1st approach");
		String text1 = "1. It is Work from Home not Work for Home" ;
		int upper = 0, lower = 0, number = 0, spaces = 0; 

		for(int i = 0; i < text1.length(); i++) 
		{ 
			char ch = text1.charAt(i); 

			if (ch >= 'A' && ch <= 'Z') 
				upper++; 
			else if (ch >= 'a' && ch <= 'z') 
				lower++; 
			else if (ch >= '0' && ch <= '9') 
				number++; 
			else
				spaces++; 
		} 

		System.out.println("No. of UpperCase = " + upper); 
		System.out.println("No. of LowerCase = " + lower);
		System.out.println("No. of WhiteSpaces = " + spaces);
		System.out.println("No. of Number = " + number); 



		//2nd approach (Character)
		System.out.println("2nd approach");
		String text2 = "1. It is Work from Home not Work for Home" ;
		int count =0, count2 = 0 , count3 = 0, count4 =0;
		for( int i=0; i<text2.length();i++){
			if(Character.isUpperCase(text2.charAt(i))) {
				count++;
			}
			else if(Character.isLowerCase(text2.charAt(i))) { 
				count2++;
			}
			else if(Character.isWhitespace(text2.charAt(i))) {
				count3++;
			}
			else if(Character.isDigit(text2.charAt(i))) {
				count4++;
			}

		}
		System.out.println("No. of UpperCase = "+ count);
		System.out.println("No. of LowerCase = " + count2);
		System.out.println("No. of WhiteSpaces = " +count3);
		System.out.println("No. of number = "+ count4);

		//3rd approach (RegEx)
		System.out.println("3rd approach");
		String text3 = "1. It is Work from Home not Work for Home" ;

		System.out.println("No. of UpperCase = "+ text3.replaceAll("[^A-Z]", "").length());
		System.out.println("No. of LowerCase = " + text3.replaceAll("[^a-z]", "").length() );
		System.out.println("No. of WhiteSpaces = "+ text3.replaceAll("\\S", "").length());
		System.out.println("No. of number = "+ text3.replaceAll("[^0-9]", "").length());

		//4th approach (ASCII)
		System.out.println("4th approach");
		String text4 = "1. It is Work from Home not Work for Home" ;
		int num = 0 , upperCase = 0 , lowerCase = 0, whiteSpaces = 0 ;
		for (int i = 0; i < text4.length(); i++) {
			int temp = text4.charAt(i);
			// 0 is 48 , 9 is 57
			if(temp >= 48 && temp <=57) {
				num++;
			}
			//A is 65 , Z is 90
			else if (temp >= 65 && temp <=90) {
				upperCase++;
			}
			//a is 97 , z is 122
			else if (temp >= 97 && temp <=122) {
				lowerCase++;
			}
			//spaces is 32
			else if (temp == 32) {
				whiteSpaces++;
			}
		}		
		System.out.println("No. of UpperCase = "+ upperCase);
		System.out.println("No. of LowerCase = " + lowerCase);
		System.out.println("No. of WhiteSpaces = " + whiteSpaces);
		System.out.println("No. of number = "+ num);
	
	
	}

}
