package daily.challenge;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

//Multiplication table
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter the number for multiplication");
		int number1 = obj1.nextInt();
		System.out.println("Enter the number of multiples");
		int number2 = obj1.nextInt();
		for(int i=1;i<=number2;i++)
		{
			int ans = i * number1; 
			System.out.println( i + "*" + number1 + "=" + ans);

		}

		obj1.close();
	}

}
