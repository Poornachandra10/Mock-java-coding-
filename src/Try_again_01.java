import java.util.Arrays;
import java.util.Scanner;

public class Try_again_01 {

	public static void main(String[] args) {
	
Scanner sc=new Scanner(System.in);











//
////Sorting array program
//int a[]= {3,2,6,4,1,7,5};
//Arrays.sort(a);
//System.out.println("using quick sort method "+Arrays.toString(a));
//
//System.out.println("Using Bubble Sort");
//int temp;
//
//for(int i=0; i< a.length-1; i++) {
//	if(a[i]>a[i+1]) {
//		temp=a[i];
//		a[i]=a[i+1];
//		a[i+1]=temp;
//		i=i-1;
//	}
//    }
//	    
//System.out.print(Arrays.toString(a));






////num palindrom
//System.out.println("Enter a num to find the given num is palindrome or not :");
//int num=sc.nextInt();
//
//int rev=0;
//int user_num=num;
//while(num!=0) {
//	rev=rev*10+num%10;
//	num=num/10;
//}
//System.out.println("The reversed value is: "+rev);
//if(rev==user_num) {
//	System.out.println("It is a palindrome number");
//}
//else {
//	System.out.println("It is not a palindrome number");
//}





////finding leap year or not
//System.out.println("Enter year to find leap year or not: ");
//int year=sc.nextInt();
//
//if((year%4==0) && (year%100!=0) || (year%400==0)) {
//	System.out.println(year+" is leap year");
//}else {
//	System.out.println(year+" is not a leap year");
//}






//finding power value:
//System.out.println("Enter the number");
//int num=sc.nextInt();
//System.out.println("Enter the power value");
//int powerValue=sc.nextInt();
//
//System.out.println("power value of given question "+num+"^"+powerValue+" is:"+Math.pow(num, powerValue));
//
//System.out.println("finding big number"+Math.max(num, powerValue));
//
//System.out.println("finding min num"+Math.min(num, powerValue));
//
//System.out.println("to suptract the number"+Math.subtractExact(num, powerValue));
//
//System.out.println("multiplying both numbers"+Math.multiplyFull(num, powerValue));



////finding duplicate char
//System.out.println("Enter a string to find duplicate char in that string :");
//String str=sc.nextLine();
//str=str.toLowerCase();
//char[] ch=str.toCharArray();
//for(int i=0; i<=str.length()-1; i++) {
//	
//for(int j=i+1; j<=str.length()-1; j++) {
//	if(ch[i]==ch[j]) {
//		System.out.println(ch[i]+" is a duplicate value");
//		break;
//}
//}
//}



//System.out.println("Enter a char to find that is vowel or consonant");
//	
//	char ch=sc.next().charAt(0);
//	boolean ans=false;
//	switch (ch) {
//	case 'a':
//	case 'e':
//	case 'i':
//	case 'o':
//	case 'u':
//	case 'A':
//	case 'E':
//	case 'I':
//	case 'O':
//	case 'U':
//	ans=true;		
//		break;
//	}
//	if(ans==true) {
//		System.out.println("its a vowel ");
//	}else if((ch>='a'&& ch<='z')|| (ch>='A'&& ch<='Z')){
//		System.out.println("its a not a vowel , it is a consonant");
//	}
//	else {
//		
//		System.out.println("its a number or special character ");
//	}
//	
//	
	
	
	
	
sc.close();	
	}

}
