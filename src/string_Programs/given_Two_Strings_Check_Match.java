package string_Programs;

import java.util.Scanner;

public class given_Two_Strings_Check_Match {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string");
		String str1=sc.next();
		str1=str1.toLowerCase();
		System.out.println("enter the second string");
		String str2=sc.next();
		str2=str2.toLowerCase();
		int len1=str1.length();
		int len2=str2.length();
		boolean ans;
		sc.close();
		if(len1<len2) {
		String temp=str1.substring(len2-len1, len2);
		ans=true;
		}else {
			ans=false;
		}
		if(len2<len1) {
			String temp=str1.substring(len1-len2, len1);
			ans=true;
		}else {
			ans=false;
		}
		if(ans=true) {
			System.out.println("The secong string is present in first string");
		}else {
			System.out.println("The secong string is not presented in first string");
		}
	}

}
