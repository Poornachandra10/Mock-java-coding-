import java.util.HashMap;
import java.util.Map;

public class July_26 {

	public static void main(String[] args) {
//**************************************************************
//		// swap numbers
//		int a = 10;
//		int b = 5;
//		int c;
//		System.out.println("before swapping a val is: " + a);
//		System.out.println("before swapping b val is: " + b);
//		a = a + b;// 10+5=15
//		b = a - b;// 15-5=10
//		a = a - b; // 15-10=5
//		System.out.println("a val " + a);
//		System.out.println("b val " + b);
//
////using temp variable
//		System.out.println("using temp variable and swaping");
//
//		int x = 12;
//		int y = 6;
//		int temp;
//
//		System.out.println("before swapping x val is: " + x);
//		System.out.println("before swapping y val is: " + y);
//
//		temp = x; // temp is 12
//		x = y;// x is 6
//		y = temp;
//		System.out.println("after swapping x val is: " + x);
//		System.out.println("after swapping y val is: " + y);
//***************************************************************************
//		String str1 = new String("Hello there"); 
//		String str2 = new String("ByeBye"); 
//		System.out.println(str1==str2);
		// output false
//**********************************************
	//Find the Occurrence of Words in a String 
		
	String str="Akila akila Akila akila";
	
	Map<String, Integer>hashMap=new HashMap<>();
	
	String[] words=str.split(" ");
	
	for(String word :words) {
		
		Integer integer=hashMap.get(word);
		if (integer == null)
			hashMap.put(word, 1);
		else
		{
			hashMap.put(word, integer+1);
			
		}
		
			
		
	}
	
	System.out.println(hashMap);
//*****************************************************
	
	//program to find first non repeatable character in a string 
	
	
	
	
	
	
	}

}
