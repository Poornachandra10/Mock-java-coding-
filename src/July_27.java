import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class July_27 {

	public static void main(String[] args) {
		/************************************************
		 * Write a Java class. Create a method in this class that takes a List of
		 * strings as the only argument. Each string in this list will be a single word
		 * containing either alphabets a through z or digits 0 through 9 (for example,
		 * “abcd”, “Pune”, “623”, “Mumbai”, “10”, etc. The method should print on
		 * standard output 2 numbers: a. How many strings in the input array are numbers
		 * b. How many strings in the input array are non-numeric.
		 */

		List<String> list=new ArrayList<String>();
		list.add("bangalore");
		list.add("123");
		list.add("cbe");
		list.add("324");
		list.add("blr");
		System.out.println("List : "+list);
		countNumbers(list);
	}
		static void countNumbers(List<String> arr) {
			
		int numCount=0;
		int alphaCount=0;
		for(String ele :arr) {
			try {
				int i=Integer.parseInt(ele);
				numCount++;
			} catch (Exception e) {
				alphaCount++;
			}
		}
		System.out.println("Count of Strings: "+ alphaCount);
		System.out.println("Count of numbers: "+numCount);
		
		
		
		// **************************************

//		int arr[] = { 10, 4, 3, 29, 51 };
//		System.out.println("before sorting" + Arrays.toString(arr));
//		
//		for (int i = 0; i <arr.length - 1; i++) {
//			if (arr[i] > arr[i + 1]) {
//				int temp = arr[i];
//				arr[i] = arr[i + 1];
//				arr[i + 1] = temp;
//				i=-1;
//			}}
//			System.out.println("after sorting" + Arrays.toString(arr));
//		

	}

}
