package daily.challenge;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner obj1 = new Scanner(System.in);
System.out.println("Enter the first number");
int number1 = obj1.nextInt();
System.out.println("Enter the second number");
int number2 = obj1.nextInt();
System.out.println("Enter the third number");
int number3 = obj1.nextInt();
if ((number1 > number2)&&(number1 > number3))
{
	System.out.println(number1 + " is the largest Number");
}
if ((number2 > number1)&&(number2 > number3))
{
	System.out.println(number2 + " is the largest Number");
}
else
{
	System.out.println(number3 + " is the largest Number");
}	
	
	obj1.close();
	}

}
