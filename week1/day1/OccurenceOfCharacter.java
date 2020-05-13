package week1.day1;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Write a Java Program to find the occurance of the character 'o' in the following String.
		Input: "You have no choice other than following me!"
		output: Occurance of o is: 6 */
		
		//1st approach (charArray)
		System.out.println("1st approach");
		int count = 0;
		String text1 = "You have no choice other than following me!" ;
		char[] charArray1 = text1.toCharArray();
			
						//for loop
		for (int i = 0; i < charArray1.length; i++) {
			if(charArray1[i] == 'o') {
				count = count +1;
				//count++; ++count ; count=+1;
			}
		}
		System.out.println("Occurance of o is:"+" "+ count);
		
		
						//for each loop
		int count2 = 0;
		for (char c : charArray1) {
			if(c == 'o') {
				count2 = count2+1;
			}
		}
		System.out.println("Occurance of o is:"+" "+ count2);
		
		
		//2nd approach (charAt)
		System.out.println("2nd approach");
		String text2 = "You have no choice other than following me!" ;
		int count3 = 0 ;
		for (int i = 0; i < text2.length(); i++) {
			if(text2.charAt(i)=='o') {
				count3 = count3 +1;
			}
		}
		System.out.println("Occurance of o is:"+" "+ count2);
		
		
		//3rd approach (replaceAll)
		System.out.println("3rd approach");
		String text3 = "You have no choice other than following me!" ;
		String replaceAll = text3.replaceAll("[^o]", "");
		System.out.println("Occurance of o is:"+" "+replaceAll.length());
	
		
		//4th approach (Map)
		System.out.println("4th approach");
		String text4 = "You have no choice other than following me!" ;
		Map<Character, Integer> mp = new LinkedHashMap <>();
		
		//for each loop
		char[] charArray2 = text4.toCharArray();

		for (char c : charArray2) {
			if (mp.containsKey(c)) {
				mp.put(c, mp.get(c)+1);
			}
			else {
			mp.put(c, 1);
			}
		}
		System.out.println("Occurance of :"+ mp);	
		System.out.println("occurance of 'o' is:" + mp.get('o'));
		
		
	}

}
