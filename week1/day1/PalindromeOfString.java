package week1.day1;

public class PalindromeOfString {
	
	
	//2nd approach
	static boolean isPalindrome(String str) 
    { 
        // Pointers pointing to the beginning 
        // and the end of the string 
        int i = 0, j = str.length() - 1; 
  
        // While there are characters to compare 
        while (i < j) { 
  
            // If there is a mismatch 
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
  
            // Increment first pointer and 
            // decrement the other 
            i++; 
            j--; 
        } 
  
        // Given string is a palindrome 
        return true; 
    }
	
public static void main(String[] args) {
	
	/*Check for the palindrome of the given string:
	Input: "malayalam"
	output: Yes, Palindrome
	Input: "testleaf"
	output: No, not a palindrome*/
	

	//1st approach (reverse a String)
	System.out.println("1st approach");
	  String str1 = "malayalam"; 
	  String str2 = "testleaf";
	  String rev = "";
	
      int length1 = str1.length();
      int length2 = str2.length();
      //malayalam
      for ( int i = length1 - 1; i >= 0; i-- ) {
         rev = rev + str1.charAt(i);
      }
      
      if (str1.equals(rev)) {
         System.out.println(str1+" is a palindrome");
      }
      else {
         System.out.println(str2+" is not a palindrome");
      }
      
      //testleaf
      for ( int i = length2 - 1; i >= 0; i-- ) {
	         rev = rev + str2.charAt(i);
	      }
      //Conditon ? True Statement : False Statement
      System.out.println(str2.equals(rev)?str2 +"Yes, Palindrome" :str2 + "No, not aPalindrome");

    
     //2nd approach (sub method)
      System.out.println("2nd approach");
        String str3 = "malayalam"; 
		String str4 = "testleaf";
        if (isPalindrome(str3)) 
          System.out.println(str3+" "+"Yes, Palindrome"); 
        else
          System.out.println(str3+" "+"No, not a palindrome"); 
		if(isPalindrome(str4)) {
			System.out.println(str4+" "+"Yes, Palindrome");
		}
		else {
			System.out.println(str4+" "+"No, not a palindrome");
		}
		
	//3rd approach (string buffer)
		System.out.println("3rd approach");
		String str5 = "malayalam" ;
		String str6 = "testleaf" ;
		//malayalam
		StringBuffer stb1 = new StringBuffer(str5);
		String str5rev = stb1.reverse().toString();
		if(str5rev.equals(str5)) {
			System.out.println(str5+" "+"Yes, Palindrome");
		}
		else {
			System.out.println(str5+" "+"No, not a Palindrome");
		}
		//testleaf
		StringBuffer stb2 = new StringBuffer(str6);
		String str6rev = stb2.reverse().toString();
		System.out.println( str6rev.equals(str6)
							? str6 +" Yes, Palindrome" 
						    : str6 + " No, not a palindrome");
		
		
		
}
}
