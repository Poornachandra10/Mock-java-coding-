
package java_Basic_Programs;

import java.util.Scanner;

public class Q1_Fibonacci {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
//int n1=0, n2=1, n3,i;
//System.out.println("enter any num to print Fibonacci series");
//int num=sc.nextInt();
//System.out.print(n1+" "+n2);
//for(i=2; i<=num; i++) {
//	n3=n1+n2;
//	System.out.print(" "+n3);
//	n1=n2;
//	n2=n3;
//}


int n1=0, n2=1, n3,i;
System.out.println("enter num to print fibonacci series :");
int num=sc.nextInt();
System.out.print(n1+" "+n2);
for(i=2; i<=num; i++)
{
	n3=n1+n2;
	System.out.print(" "+n3);
	n1=n2;
	n2=n3;
}

	}

}
