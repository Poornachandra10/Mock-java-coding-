package java_Basic_Programs;

import java.util.Scanner;

public class Q2_finding_Prime_or_Not {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		int temp;
		boolean isPrime=true;
	System.out.println("enter a nuim to check its prime or not");
		int num=sc.nextInt(); 
	sc.close();
	for(int i=2; i<=num/2; i++) {
		temp=num%i;
		if(temp==0) {
			isPrime=false;
			break;
		}
	}
		
	if(isPrime==true)	
		System.out.println(num+" is a prime number");
	else
		System.out.println(num +" is not a prime number");
	}

}
