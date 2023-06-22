package preparingForMock_coding;

import java.util.Scanner;

public class Q12_palindrome_Q12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	System.out.println("enter any string to print it is palindrome or not");
		String a=sc.next();
	String b="";
	for(int i=a.length()-1; i>=0; i--) {
		b=b+a.charAt(i);
	}
		System.out.println("Given word is reversed :"+b);
		if(a.equalsIgnoreCase(b)) {
			System.out.println(a+" Its palindrome");
		}else{
			System.out.println(a+" its not a palindrome");	
			}
	sc.close();	
		
	}
}
