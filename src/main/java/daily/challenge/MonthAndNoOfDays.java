package daily.challenge;

import java.util.Scanner;

public class MonthAndNoOfDays {
	public static void main(String[] args) {
		Scanner obj1= new Scanner(System.in);
		System.out.println("Enter a Number");
		int number= obj1.nextInt();
		switch(number)
		{

		case 1 : 
		{
			System.out.println("The 1st month of the year is January \n Number of days in the month of January is 31");
			break;
		}
		case 2 : 
		{
			System.out.println("The 1st month of the year is February \n Number of days in the month of February is 38/29");
			break;
		}case 3 : 
		{
			System.out.println("The 1st month of the year is March \n Number of days in the month of March is 31");
			break;
		}case 4 : 
		{
			System.out.println("The 1st month of the year is April \n Number of days in the month of April is 30");
			break;
		}case 5 : 
		{
			System.out.println("The 1st month of the year is May \n Number of days in the month of May is 31");
			break;
		}case 6 : 
		{
			System.out.println("The 1st month of the year is June \nNumber of days in the month of June is 30");
			break;
		}case 7 : 
		{
			System.out.println("The 1st month of the year is July \n Number of days in the month of July is 31");
			break;
		}case 8 : 
		{
			System.out.println("The 1st month of the year is August \n Number of days in the month of August is 31");
			break;
		}case 9 : 
		{
			System.out.println("The 1st month of the year is September \n Number of days in the month of September is 30");
			break;
		}case 10 : 
		{
			System.out.println("The 1st month of the year is October \n Number of days in the month of October is 31");
			break;
		}case 11 : 
		{
			System.out.println("The 1st month of the year is November \n Number of days in the month of November is 30");
			break;
		}case 12 : 
		{
			System.out.println("The 1st month of the year is December \n Number of days in the month of December is 31");
			break;
		}
		default : 
		{
			System.out.println("Not a valid month ");
		}
		obj1.close();
		}
	}
}

