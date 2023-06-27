package string_Programs;

import java.util.Scanner;

public class Program_to_find_occurrence_of_a_character_in_a_string {
static int count(String str, char str1) {
	
	int result =0;
	for(int i=0; i<str.length(); i++)
	{
		if(str.charAt(i)==str1)
		result++;
			}
	return result;
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String str=sc.nextLine();
		System.out.println("Enter a letter to find the find occurrence in the given String: ");
		char str1=sc.nextLine().charAt(0);
		
System.out.println(str1+": "+count(str, str1));
		
		
	}

}
