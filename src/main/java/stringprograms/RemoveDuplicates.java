package stringprograms;

import java.util.LinkedHashSet;
import java.util.*;

public class RemoveDuplicates {

	public static void main(String[] args) {
	String str = "google";
	
	System.out.println("First Metod");
	Set<Character> uniqueChar= new LinkedHashSet<Character>();
	char[] charArray = str.toCharArray();
	for (char c : charArray) {
		uniqueChar.add(c);
	}
	
	System.out.println(uniqueChar);

	
	System.out.println("Second Metod");
	List<Character> uniqueChar1= new ArrayList<Character>();
	char[] charArray1 = str.toCharArray();
	for (char c : charArray1) {
		if(!uniqueChar1.contains(c))
		uniqueChar1.add(c);
	}
	System.out.println(uniqueChar1);
	
	System.out.println("Third Method");
	char[] charArray3 = str.toCharArray();
	String output = "";

	for(int i=0; i<=charArray3.length-1;i++)
	{
		for(int j=1; j<=charArray3.length-1;j++)
		{
			if(charArray3[i]!=charArray3[j])
			{
			output += String.valueOf(charArray[i]);
;
			
			}
		
		}
		
	}
	System.out.print(output);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
