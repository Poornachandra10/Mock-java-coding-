package preparingForMock_coding;

import java.util.Arrays;

public class Q3_sorting_Q3 {

	public static void main(String[] args) {

		int arr[] = { 564, 30, 3, 21, 954 };
		System.out.println("sorting the  array  values are" + Arrays.toString(arr));

		int length = arr.length;
		for (int i = 0; i <length-1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				i = -1;

			}}
		/*
		 * temp=a;
		 * a=b;
		 * b=temp; 
		 */
		
		System.out.print("After sorting the array is " + Arrays.toString(arr));
	
//	System.out.println("\n");
//	
//	
//	int arr2[]= {100,32,32,75,51,46,37,65};
//	System.out.println("before sorting the values"+Arrays.toString(arr2));
//	int num=arr2.length;
//	for(int i=0;i<num-1; i++) {
//		
//		if(arr2[i]>arr2[i+1]) {
//			int temp=arr2[i];
//			arr2[i]=arr2[i+1];
//			arr2[i+1]=temp;
//			i=-1;
//		}}
//	System.out.println("after sorting the arr2[] values are= " +Arrays.toString(arr2));
//	
//	
//	
//	
//	
//	
//	int am[]= {182, 177, 133, 194, 190, 193};
//	System.out.println("before sorting the values  "+Arrays.toString(am));
//	int n=am.length;
//	for(int i=0; i<n-1; i++) {
//		if(am[i]>am[i+1]) {
//			int temp= am[i];
//			am[i]=am[i+1];
//			am[i+1]=temp;
//			i=-1;
//		}}
//	System.out.println("after sorting the array the values "+Arrays.toString(am));
//
//	
//	
	}}

