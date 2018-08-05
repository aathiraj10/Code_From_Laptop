package stringprograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class LearningMap {

	public static void main(String[] args) {
		//Get the String
		String companyName = "Hexaware Technologies";
		
		//Convert to Lower Case
		companyName = companyName.toLowerCase();
		
		
		//String to Char Array
		char[] charArray = companyName.toCharArray();
		
		//Declare a Map, LinkedHashMap maintains the input order
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		//For Each Loop
		for (char c : charArray) {
			if(map.containsKey(c)) //if the map contains the key
			{
				map.put(c,map.get(c)+1);
			}
			else
			{
				map.put(c,1);  //Valule will be added to the map
			}
		}
		System.out.println(map);
	}


}
