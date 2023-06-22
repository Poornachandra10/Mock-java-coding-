package preparingForMock_coding;

import java.util.Scanner;

public class Q5_finding_Duplicate_integerQ5 {

	public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
	int[] arr=new int[] {1,2,3,4,2,7,8,8,3};
	System.out.println("finding duplicate elements and printing it");
	for( int i=0; i<arr.length; i++) {
		for(int j=i+1; j<arr.length; j++) {
			if(arr[i]==arr[j])
				System.out.println(arr[j]); 
		}
	}
	
	
	}

}
