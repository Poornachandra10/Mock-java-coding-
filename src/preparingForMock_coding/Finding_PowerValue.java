package preparingForMock_coding;

import java.util.Scanner;

public class Finding_PowerValue {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("enter any num ");
		int number=sc.nextInt();
		System.out.println("enter any number find the power val of num");
		int p=sc.nextInt();
	sc.close();	
	
	double result=Math.pow(number, p);
		System.out.println(number+"^"+p+" = "+result);
		
		//without using Math.pow method
		//int number=2, p=2;
		//long result=1;
		
		//int i=p;
		//for(;i !=0; --i){
		//result*=number;
	    //}
		//System.out.println(number+"^"+p+" = "+result);
			
	}

}
