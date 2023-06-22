package preparingForMock_coding;

import java.util.Arrays;

public class Odd_Even_Position_printing_Array {

	public static void main(String[] args) {
		int  arr[]= {12,32,54,35,46,75,98,54,21,67};
		System.out.println("before sorting the Array");
		for(int i=0; i<=arr.length-1; i++) {
			System.out.print(arr[i]+" ");
		}
Arrays.sort(arr);
System.out.println("printing the sorted array"+Arrays.toString(arr));
System.out.println("printing the odd position numbers in array :\n ");
for(int i=0; i<=arr.length-1; i+=2) {
System.out.println(arr[i]);	
}
System.out.println("printing the even positions");
for(int i=1; i<arr.length; i+=2) {
	System.out.println(arr[i]);
}
System.out.println("6th position of array is  "+arr[5]);
System.out.println("printing the least value  "+arr[0]);
for(int i=arr.length; i>arr.length-1; i-- ) {

System.out.print("printing the highest value "+arr[arr.length-1]);
}
System.out.println("adding the first two least values "+(arr[0]+arr[1]));
System.out.println("adding the first two highest values "+(arr[arr.length-1]+arr[arr.length-2]));

System.out.println("printing the unique values");
for(int i=0; i<arr.length; i++) {
	if(arr[i]==arr[i+1])
		break;
	else
		System.out.println();
}




}	
}


