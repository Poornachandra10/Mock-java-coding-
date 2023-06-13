package preparingForMock_coding;

import java.util.Arrays;
import java.util.Scanner;

public class binary_search_Q25 {

	public static void main(String[] args) {
		System.out.println("binary search java program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter length");
		int length = sc.nextInt();
		int[] s = new int[length];
		// int[] s= {10,30,20,40,50};

		for (int i = 0; i <= s.length - 1; i++) {
			System.out.println("enter value: ");
			s[i] = sc.nextInt();
		}

		Arrays.sort(s);
		System.out.println("sorted array " + Arrays.toString(s));
		System.out.println("enter the key value find the position");
		int key = sc.nextInt();
		int res = Arrays.binarySearch(s, key);
		if (res >= 0) {
			System.out.println(key + " found at index= " + res);
		} else {
			System.out.println(key + " is not found");
		}

		sc.close();
	}

}
