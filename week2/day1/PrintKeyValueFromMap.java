package week2.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrintKeyValueFromMap {

	public static void main(String[] args) {
		
		/*1. Write a Java Program to print the keys and values from the Map
		map = 
		{A=1, B=2, C=3, D=4, E=5}
		(Min 3 ways)
		output:
		A->1
		B->2
		C->3
		D->4
		E->5*/
		
		Map<String,Integer> map1 = new LinkedHashMap<>();
		map1.put("A", 1);
		map1.put("B", 2);
		map1.put("C", 3);
		map1.put("D", 4);
		map1.put("E", 5);
		
		//****************************************************/
		//1st approach (entrySet)
		System.out.println("1st approach");
		System.out.println(map1.entrySet());
		
		//2nd approach (for each Entry<> )
		System.out.println("2nd approach");
		for (Entry <String,Integer> eachEntry : map1.entrySet()) {
			System.out.println(eachEntry.getKey()+"=" +eachEntry.getValue());
		}
		
		//3rd approach (for each keySet() )
		System.out.println("3rd approach");
		for (String string1 : map1.keySet()) {
			String key = string1.toString();
            String value = map1.get(string1).toString();  
            System.out.println(key + " " + value);  
		}
		
		//4th approach (map.forEach)
		System.out.println("4th approach");
		map1.forEach((eachKey, eachValue) -> System.out.println(eachKey + "=" + eachValue));
		
		//5th approach (map.keySet().forEach()) & (map.values().foreach())
		System.out.println("5th approach");
		map1.keySet().forEach((eachKey)->System.out.println(eachKey));
		map1.values().forEach((eachValue)->System.out.println(eachValue));
		
		
		//6th approach ( Arrays.asList() )
		System.out.println("6th approach");
		System.out.println(Arrays.asList(map1));
		
		//7th appraoch ( Collection.singletonList() )
		System.out.println("7th approach");
		System.out.println(Collections.singletonList(map1));
		
		//8th approach - iterator interface - for each
		System.out.println("8th approach");
		Iterator<Entry<String, Integer>> iterator = map1.entrySet().iterator();
		iterator.forEachRemaining((eachEntry)->System.out.println(eachEntry.getKey()+"="+eachEntry.getValue() ) );
		
		//9th approach - iterator interface - while
		System.out.println("9th approach");
		Iterator<Entry<String, Integer>> iterator2 = map1.entrySet().iterator();
		while(iterator2.hasNext()) {
			Entry<String, Integer> eachEntry = iterator2.next();
			System.out.println(eachEntry.getKey()+"="+eachEntry.getValue());
		}

	}

}
