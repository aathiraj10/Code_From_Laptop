package regexpression;

public class DollarSymbol {

	public static void main(String[] args) {
		String input = "My company has $1234567.89";
		String replaceAll = input.replaceAll("\\D", "");
		System.out.println(replaceAll);

		System.out.println(replaceAll.substring(0,7));
	}

}
