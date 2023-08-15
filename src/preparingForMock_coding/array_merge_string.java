package preparingForMock_coding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class array_merge_string {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		ArrayList <String> y=new ArrayList<>();
		System.out.println("enter ab value");
		String ab= sc.nextLine();
		System.out.println("enter b value");
		String b= sc.nextLine();
		System.out.println("enter c value");
		String c= sc.nextLine();
	y.add(ab);
		y.add(b);
		y.add(c);
		System.out.println(" array list y values"+y);
		ArrayList <String>  y1=new ArrayList<>();
		y1.add("Suresh");
		y1.add("Family");
		y1.add("Love");
		System.out.println(" array list y1 values"+y1);
		ArrayList <String> a= new ArrayList<>();
		a.addAll(y);
		a.addAll(y1);
		System.out.println(" array list a values"+a);
		Collections.sort(a);
		
		System.out.println(" array list a values after sorting"+a);
	}

}
