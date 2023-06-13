package preparingForMock_coding;

import java.util.Scanner;

public class consicutive_num_24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter any number to find consecutive values:  ");
		int s = sc.nextInt();

		for (int i = 0; i <= s / 2; i++) {
			String str = "";
			int sum = 0;
			int x = i;

			while (sum < s) {
				sum = sum + x;
				str = str + x + "+";
				x++;
			}
			if (sum == s) {
				System.out.println(str.subSequence(0, str.length() - 1));

			}
sc.close();
		}
	}
}
