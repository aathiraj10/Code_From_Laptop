package daily.challenge;


//importing scanner class for getting run time inputs
import java.util.Scanner;

public class PrimeNumber
{	

	//Main class
	public static void main(String[] args)
	{	
		//creating object and getting inputs during run time
		System.out.println("Please enter a number to find it is Prime number or not: ");
		Scanner obj = new Scanner(System.in);
		int number = obj.nextInt();
		int count=0, i;
		//declaring a variable
		
		//if condition when number = 0 and 1
		if(number==0 || number==1)
		{
			System.out.println("The Given number is NOT a Prime Number");
		}

		else
		{
			//using for loop to find the prime number
			for(i=2;i<=number/2;i++)
			{
				if(number%i==0)
				{
				count++;
				break;
				}
			
			}
			if(count==0)
			{
				System.out.println("The given number is PRIME NUMBER");
			}
			else
			{
				System.out.println("The given number is NOT a Prime Number");
			}
		}

		obj.close();

	}
}
