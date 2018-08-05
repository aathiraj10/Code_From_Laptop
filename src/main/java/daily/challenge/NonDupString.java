package daily.challenge;

import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class NonDupString {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter any String");
		String inString = obj.nextLine();
		obj.close();
		String outString="" ;
		//String oString;
		//outString[0] = inString.charAt(0);
		char a[]=inString.toLowerCase().replace(" ","").toCharArray();
		for (int i=0; i<a.length;i++)
		{
			if(outString.indexOf(a[i])==-1)
		//	if(!outString.contains(a[i])+"")	
			{
				outString = outString + a[i];
			}
		}

	System.out.println(outString);
	}

}
