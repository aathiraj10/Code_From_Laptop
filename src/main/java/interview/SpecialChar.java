package interview;

public class SpecialChar {

	public static void main(String[] args) {
		String str = "Hi this is my new Line and it has numbers 23456 special characters !@%^#&# and spaces  ";
		int number=0,alpha=0,spcl=0;
		String[] split = str.split("");
		//System.out.println(split);

		int length = str.length();
		String onlyNum = str.replaceAll("\\D", "");
		System.out.println(onlyNum.length());

		String onlyAlpha = str.replaceAll("[a-zA-z0-9 ]","");
		System.out.println(onlyAlpha.length());


	
	
	}
	

}
