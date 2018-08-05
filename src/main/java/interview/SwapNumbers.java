package interview;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
	int a=10, b=20;
	System.out.println("Before Swap "+ a +" " + b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swap "+ a +" " + b);
	
	}

}
