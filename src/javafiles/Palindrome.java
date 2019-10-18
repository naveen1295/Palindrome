package javafiles;

import java.util.Scanner;

public class Palindrome {

	static String original = "";
	static ReusableFunctions functions;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		functions = new ReusableFunctions();
		String cont = "";
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Enter a string/number to check if it is a palindrome");
			original = in.nextLine();

			if (functions.compareStrings(original, (functions.reverseString(original))))
				System.out.println("Entered string/number is a palindrome.");
			else
				System.out.println("Entered string/number isn't a palindrome.");

			System.out.println("Want to try another string/number? Y/N");
			cont = in.nextLine();
		} while (cont.equals("Y") || cont.equals("y"));
		in.close();

	}

}
