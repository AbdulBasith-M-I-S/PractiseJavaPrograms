package week1.day2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaterUName {
	public static void main(String[] args) {
		
	
	
	/*Write a java program to validate the given username is valid or not
	Input: "Balaji1"
	output: false
	Input: "Testleaf$123"
	output: true
	Note: 
	1. It should contain minimum 8 characters.
	2. It allows alpha numeric characters and spl characters like . _ @ $*/
	
	String userName1 = "Balaji1";
	String userName2 = "Testleaf$123";
	String pattern2 = "[A-Za-z0-9._$@]{8,}";
	Pattern compiler2 = Pattern.compile(pattern2);
	//userName1
	Matcher matcher4 = compiler2.matcher(userName1);
	System.out.println(matcher4.matches());
	//userName2
	Matcher matcher5 = compiler2.matcher(userName2);
	System.out.println(matcher5.matches());
	
	
	}
}
