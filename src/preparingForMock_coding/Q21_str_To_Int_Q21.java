package preparingForMock_coding;

import java.util.Scanner;

public class Q21_str_To_Int_Q21 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
System.out.println("enter string input");
String str=sc.nextLine();
sc.close();
try {
	int number =Integer.parseInt(str);
	System.out.println("value ="+number);
} catch (Exception e) {
	//System.out.println("Exception"+e);
	System.out.println("please enter valid input");
}
	}

}
