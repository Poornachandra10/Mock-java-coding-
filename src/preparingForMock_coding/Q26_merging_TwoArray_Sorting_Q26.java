package preparingForMock_coding;

import java.util.Arrays;

public class Q26_merging_TwoArray_Sorting_Q26 {

	public static void main(String[] args) {
	
		int [] a= {1,2,4,6,9,10};
		int [] b= {3,5,7,8};
		int [] c= {1,3,4};

		int aLen=a.length;
		int bLen=b.length;
//int cLen=c.length;
		int [] newArr=new int[aLen+bLen];

		
		
//******************************************
	//this is just add the code
		System.arraycopy(a, 0, newArr, 0, aLen);
		System.arraycopy(b, 0, newArr, aLen, bLen);
		//System.arraycopy(c, 0, newArr, bLen, cLen);
		System.out.println(Arrays.toString(newArr));
//*********************************************
	int pos=0;
	for(int element : a) {
		newArr[pos]=element;
		pos++;
	}
		for(int element : b) {
			newArr[pos]=element;
			pos++;
		}
		System.out.println(Arrays.toString(newArr));
		
	//*******************************************************			
		
		
	}
}
