package java_Basic_Programs;

import java.util.Scanner;

public class Q3_Palindromenum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		System.out.println("enter a num to check its Palindrome num or not");
//		int num = sc.nextInt();
//		int reverse = 0;
//		int user_num = num;
//		while (num != 0) {
//			reverse = reverse * 10 + num % 10;
//		num = num / 10;
//		}
//		
//		if(user_num==reverse) {
//			System.out.println(reverse +" its is a plaindrome");
//		}else {
//			System.out.println(reverse +" its is not a plaindrome");
//		}
		
		
		System.out.println("enter any num to check it palidrome or not");
		int num=sc.nextInt();
		int rev=0;
		int user_num=num;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		if(user_num==rev) {
			System.out.println("it is a palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
		
		
		
		sc.close();

	}

}
