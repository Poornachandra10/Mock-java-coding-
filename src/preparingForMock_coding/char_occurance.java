package preparingForMock_coding;

import java.util.Scanner;

public class char_occurance {
	static int count(String str, char str1) {
		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == str1) {
				result++;
			}
		}

		return result;

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String str=sc.nextLine();
		System.out.println("Enter a letter to find the find occurrence in the given String: ");
		char str1=sc.next().charAt(0);
		System.out.println("entered Strings are"+str+" "+str1);
		System.out.println("The char "+str1+" presented in "+count(str, str1)+" times");
		sc.close();
		
		
	
	}

}
