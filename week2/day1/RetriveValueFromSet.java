package week2.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RetriveValueFromSet {

	public static void main(String[] args) {
		
		//1st approach (Using Set and List)
		System.out.println("1st approach");
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		set1.add(8);
		set1.add(9);
		List<Integer> list1 = new ArrayList<>(set1);
		System.out.println(list1.get(6));
		
		//2nd approach (for each loop)
		System.out.println("2nd approach");
		for (Integer eachNum : list1) {
			if(eachNum==7) {
		System.out.println(eachNum);		
			}
		}
		
		//Lambda function
		System.out.println("3rd approach");
		Set<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		set2.add(7);
		set2.add(8);
		set2.add(9);
		//Lamda function is applicable to java 1.8
		set2.forEach((eachNum) -> {
			if (eachNum == 7)
				System.out.println(eachNum);
		});

	}

}
