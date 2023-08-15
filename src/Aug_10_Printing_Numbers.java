import java.util.Scanner;

public class Aug_10_Printing_Numbers {

	public static void main(String[] args) {
//		// print int numbers uning while condition
//		int num = 0;
//		while (num < 100) {
//			num = num + 1;
//			System.out.print(num + " ");
//		}
//		System.out.println();
//*******************************************************

		// print int numbers uning if condition

//		int num1 = 1;
//		numCount(num1);
//
//	}
//
//	private static void numCount(int i) {
//		if (i <= 100) {
//
//			System.out.println(i);
//			numCount(i + 1);
//		}

		// ***************************

		// diamond stars

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//
//			}
//			System.out.println();
//		}
//		for (int i = 4; i >= 1; i--) {
//			for (int j = i; j >= 1; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//
//		System.out.println();

		// **************************
//		for(int i=1; i<=5; i++) {
//			for(int k=1; k<=5-i; k++) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
//			
//			}	System.out.println();
//		}for(int d= 1; d<=4;d++) {
//			for(int e=1; e<=d; e++) {
//				System.out.print(" ");
//			}for(int f =0; f<=4-d; f++)
//			{System.out.print("* ");
//			}
//		System.out.println();
//		}
// ********************************
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to print stars");
		int num=sc.nextInt();
				for(int i=1; i<=num; i++) {
			for(int j=1; j<=num-i; j++) {
				System.out.print(" ");
			}for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}System.out.println();
			}for(int i=1; i<=num-1; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=num-i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
		
		
}}
