package stringprograms;

public class ReverseSentence {

	public static void main(String[] args) {
		String str = "India is my country";
		String[] split = str.split(" ");
		//String replace = str.replaceAll(" ","");
		//String[] str1 = replace.split("");
		/*for (String s : str1) {
	System.out.print(s);

}
		 */
		for (String string : split) {
			String[] split2 = string.split("");
			for (int i = split2.length-1; i>=0; i--) {
				System.out.print(split2[i]);
			}
			System.out.print(" ");
		}

	}
}