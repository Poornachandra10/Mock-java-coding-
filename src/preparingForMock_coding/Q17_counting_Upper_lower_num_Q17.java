package preparingForMock_coding;

import java.util.Scanner;

public class Q17_counting_Upper_lower_num_Q17 {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("print your name to count the upper , lower, num and spl char in it: ");
	
	String s=sc.nextLine();
	int upper=0;
	int lower=0;
	int num=0;
	int spl=0;
	for(int i =0; i<s.length(); i++)	{
		char ch =s.charAt(i);
		if(ch>='A' && ch<='Z') {
			upper++;
		}
		else if(ch>='a' && ch<='z') {
			lower++;
		}
		else if(ch>='0' && ch<='9') {
			num++;
		}else {
			 spl++;
		}}
		System.out.println("total num of Upper case"+upper);	
		System.out.println("total num of  lower case"+lower);	
		System.out.println("total num of number"+num);	
		System.out.println("total num of special char"+spl);	
	
	sc.close();	
	}

}
