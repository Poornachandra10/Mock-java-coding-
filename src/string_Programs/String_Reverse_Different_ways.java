package string_Programs;

public class String_Reverse_Different_ways {

	public static void main(String[] args) {
		String str = "Love You My Dear";

// Using String Buffer:
		System.out.println("Using String Buffer:");
		StringBuffer str1 = new StringBuffer(str);
		System.out.print(str1.reverse());

		System.out.println("\n\nUsing for loop & charAt:");

//Using for loop & charAt:
		for (int i = str.length()-1 ; i >=0;  i--) {
			System.out.print(str.charAt(i));
}
		System.out.println("\n\n");
	
	}

}
