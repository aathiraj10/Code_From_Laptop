package daily.challenge;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		//System.out.println(num);
		int rev[]= new int[4];
		int i=0;
while(num!=0)
{
	rev[i]=num%10;
	num=num/10;
	i++;
}

for (int j=0; j<rev.length; j++)
{
	System.out.print(rev[j]);	
}
	
}

}
