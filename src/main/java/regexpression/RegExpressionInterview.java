package regexpression;

import java.util.Scanner;

public class RegExpressionInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj = new Scanner(System.in);
System.out.println("Enter the Input String");
String myString = obj.nextLine();
String newString  = myString.replaceAll("\\W", "");
System.out.println(newString);

	}

}
