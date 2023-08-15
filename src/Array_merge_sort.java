import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array_merge_sort {

	public static void main(String[] args) {

//		ArrayList<Integer> no = new ArrayList<>();
//		no.add(14);
//		no.add(24);
//		no.add(11);
//		no.add(61);
//		no.add(17);
//		System.out.println(" array list no values" + no);
//
//		ArrayList<Integer> no1 = new ArrayList<>();
//		no1.add(4);
//		no1.add(28);
//		no1.add(61);
//		no1.add(69);
//		no1.add(110);
//
//		System.out.println(" array list no1 values" + no1);
//
//		ArrayList<Integer> no2 = new ArrayList<>();
//
//		no2.addAll(no);
//		no2.addAll(no1);
//
//		System.out.println("Before sorting" + no2);
//
//		Collections.sort(no2);
//
//		System.out.println("After sorting" + no2);

	ArrayList <Integer> a=new ArrayList<>();
	a.add(13);
	a.add(32);
	a.add(43);
	a.add(123);
	a.add(36);
	
	
	ArrayList<Integer>b=new ArrayList<>();
	b.add(4);
	b.add(3);
	b.add(2);
	b.add(1);
	b.add(8);
	b.add(5);
	b.add(7);
	
	
	ArrayList<Integer> c=new  ArrayList<>();
	c.addAll(a);
	c.addAll(b);
	
	System.out.println("After merging "+c);
	
	Collections.sort(c);
	
	System.out.println("After sorting"+c );
	
	
	}

}
