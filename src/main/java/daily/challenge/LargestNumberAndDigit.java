package daily.challenge;

import java.util.Scanner;

public class LargestNumberAndDigit {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = obj.nextInt();
int i=number-1;
		System.out.println("Enter the digit");
		int digit = obj.nextInt();
		for ( i=number-1; i>=0; i--)
		{
			System.out.println("The number is "+i);
			while(i!=0)
			{
				
				if (i%10!=digit)
				{
					i=i/10;	
				}
				
			}

			

		}
		System.out.println("The largerst number is "+i);

		obj.close();
	}

}
