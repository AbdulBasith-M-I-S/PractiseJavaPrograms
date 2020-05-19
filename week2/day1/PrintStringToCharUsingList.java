package week2.day1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintStringToCharUsingList {

	public static void main(String[] args) {
		
		/*Write a java program to print the list (Need 3 different answers)
		Input : "Bugatti Chiron"
		Output: [B,u,g,a,t,t,i, ,C,h,i,r,o,n]*/
		
		System.out.println("1st approach");
		String text3 = "Bugatti Chiron";	
		List<Character> list3 = new ArrayList<>();
		char[] charArray3 = text3.toCharArray();
		for (int i = 0; i < charArray3.length; i++) {
				list3.add(text3.charAt(i));	

		}
		
			//1st approach - for loop
		for (int i = 0; i < list3.size(); i++) {
			System.out.print(list3.get(i)+",");	
		}
		
			//2nd approach - for each loop
		System.out.println();
		System.out.println("2nd approach");
		for (Character c : list3) {
			System.out.print(c+",");
		}
		
		
			//3rd approach - while loop
		System.out.println();
		System.out.println("3rd approach");
		int count = 0;
		while (count>list3.size()) {
			System.out.println(list3.get(count));
			count++;
		}
		System.out.println(list3);
		
			//4th approach - Iterator Class
		System.out.println("4th approach");
		Iterator<Character> iterator = list3.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+",");
		
		}
		
	}

}
