import java.util.Scanner;

public class stringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//*************************************************************************************************************************	
//		System.out.println("enter a word to find it is palindrome or not: ");
//		String str = sc.nextLine();
////printing the reverse of str:
//		// then checking it is palindrome or not
//		str = str.toLowerCase();
//		String reverse = "";
//		for (int i = str.length() - 1; i >= 0; i--) {
//			char ch = str.charAt(i);
//			reverse = reverse + ch;
//
//		}
//		System.out.println(reverse);
//		if (str.equals(reverse)) {
//			System.out.println("It is palindrome");
//		} else {
//			System.out.println("It ia not a palindrome");
//		}
//***********************************************************************************************************


		
		
		
//	 
		
		
	System.out.println("enter any num to find the num is palindrom or not");
	

int num=sc.nextInt();
int reverse=0;
int user_num=num;

while(num!=0) {
	reverse=reverse*10+num%10;
	num=num/10;
}
	System.out.println(reverse);
	if(user_num==reverse) {
		System.out.println(reverse+" is a palindrome number");
	}else {
		System.out.println(reverse+" is not a palindrome number");
	}
//**********************************************************************************	
		
		
		
		
		
		
		
		
		
		
		
//*******************************************************
		// reverse the word:
//	String reverse="";
//	for(int i=str.length()-1; i>=0; i--) {
//		char ch=str.charAt(i);
//		reverse=reverse+ch;
//	}
//
//	System.out.println(reverse);
//******************************************************
		
		
		
sc.close();
	}
}
