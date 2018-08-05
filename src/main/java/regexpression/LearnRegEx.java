package regexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegEx {

	public static void main(String[] args) {
		String str = "My Height is  5'11 ";

		//to print non digits
		String replace = str.replaceAll("\\d", "");
		System.out.println(replace);


		//to print non alphabets including spaces
		String replace1 = str.replaceAll("\\w", "");
		System.out.println(replace1);


		//to print only digits
		String replace2 = str.replaceAll("\\D", "");
		System.out.println(replace2);


		String input = "12346737";
		String pattern = "[0-9]{5,}";	
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(input);
		System.out.println(m.matches());

	}


}
