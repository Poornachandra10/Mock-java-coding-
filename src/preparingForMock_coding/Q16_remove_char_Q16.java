package preparingForMock_coding;

import java.util.Scanner;

public class Q16_remove_char_Q16 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter some name to replace the char 'a' to 'A'");
	
String S= sc.next();

System.out.println(S.replace('a', 'A'));
sc.close();
	}

}
