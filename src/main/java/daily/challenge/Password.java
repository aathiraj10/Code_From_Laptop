package daily.challenge;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		System.out.println("Enter the password");
		Scanner obj = new Scanner(System.in);
		String password = obj.nextLine();
		System.out.println(password.length());
		System.out.println(password);
		passwordValidation(password);
		
		
		obj.close();
		
		
	}

	public static void passwordValidation(String pwd)
	{
	
		for(int i=0;i<=pwd.length();i++)
		{
			if(Character.isDigit(i))
			{
				System.out.println("The pw only has letters and numbers");
			}
		}
		
		if((pwd.length()>=10)&&(pwd.matches("[A-Z]")))
		{
			System.out.println("Good pwd");
		}
		else
		{
			System.out.println("Poor pwd");
		}
		
	}
}
