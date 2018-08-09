package daily.challenge;

import java.util.Scanner;

public class SumOfArray {
	public static void main(String[] args) {
		Scanner obj1= new Scanner(System.in);
		System.out.println("Enter the n numbers in the array");
		int n = obj1.nextInt();
		int sum=0;
		int a[]=new int[n];
		System.out.println("Enter the numbers in the array");
		for(int i=0;i<a.length;i++)
		{
			a[i] = obj1.nextInt();
		}
		for(int j=0;j<a.length;j++)
		{
			sum=sum+a[j];	
		}
	
		System.out.println(sum);
		obj1.close();
	}
	
}