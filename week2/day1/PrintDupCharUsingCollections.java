package week2.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDupCharUsingCollections {

	public static void main(String[] args) {
		
		/*Print duplicate character (many times as per words)
		Input: "When life gives you lemons, make lemonade"
		Output : e, ,i,e, , ,l,e,o,n,s, ,m,e, ,l,e,m,o,n,a,e,*/
		
		//1st approach (By using Set)
		System.out.println("1st approach");
		String text1 = "When life gives you lemons, make lemonade";
		Set<Character> set1 = new LinkedHashSet<>();
		//for loop
		for (int i = 0; i < text1.length(); i++) {
			//Print only Duplicate character using !
			//Without using !, it will print except duplicate character
			if(!set1.add(text1.charAt(i))) {
				System.out.print(text1.charAt(i)+",");
			}
		}
		//for each loop
		System.out.println();
		Set<Character> set2 = new LinkedHashSet<>();
		char[] charArray = text1.toCharArray();
		for (char c : charArray) {
			//Print only Duplicate character using !
			//Without using !, it will print except duplicate character
			if(!set2.add(c)) {
				System.out.print(c+",");
			}
		}
		
	
		//2st approach (By using List)
		System.out.println();
		System.out.println("2nd approach");
		
		String text2 = "When life gives you lemons, make lemonade";
		//for loop
		List<Character> list1 = new ArrayList<>();
		for (int i = 0; i < text2.length(); i++) {
			//IF Condition - Print only print all character except duplicate character using !
			//Without using !, it will print all character of text
			if(!list1.contains(text2.charAt(i))) {
				list1.add(text2.charAt(i));
			}
			//Else(duplicate character)
			else {
				System.out.print(text2.charAt(i)+",");
			}
		}
		
		//for each loop
		System.out.println();
		List<Character> list2 = new ArrayList<>();
		char[] charArray2 = text2.toCharArray();
		for (char c : charArray2) {
			//IF Condition - Print only print all character except duplicate character using !
			//Without using !, it will print all character of text
			if(!list2.contains(c)) {
				list2.add(c);
			}
			//Else(duplicate character)
			else {
				System.out.print(c+",");
			}
		}
		

	}

}
