package string_Programs;

public class palindrome {

	public static void main(String[] args) {
		String str = "malaYaLAm";

		// StringBuffer str1=new StringBuffer(str);
//		System.out.println(str1.reverse());

		String str2 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			str2 = str2 + str.charAt(i);
		}
		System.out.println("after reversing the given word : " + str2);
		if (str.equalsIgnoreCase(str2)) {
			System.out.println("Its is palindrome");
		} else
			System.out.println("It is not a palindrome");
	}

}
