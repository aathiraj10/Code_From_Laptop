package stringprograms;

public class ReverseString {

	public static void main(String[] args) {
		String str= "Aathiraj";
		//int length = str.length();
		char[] charArray = str.toCharArray();
		int length = charArray.length;
		for (int i = str.length()-1; i >=0; i--) {
			System.out.print(charArray[i]);
			
		}
		System.out.println(" ");
		
		for (int i = length-1; i >=0; i--) {
			System.out.print(str.charAt(i));
			
		}
		
		System.out.println(" ");

		StringBuilder str1= new StringBuilder("Aathiraj");
		System.out.println("Third Method " +str1.reverse());
		
		
		System.out.println(" ");
		StringBuffer str2= new StringBuffer("Aathiraj");
		System.out.println("Fourth Method " +str2.reverse());
		
		
	}

}
