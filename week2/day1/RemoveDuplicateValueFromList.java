package week2.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateValueFromList {

	public static void main(String[] args) {

		/*1. How to remove duplicates from a list? 
		List = "A,B,C,D,A,D,E,F"*/

		//1st approach (Using List and Set)
		System.out.println("1st approach");
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("A");
		list1.add("D");
		list1.add("E");
		list1.add("F");
		Set<String> set1 = new LinkedHashSet<>(list1);
		System.out.println(set1);


		//2nd approach (Using list only)
		System.out.println("2nd approach");
		List<String> list2 = new ArrayList<>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.add("D");
		list2.add("A");
		list2.add("D");
		list2.add("E");
		list2.add("F");
		//Add list to listWithoutDup
		List<String> listWithoutDup = new ArrayList<>(list2);
		//Get each String and stored in String
		for (int i = 0; i < list2.size(); i++) {
			String eachString = list2.get(i);

			int count = 0;
			//listWithoutDup = String
			for (int j = 0; j < listWithoutDup.size(); j++) {
				if(listWithoutDup.get(j)==eachString) {
					count++;
				}
			}
			//If count is more than 1 remove the particular string
			if(count>1) {
				listWithoutDup.remove(eachString);
			}
		}
		System.out.println(listWithoutDup);


	}

}
