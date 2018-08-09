package daily.challenge;

import java.util.Scanner;

//import java.util.Scanner;

public class SwappingWithTwoVariables {

	public static void main(String[] args) {
		Scanner obj1=new Scanner(System.in);
		System.out.println("Enter the interger number");
		int num1 = obj1.nextInt();
		System.out.println("Enter the second interger number");
		int num2 = obj1.nextInt();
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("The number is swapped to "+num1);
		System.out.println("The number is swapped to "+num2);
	}

}
