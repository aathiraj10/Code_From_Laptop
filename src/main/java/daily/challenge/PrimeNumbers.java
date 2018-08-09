package daily.challenge;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner number = new Scanner(System.in);
		System.out.println("Enter the Value of n");
		int n = number.nextInt();
		for (int i=2;i<=n;i++)
		{
			boolean prime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					prime=false;
				}

			}

			if(prime==true)
			{
				
				System.out.print(i);
				System.out.print(",");
			}

		}

		number.close();
	}

}
