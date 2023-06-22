package preparingForMock_coding;

import java.util.Arrays;

public class Q26a_merging_and_Sorting {

	public static void main(String[] args) {

		int[] a = new int[] { 12, 5, 7, 9, 1 };
		int[] b = new int[] { 54, 98, 1, 5, 90 };
		int[] merge = merge(a, b);
		System.out.println("Array A: " + Arrays.toString(a));
		System.out.println("Array B: " + Arrays.toString(b));
		System.out.println("Merged Array: " + Arrays.toString(merge));
	}

	private static int[] merge(int[] a, int[] b) {
		int[] merge = new int[a.length + b.length];
		int i = 0, j = 0, k = 0;
		while (i < a.length) {
			merge[k] = a[i];
			i++;
			k++;
		}
//		while (j < b.length) {
//			merge[k] = b[j];
//			j++;
//			k++;
//		}
		Arrays.sort(merge);

		return merge;
	}

}
