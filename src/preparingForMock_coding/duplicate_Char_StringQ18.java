package preparingForMock_coding;

import java.util.Scanner;

public class duplicate_Char_StringQ18 {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("enter any string to find the duplicate value:  ");
String s=sc.next();
int len=s.length();
char[] ch = s.toCharArray();
sc.close();
for(int i=0; i<len; i++) {
	for(int j=i+1; j<len; j++) {
		if(ch[i]==ch[j]) {
			System.out.println("duplicate char: "+ch[j]);
			break;
		}
	}
}

	}

}
