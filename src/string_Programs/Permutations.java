package string_Programs;

import java.util.Scanner;

public class Permutations {
	
	public static void printPermunts(String str, String ans) {
		if(str.length()==0) {
			System.out.println(ans+" ");
			return;
		}
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			
			String r=str.substring(0, i)+str.substring(i+1);
			printPermunts(r,ans+ch);
		}
	}

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		System.out.println("print a word that you would like to permutate");
		String str=sc.nextLine();
		
		//System.out.println(str+" ");
		printPermunts(str, " ");
	}

}
