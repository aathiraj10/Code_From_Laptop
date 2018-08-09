package daily.challenge;

import java.util.Scanner;

public class ReversingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number to be reversed");
		Scanner obj= new Scanner(System.in);
		int number= obj.nextInt();
		while(number>0)
		{
			int rev= number %10;
			number=number/10;
			System.out.print(rev);
		}
		obj.close();
	}

}
