import java.util.Arrays;

public class aug_1 {

//	Write a java program to find the product of an array except itself 
//	input=[1,2,3,4] 
//	0utput=[24,12,8,6]

	public static void main(String[] args) {
		int input[] = { 1, 2, 3, 4 };
		int length = input.length;
		System.out.println("The given array is: " + Arrays.toString(input));

		productArray(input, length);

	}

	static void productArray(int[] input, int length) {
		if (length == 1) {
			System.out.println(0);
			return;
		}

		// storing new length

		int left[] = new int[length];
		int right[] = new int[length];
		int prod[] = new int[length];

		int i, j;

		// left most element is always 1
		
		left[0] = 1;

		// right most elment is always 1
		
		right[length - 1] = 1;

		// construct the left array
		
		for (i = 1; i < length; i++) {
			left[i] = input[i - 1] * left[i - 1];
		}
		System.out.println("printing left array : " + Arrays.toString(left));
		// construct the right array

		for (j = length-2; j >=0 ; j--) {
			right[j] = input[j + 1] * right[j + 1];
		}

		System.out.println("printing right array :" + Arrays.toString(right));

//	left and right array -merging
		for (i = 0; i < length; i++) {
			prod[i] = left[i] * right[i];
		}
		System.out.println("Output of the Java programe is "+Arrays.toString(prod));
		return;
	}

}
