package preparingForMock_coding;

import java.util.Scanner;

public class scanner_1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
	/*
	 * System.out.println("what is your name"); String m=sc.next();
	 * System.out.println("what is ur age"); String n=sc.next();
	 * System.out.println("your name is " +m); System.out.println("your age is "+n);
	 */
	
	/*
	 * int i, j; for(i=1; i<=5; i++) { for(j=1; j<=5; j++) { System.out.print(i); }
	 * System.out.println(); }
	 * 
	 * System.out.println();
	 * 
	 * int a,b; for(a=1; a<=5; a++) { for(b=1; b<=a; b++) { System.out.print(a); }
	 * 
	 * 
	 * System.out.println(); }
	 * 
	 * int x,y;
	 * 
	 * for(x=5; x>=1; x--) { for(y=5; y>=x; y--) { System.out.print(x); }
	 * System.out.println(); }
	 */
		
	/*
	 * int m,n; for(m=5; m>=1; m--) { for(n=5; n>=m; n--) { System.out.print("* ");
	 * } System.out.println(); } for(int l=4; l>0; l--) { for (int x=1; x<=l; x++) {
	 * System.out.print("* "); } System.out.println(); }
	 */
	
	
	//System.out.println("\n");
	/*
	 * for(int a =1; a<=5; a++) { for(int b=1; b<=5-a; b++) { System.out.print(" ");
	 * } for(int w=0; w<a; w++) { System.out.print("* ");
	 * 
	 * } System.out.println();
	 * 
	 * } for(int c=1; c<=4; c++) { for (int d=1; d<=c; d++) { System.out.print(" ");
	 * } for(int f=0; f<=4-c; f++) { System.out.print("* "); } System.out.println();
	 * }
	 */
	
	
	/*
	 * for(int a=1; a<=5; a++) 
	 * { 
	 * for(int b=1; b<=5-a; b++)
	 *  { System.out.print(" ");
	 * } for(int c=0; c<a; c++) { 
	 * System.out.print("* "); } 
	 * System.out.println(); }
	 */
	
	/*for(int a=1; a<=5; a++) {
		for(int b=1; b<=5-a; b++) {
			System.out.print(" ");
		}
		for(int c=1; c<=a; c++) {
			System.out.print("* ");
			}
		System.out.println();
	}
	for(int d=1; d<=4; d++) {
		for(int e=1; e<=d; e++) {
			System.out.print(" ");
		}
		for(int f=0; f<=4-d; f++) {
			System.out.print("* ");
		}
	System.out.println();
	}*/
	
	
	/*
	 * int x[]=new int [5]; for (int i=0; i<5; i++) { x[i]=i; } for (int j=0; j<5;
	 * j++) { System.out.println("x["+j+"]= "+x[j]); }
	 */
	
	/*
	 * int x[][]= {{11,22,33},{33,22,11}}; int y[][]= {{44,55,66},{11,11,11}}; int
	 * z[][]=new int[2][3];
	 * 
	 * System.out.println("Value of x[][]\n"); for(int i=0; i<2;i++) { for(int j=0;
	 * j<3; j++) { System.out.print(" "+x[i][j]); } System.out.println(); }
	 * System.out.println("\nValue of y[][]\n"); for(int i=0; i<2; i++) { for(int
	 * j=0; j<3; j++) { System.out.print(" "+y[i][j]); } System.out.println(); }
	 * 
	 * System.out.println("\nValue of x[][]+y[][]\n");
	 * 
	 * for(int i=0; i<2; i++) { for(int j=0; j<3; j++){ z[i][j]=(x[i][j]+y[i][j]);
	 * System.out.print (" "+z[i][j]); } System.out.println(); }
	 */
	
	
	
	/*
	 * int a[][]= {{10,10,10},{10,10,10}}; int b[][]= {{20,20,20},{20,20,20}}; int
	 * c[][]=new int[2][3];
	 * 
	 * System.out.println("printing a[][] values:\n"); for (int i=0; i<2; i++) {
	 * for(int j=0; j<3; j++) { System.out.print(" "+a[i][j]); }
	 * System.out.println(); } System.out.println("printing b[][] values\n");
	 * for(int i=0; i<2; i++){ for(int j=0; j<3; j++) {
	 * System.out.print(" "+b[i][j]); } System.out.println(); }
	 * 
	 * System.out.println(" printing c[][] values\n"); for(int i=0; i<2; i++) {
	 * for(int j=0; j<3; j++) { c[i][j]=a[i][j]+b[i][j];
	 * System.out.print(" "+c[i][j]);
	 * 
	 * } System.out.println(); }
	 */
	
	
	
	//String word=sc.next();
	System.out.println("counting the upper, lower, number, and special chars");
	String word=sc.next();
	int upper=0; int lower=0; int special=0; int num=0;
	for(int i=0; i<word.length(); i++) {
		char ch=word.charAt(i);
		
		if(ch>='a'&& ch<='z') {
			lower++;}
			if(ch>='A'&& ch<='Z') {
				upper++;}
				if(ch>='0' && ch<='9') {
					num++;}
				else {
					special++;
				}
					
	}
	System.out.println("The total count of upper alphabet "+ upper);
	System.out.println("The total count of lower alphabet "+ lower);
	System.out.println("The total count of special alphabet "+ special);
	System.out.println("The total count of num alphabet "+ num);
	
	sc.close();
	}
}
	
