package daily.challenge;

import java.util.Scanner;

public class OddOrEven {
	
//	Odd or Even
public static void main(String[] args) {
	Scanner obj1= new Scanner(System.in);
	System.out.println("Enter any whole number");
	int number = obj1.nextInt();
	if (number %2==0)
	{
		System.out.println("The given number is EVEN");
	}
	else 
	{
		System.out.println("The given number is ODD");
	}
	obj1.close();
}
}
