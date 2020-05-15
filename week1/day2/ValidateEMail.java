package week1.day2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEMail {

	public static void main(String[] args) {
		
		/*Write a java program to verify whether the given String is valid email address.
		Input: "balaji.chandrasekaran@testleaf.com"
		output: true
		Input: "balaji.c@tunatap.co.uk"
		output: true
		Input: "naveen e@tl.com"
		output: false
		Note: Spl characters like . _ are only allowed*/
		
		String email1 = "balaji.chandrasekaran@testleaf.com" ;
		String email2 = "balaji.c@tunatap.co.uk" ;
		String email3 = "naveen e@tl.com";
		
		String pattern = "[a-z.]+@[a-z]+[a-z.]{2,}";
		Pattern compiler1 = Pattern.compile(pattern);
		
		//email1
		Matcher matcher1 = compiler1.matcher(email1);
		System.out.println(matcher1.matches());
		//email2
		Matcher matcher2 = compiler1.matcher(email2);
		System.out.println(matcher2.matches());
		//email3
		Matcher matcher3 = compiler1.matcher(email3);
		System.out.println(matcher3.matches());


	}

}
