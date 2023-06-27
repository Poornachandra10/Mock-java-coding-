package string_Programs;

import java.util.Scanner;

public class Vowel_Consonent_Counts {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int vCount=0;
		int cCount=0;
		System.out.println("Enter a word to find vowel and consonent \n counts in that word");
		String str=sc.nextLine();
		str=str.toLowerCase();
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch =='u') {
				vCount++;
			}else if(ch >= 'a' && ch <= 'z') {
				cCount++;
			}
		}
		System.out.println("Vowels count in the word :"+str+" ="+vCount);
		System.out.println("Consonents count in the word :"+str+" ="+cCount);
	}

}
