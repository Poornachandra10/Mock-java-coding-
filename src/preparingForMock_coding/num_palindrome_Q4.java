package preparingForMock_coding;

import java.util.Scanner;

public class num_palindrome_Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any num to find palindrome or not : ");
int num=sc.nextInt();

int reverse=0;
int user_num=num;

while(num!=0) {
	reverse=reverse*10+num%10;
	num=num/10;
}
if(user_num==reverse) {
	System.out.println(reverse+" It is a palindrome number");
}else {
	System.out.println(reverse+ " It is not a palindrome number");
}

sc.close();

	}

}
