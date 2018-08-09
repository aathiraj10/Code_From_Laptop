package daily.challenge;

public class MatrixProgram {

	public static void main(String[] args) {
		int a[][]= {{9,2,7},{11,12,15},{12,15,16}};
		int min = a[0][0];
		int max = a[0][0];
		int col=0;
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				if (a[i][j]<min)
				{
					min = a[i][j];
					col=j;
				}
			}
		}
		for(int i =0; i<3; i++)
		{
		
		if(a[i][col]>max)
		{
			max=a[i][col];
		}
		
		}
		System.out.println(max);

	}

}
