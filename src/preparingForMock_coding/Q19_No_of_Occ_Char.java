package preparingForMock_coding;

import java.util.Scanner;

public class Q19_No_of_Occ_Char {

	public static void main(String[] args) {
	
	Scanner sc=new Scanner (System.in);	
	System.out.println(" enter yout input");	
		
	String inputString=sc.nextLine();
	int[] occured=new int[128];
	for(int i=0;i<inputString.length();i++){
		if(inputString.charAt(i)!=' ')
		occured[inputString.charAt(i)]++;
		}
		for(int j=0;j<occured.length;j++){
		if(occured[j]!=0){
		System.out.println((char)(j) + " occured "+occured[j]+ " times" );
	}}
	}

}
