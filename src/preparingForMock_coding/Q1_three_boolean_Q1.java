package preparingForMock_coding;

import java.util.Scanner;



public class Q1_three_boolean_Q1 {

	public static void main(String[] args) {
		
Scanner sc= new Scanner(System.in);
boolean a,b,c;
System.out.println("enter any boolean val");
a=sc.nextBoolean();
System.out.println("enter any boolean val");
b=sc.nextBoolean();
System.out.println("enter any boolean val");
c=sc.nextBoolean();
sc.close();
if((a&&b||b&&c)||(c&&a))
{
	System.out.println("two values are true");
}else {
	System.out.println("two values are not true");
}
	}

}
