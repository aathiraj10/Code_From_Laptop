package daily.challenge;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		System.out.println("Armstrong Number");
		for (int n = 100; n<1000; n++)
		{
			int sum=0;
			int arm=0;
			int i=n;
			while(i!=0)
			{
				int cube= i%10;
				sum = cube * cube * cube;
				i=i/10;
				arm=arm+sum;
				
			}
			if (arm==n)
			{
				System.out.println(arm);	
			}
			
		}
		

	}

}
