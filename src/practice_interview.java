import java.util.Scanner;

public class practice_interview {

	public static String removeX(String N, char X) {
		
		int index= -1;
		for (int i=0; i<N.length()-1; i++) {
			if(N.charAt(i)==X &&  N.charAt(i)-'0'< N.charAt(i+1)-'0') {
				index=i;
				break;
			}
		}
		if(index==-1) {
			for(int i=N.length()-1; i>=0; i--) {
				if(N.charAt(i)== X) {
					index=i;
					break;
				}
			}
		}
		String ans= "";
		for(int i=0; i< N.length(); i++) {
			if(i != index)
				ans=ans+ N.charAt(i);
		}
		
		return ans;
		
	}
	
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

//		 Write a function solution that, given an integer N, returns the maximum
//		 possible value obtainable by deleting one '5' digit from the decimal representation of N.
//		 It is guaranteed that N will contain at least one '5' digit.
//		Examples:
//		1. Given N = 15958, the function should return 1958.
//		2. Given N = -5859, the function should return -589.
//		3. Given N = -5000, the function should return 0. After deleting the '5,
//		the only digits in the number are zeroes, so its value is 0.
//System.out.println("enter some number");
		//String N=sc.nextLine();
		String N="-5859";
		System.out.println("enter some particular number");
		//char X=(char) sc.nextByte();
		char X='5';
		System.out.println(removeX(N, X));
		
	}

}
