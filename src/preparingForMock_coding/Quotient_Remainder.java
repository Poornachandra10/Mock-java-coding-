package preparingForMock_coding;

import java.util.Scanner;

public class Quotient_Remainder {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter any num to print Quotient and remainder");
		int num=sc.nextInt();
		System.out.println("enter any num divide the given number");
		int num1=sc.nextInt();
	sc.close();
	
	System.out.println("Quotient of the given input value: "+(num/num1));
	System.out.println("Afer dividing the numbers ,value of the Remainder : "+(num%num1));
	}

}
