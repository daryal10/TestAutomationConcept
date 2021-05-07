package string;

public class JavaExamples {

	public static void main(String[] args) {
		String str1 = String.format("%d", 15); // Integer value
		String str2 = String.format("%s", "BeginnersBook.com"); // String
		String str3 = String.format("%f", 16.10); // Float value
		String str4 = String.format("%x", 189); // Hexadecimal value
		String str5 = String.format("%c", 'P'); // Char value
		String str6 = String.format("%o", 189); // Octal value
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
	}

}
