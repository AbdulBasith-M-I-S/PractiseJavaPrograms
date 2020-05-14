package week1.day1;

public class NumOfUpLowCaseNum {
	public static void main(String[] args) {
		
		
		/*3. Write a java program to find the number of Uppercase, lowercase, numbers 
        and spaces in the following String.
		Input: "1. It is Work from Home not Work for Home"*/
		
		
		//1st approach (conditon)
		System.out.println("1st approach");
	       String text1 = "It is Work from Home not Work for Home" ;
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
		String text7 = "It is Work from Home not Work for Home" ;
        int n = text7.length();
        int count =0, count2 = 0 , count3 = 0, count4 =0;
        for( int i=0; i<n;i++){
            if(Character.isUpperCase(text7.charAt(i))) {
                count++;
            }
            else if(Character.isLowerCase(text7.charAt(i))) { 
            count2++;
            }
            else if(Character.isWhitespace(text7.charAt(i))) {
            	count3++;
            }
            else if(Character.isDigit(text7.charAt(i))) {
            	count4 ++;
            }
            
        }
            System.out.println("No. of UpperCase = "+ count);
            System.out.println("No. of LowerCase = " + count2);
            System.out.println("No. of WhiteSpaces = " +count3);
            System.out.println("No. of number = "+ count4);
            
	}

}
