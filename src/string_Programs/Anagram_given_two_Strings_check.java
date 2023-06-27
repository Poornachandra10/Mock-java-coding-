package string_Programs;

import java.util.Arrays;

public class Anagram_given_two_Strings_check {

	public static void main(String[] args) {
		String str = "akila";
		String str2 = "akla";

		int s = str.length();
		int s1 = str2.length();
		if (s != s1) {
			System.out.println("Its not an anagram");
		}

		str = str.toLowerCase();
		str2 = str2.toLowerCase();

		char[] ch1 = str.toCharArray();
		char[] ch2 = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (Arrays.equals(ch1, ch2)) {
			System.out.println("The given words are anagram.");
		} else {
			System.out.println("The given words are not anagram.");
		}
	}

}
