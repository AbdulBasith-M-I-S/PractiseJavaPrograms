package week2.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfString {

	public static void main(String[] args) {
		
		
		/*Write a java program to find the count the characters in the given string
		String str = "Karma is powerful than God"
		{K=1, a=3, r=2, m=1,  =4, i=1, s=1, p=1, o=2, w=1, e=1, f=1, u=1, l=1, t=1, h=1, n=1, G=1, d=1}*/
		
		String text1 = "Karma is powerful than God" ;
		Map<Character,Integer> map1 = new LinkedHashMap<>();
		
		char[] charArray1 = text1.toCharArray();
		//for each
		for (char c : charArray1) {
			if(map1.containsKey(c)) {
				map1.put(c, map1.get(c)+1);
			}
			else {
				map1.put(c, 1);
			}
		}
		System.out.println(map1);
		//for loop
		for (int i = 0; i < text1.length(); i++) {
			if(map1.containsKey(text1.charAt(i))) {
				int count = map1.get(text1.charAt(i));
				map1.put(text1.charAt(i), count++);
			}
			else {
				map1.put(text1.charAt(i), 1);
			}
		}
		System.out.println(map1);

	}

}
