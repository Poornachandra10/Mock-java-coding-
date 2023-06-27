package string_Programs;

public class Convert_char_To_String_String_To_Char {

	public static void main(String[] args) {

		
		//program to convert char to String
		//Method 1: Using toString() method
		//       2.Using valueOf()method

		
		
		//Method 1:
		char ch='a';
		String str=Character.toString(ch);
		
		System.out.println("String is : "+str);
		
		//Method 2:
		String str2 =String.valueOf(ch);
		System.out.println("String is :"+str2);
		
		//converting string to character
		String str3="Hello";
		for(int i=0; i<str3.length(); i++) {
			char ch1=str3.charAt(i);
			System.out.println("Character at "+ i +" position : "+ch1);
		}
	}

}
