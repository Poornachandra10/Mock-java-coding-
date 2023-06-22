package preparingForMock_coding;

import java.util.Scanner;

public class Consonants_Vowels {

	public static void main(String[] args) {
	boolean isVowel=false;
	Scanner sc=new Scanner(System.in);
System.out.println("enter a char to check its a vowel or consonents: ");
	
	char ch=sc.next().charAt(0);
	sc.close();
	switch(ch) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':
	isVowel=true;
	}
	if(isVowel==true) {
		System.out.println(ch+" is a vowel");
	}else if((ch>='a' && ch<= 'z')||ch >='A' && ch <= 'Z') {
		System.out.println(ch+" is not a vowel, It is a consonent");
	}else 
	{
		System.out.println("Its num or spl char");
}
	}

}
