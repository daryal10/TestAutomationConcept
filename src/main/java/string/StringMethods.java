package string;

import java.util.ArrayList;

public class StringMethods {

	public static void main(String[] args) {
		int k;
		String str = "Hello we will be working as a part of Agile methodology";

		String[] ar = str.split(" ");

		for (int i = 0; i < ar.length; i++) {
			ArrayList<String> a = new ArrayList<String>();
			a.add(ar[i]);

			for (k = 0; k < a.size(); k++) {
				System.out.println(a.get(k));
				if (a.get(k).contains("Agile")) {
					System.out.println("True");
				}

			}
		}

		// 1. indexOf()
		String s1 = "Hello World is the first statement printed in the java program";
		String s2 = "   hello World     ";
		String s3= new String("hello World");
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.contentEquals("Hello World"));
		System.out.println(s1.concat(s2));
		
		System.out.println(s1.indexOf('l'));
		System.out.println(s1.indexOf('l',s1.indexOf('l')+2));
		
		//to uppercase
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		//trim
		System.out.println(s2.trim());
		
		//replace
		System.out.println(s2.trim().replace(" ", ":"));
		
		//substring
		System.out.println(s2.substring(4,10));
		//System.out.println(s2.charAt(-1));
		
		//second occurrence of substring or 
		System.out.println(s1.indexOf("the")+1);


		
		
		
		

	}

}
