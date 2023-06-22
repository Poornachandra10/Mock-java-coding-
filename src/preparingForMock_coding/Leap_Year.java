package preparingForMock_coding;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year to check that is Leap year or not");
		int year=sc.nextInt();
		sc.close();
		if((year%4==0)&&(year%100!=0)||(year%400==0))
		System.out.println("specified year is a leap year");
		else
			System.out.println("specified year is not a leap year");	
		}

}
