package daily.challenge;


import java.util.Scanner;

public class InputArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No elements to be inserted in the array:");
		int a = sc.nextInt();
		int arr[] = new int[a];
		for (int i = 1; i <= a; i++) {
			System.out.println("Enter the " + i + " value in array");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < a; i++) {
			for (int j = i + 1; j < a; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i] + " is a duplicate number in the given Array");
				}
			}
		}
	}
}
