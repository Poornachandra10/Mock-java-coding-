package preparingForMock_coding;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class uniqueWordPrint_Q15 {
//not working as expected
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter some String");
	String[] s=sc.next().split("");
	ArrayList<String>al=new ArrayList<String>();
	for (String st: s) {
		if(!al.contains(st)) {
			al.add(st);
		}
	}
	Iterator<String>it =al.iterator();
	for (String st : al) {
		System.out.print(it.next()+"");
	}
	sc.close();
	// it i snot printing
	// it is printing the first word of the scanner
//System.out.println(s);	
	
	
	
	
}




}
