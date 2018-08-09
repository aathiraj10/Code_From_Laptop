package daily.challenge;
import java.util.Scanner;
public class TwoNumberAndPattern {





	public static void main(String[] args) {
		Scanner obj1= new Scanner(System.in);
		System.out.println("Enter the starting number");
		int number1 = obj1.nextInt();
		System.out.println("Enter the ending number");
		int number2=obj1.nextInt();
		for(int c=number1;c<=number2;c++)
		{
			if(c%3==0)
			{
				if(c%5!=0)
				System.out.print("FIZZ\t");
			}
			if(c%5==0)
			{
				if(c%3!=0)
				System.out.print("BUZZ\t");

			}
			if((c%3==0)&&(c%5==0))
			{
				System.out.print("FIZZBUZZ\t");

			}
			if((c%3!=0)&&(c%5!=0))
			{
				System.out.print(c+"\t");

			}


		}


	}
}

