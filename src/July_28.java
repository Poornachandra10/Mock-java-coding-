import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class July_28 {
//	static void binarysearch(int arr[], int n, int k) {
//
//	}

	public static void main(String[] args) {

//Given two strings,
//a: First string has a fixed length of 4, such as "[[]]"
//b: Second string is a word and can be of any length, such as "Yay", OR 
//"WooHoo"  OR "Word"
//Write a program to return a new string where the second 
//string is in the middle of the first string.
//Ex1: ("<<>>", "Yay") → "<<Yay>>"
//Ex2: ("<<>>", "WooHoo") → "<<WooHoo>>"
//Ex3: ("[[]]", "word") → "[[word]]"

		/*
		 *
		 * using string builder StringBuilder str1=new StringBuilder("<<>>");
		 * StringBuilder str2=new StringBuilder("word");
		 * 
		 * System.out.println(str1.insert(str1.length()/2, str2));
		 * 
		 * using subString method String str1="[[]]"; String str2="hello world"; String
		 * str3; int n=(str1.length()/2);
		 * str3=str1.substring(0,n)+str2+str1.substring(2); System.out.println(str3);
		 * 
		 */

		/*
		 * //binary search int arr[]= {11,3,6,2,8,9,3,0};
		 * 
		 * //sorting
		 * 
		 * Arrays.sort(arr);
		 * 
		 * //print System.out.println("After quick sort: "+Arrays.toString(arr));
		 * 
		 * 
		 * //finding the given key value place 
		 * int key=8; 
		 * int
		 * result=Arrays.binarySearch(arr, key);
		 * System.out.println("finding the position of the key value");
		 * System.out.println(key+" is presented in "+result+ " th position");
		 * 
		 * 
		 */

		
		
		// Array merge and sort

//		
//	ArrayList<Integer> arr=new ArrayList<Integer>();
//	
//		 
//		arr.add(10);
//		arr.add(60);
//		arr.add(80);
//		arr.add(50);
//		arr.add(40);
//		arr.add(20);
//		ArrayList<Integer> arr1=new ArrayList<Integer>();
//		
//		 
//		arr1.add(30);
//		arr1.add(260);
//		arr1.add(880);
//		arr1.add(5);
//		arr1.add(4);
//		arr1.add(2);
//		
//		
//					
//		ArrayList<Integer> newArr=new ArrayList<Integer>();
//				

//		newArr.addAll(arr1);
//		newArr.addAll(arr);
//		System.out.println("Beforw sorting: "+newArr);
//		Collections.sort(newArr);
//		System.out.println("After sorting:"+newArr);
//		

		
		
		
		
	/*	int []a= {1,9,4,8,3,8,2};
		int []b= {2,5,3,7,4,9,5};
		
		System.out.println("Array A: "+Arrays.toString(a));
		System.out.println("Array B: "+Arrays.toString(b)+"\n");
		
		int []merge=merge(a,b);
	}

	 static int[] merge(int[] a, int[] b) {
		int[]merge=new int [a.length+b.length];
		
		int k=0, i=0, j=0;
		
		
		while( i < a.length) {
			merge[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length) {
			merge[k]=b[j];
			j++;
			k++;
		}
		Arrays.sort(merge);
		System.out.println("merged Array"+Arrays.toString(merge));
		return merge;*/
		
		
		//***************************
		//August 1-2023
		//binary search:
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("print the length of the array: ");
//		int n=sc.nextInt();
//		int arr1[]=new int[n];
//		for(int i=0; i<=n-1; i++) {
//			System.out.println("print the "+i+" value: ");
//			arr1[i]=sc.nextInt();
//		}
//		System.out.println("before sorting using quick sort method: ");
//		System.out.println(Arrays.toString(arr1));
//		Arrays.sort(arr1);
//		System.out.println("After sorting using quick sort method: ");
//		System.out.println(Arrays.toString(arr1));
//		
//		System.out.println("BinarySearch");
//		
//		int key=sc.nextInt();
//		System.out.println("to find the place of the key,");
//		int res=Arrays.binarySearch(arr1, key);
//		System.out.println("The "+key+"is presented in"+
// res+"place");
		//sc.clise();
		
		//*****************************************************
		
		
		//int arr[]= { 1,6,54,7,4,9};
	//	System.out.println("before sorting :"+Arrays.toString(arr));
		//Arrays.sort(arr);
		////System.out.println("After sorting :"+Arrays.toString(arr));
//int key=54;
		//int Result=Arrays.binarySearch(arr, key);
		
		//System.out.println("The key value "+key+"presented in"+Result+"th place");
		
		//************************
		
		
		//merge array
		int a[]= {12,43,53,65,23};
		int b[]= {32,54,46,13,25};
		int merge[]=merge(a,b);
		
	}

 static int[] merge(int[] a, int[] b) {
	int i,j,k=0;
	int merge[]=new int[a.length+b.length];
	
//	while(i<a.length) {
//		
//	}
	return null;
}

}
///*	
//
///*class ProductArray {
///* Function to print product array
//for a given array arr[] of size n */
//void productArray(int arr[], int n)
//{
//
//// Base case
//if (n == 1) {
//	System.out.print(0);
//	return;
//}
//// Initialize memory to all arrays
//int left[] = new int[n];
//int right[] = new int[n];
//int prod[] = new int[n];
//
//int i, j;
//
///* Left most element of left array
//is always 1 */
//left[0] = 1;
//
///* Right most element of right
//array is always 1 */
//right[n - 1] = 1;
//
///* Construct the left array */
//for (i = 1; i < n; i++)
//	left[i] = arr[i - 1] * left[i - 1];
//
///* Construct the right array */
//for (j = n - 2; j >= 0; j--)
//	right[j] = arr[j + 1] * right[j + 1];
//
///* Construct the product array using
//left[] and right[] */
//for (i = 0; i < n; i++)
//	prod[i] = left[i] * right[i];
//
///* print the constructed prod array */
//for (i = 0; i < n; i++)
//	System.out.print(prod[i] + " ");
//
//return;
//}
//
///* Driver program to test the above function */
//public static void main(String[] args)
//{
//ProductArray pa = new ProductArray();
//int arr[] = { 10, 3, 5, 6, 2 };
//int n = arr.length;
//System.out.println("The product array is : ");
//pa.productArray(arr, n);
//}
//}
