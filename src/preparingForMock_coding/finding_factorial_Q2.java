package preparingForMock_coding;

import java.util.Scanner;

public class finding_factorial_Q2 {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		int fact=1;
		System.out.print("print any num to find factorial");
		int num=sc.nextInt();
		for( int i=1; i<=num; i++)
		{
			fact=fact*i;
			}
		System.out.println(fact);
		
sc.close();
}
}