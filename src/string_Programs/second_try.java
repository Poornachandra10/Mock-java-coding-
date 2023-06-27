package string_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class second_try {
	// writing a program to finding the a char's number of occurance
//	public static int count(String str, char str1) {
//		int result = 0;
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == str1)
//				result++;
//		}
//
//		return result;
//	}

	public static void main(String[] args) {
		// *****************************************Order in alphabetical order
//	String [] arr=new String[] {"zx","th","po","mn","am"};
//	String temp;
//	for(int i=0; i<arr.length; i++) {
//		for(int j=i+1; j<arr.length; j++) {
//			if(arr[i].compareTo(arr[j])>0) {
//				temp =arr[i];
//				arr[i]= arr[j];
//				arr[j]=temp;
//			}
//		}
//	}System.out.println("after sorting thw name in alphabetical order:");
//	for(int i=0; i<arr.length; i++) {
//		
//		System.out.println(arr[i]);
//	}
		// ***********************************************
//// writing a program to finding the a char's number of occurance 
		// finding the letter occurence
//		String str = "AkilA";
//		char str1 = 'i';
//		System.out.println(str1 + " ," + count(str, str1));
//*****************************************************************

		// consecutive numbers

//		
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
//
//		System.out.println("enter any number to find consecutive values:  ");
//		int s = sc.nextInt();
// 
//		for(int i=0; i<s/2; i++)
//		{
//			String str="";
//			int x=i;
//			int sum=0;
//			
//			while(sum<s) {
//			sum=sum+x;
//			str=str+x+"+";
//			x++;
//			}
//			if(sum==s) {
//				System.out.println(str.substring(0, str.length()-1));
//			}
		// }

//binary search
//		System.out.println("enter the arr length");
//		int length = sc.nextInt();
//		int[] arr = new int[length];
//		System.out.println("Enter the " + length + "  array values");
//		for (int i = 0; i < arr.length; i++) {
//
//			arr[i] = sc.nextInt();
//		}
//		Arrays.sort(arr);
//		System.out.println("after sorting :" + Arrays.toString(arr));
//
//		System.out.println("enter the key value to find the position :");
//
//		int key = sc.nextInt();
//		int result = Arrays.binarySearch(arr, key);
//
//		if (result >= 0) {
//			System.out.println(key + " found at index = " + result);
//		} else {
//			System.out.println(key + " is not found");
//		}
//		System.out.println("enter the arr length value");
//		int len;
//		len=sc.nextInt();
//		String[] arr=new String[len];
//		
//		//String str=sc1.nextLine();
//		
//		System.out.println("enter the arr Sring values");
//		String temp="";
//		for(int i=0; i<=arr.length-1; i++) {
//			arr[i]=sc1.nextLine();
//		}
//		
//		for(int i=0; i<arr.length-1; i++) {
//			for(int j=(i+1); j< arr.length-i; j++) {
//				if(arr[i].compareTo(arr[j])>0){
//					temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		Arrays.sort(arr);
//		System.out.println("after sorting :");
//		System.out.println(Arrays.toString(arr));
//	**********************************************************************	
		
		int [] a= {1,4,6,3,5,};
		int [] b= {9,2,8,10,7};
		int [] c= {a.length+b.length};
		
		
		
		
		
		
		
		
		
		
		sc1.close();		
		sc.close();
	}

}
