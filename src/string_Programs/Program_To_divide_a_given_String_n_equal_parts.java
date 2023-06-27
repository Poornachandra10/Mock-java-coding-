package string_Programs;

public class Program_To_divide_a_given_String_n_equal_parts {

	public static void main(String[] args) {
		String str="akilanPoorna";
		int len=str.length();
		// It is simple way :I found this way
//		int avgLen=len/2;
//		if(len%2==0) {
//			System.out.println("The given word can be divide equally");
//		}else {
//			System.out.println("You can not divide the string equally");
//		}
//		//to print the sting one by one
//		System.out.println(str.substring(0, avgLen));
//		System.out.println(str.substring(avgLen, len));
		
		
		
		
		
		// divinding n no of times
		int n=4;
		int temp=0, chars=len/n;
		
		String[] equalStr=new String[n];
		 
		if(len%n!=0)
		{
			System.out.println("this string cannot be divided in to equal ");
		}

		else {
			for(int i=0; i<len; i=i+chars ) {
				String part=str.substring(i, i+chars);
				equalStr[temp]=part;
				temp++;
			}
			System.out.println(n+" equal parts of given string are");
			for(int i=0; i<equalStr.length; i++) {
				System.out.println(equalStr[i]);
			}
		}
	}

}
