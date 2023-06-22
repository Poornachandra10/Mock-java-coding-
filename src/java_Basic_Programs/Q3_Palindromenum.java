package java_Basic_Programs;

import java.util.Scanner;

public class Q3_Palindromenum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a num to check its Palindrome num or not");
		int num = sc.nextInt();
		int reverse = 0;
		int user_num = num;
		while (num != 0) {
			reverse = reverse * 10 + num % 10;
		num = num / 10;
		}
		
		if(user_num==reverse) {
			System.out.println(reverse +" its is a plaindrome");
		}else {
			System.out.println(reverse +" its is not a plaindrome");
		}
		sc.close();

	}

}
