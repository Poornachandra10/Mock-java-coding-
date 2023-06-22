package preparingForMock_coding;

import java.util.Scanner;

public class Q23_differ_input_String_Boolean_Q23 {

	public static void main(String[] args) {
	String input;
	int ch1;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter your input");
	input=sc.next();
	try {
		ch1=Integer.parseInt(input);
		System.out.println("integer");
		return;
	} catch (NumberFormatException e) {
	}
try { 
	if(input.equalsIgnoreCase("true")||input.equalsIgnoreCase("false")) {
	System.out.println("boolean");
	return;
	}
	else {
		System.out.println("String");
		return;
	}}
catch(NumberFormatException e){
	}

	
}
}