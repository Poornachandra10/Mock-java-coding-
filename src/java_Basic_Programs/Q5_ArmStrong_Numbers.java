package java_Basic_Programs;
import java.util.Scanner;

public class Q5_ArmStrong_Numbers {
//	Armstrong Number up to 999 are: 
//		0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407
//Eg:1634: 14 + 64 + 34 + 44 = 1 + 1296 + 81 + 256 = 1643
	static boolean isArmstrong(int n) {
	int temp,digits=0, last=0, sum=0;	
	//assigning n to temp variable
	temp=n;
	//loop execute until the condition become false
	while(temp>0) {
		temp=temp/10;
		digits++;
	}
		temp=n;
		while(temp>0) {
			//determines the last digit from the number
			last=temp%10;
			//calculate the power of a number up to digit times
			//times and the resultant to the sum variables
			sum+=(Math.pow(last, digits));
		//removes the last digit
			temp=temp/10;
		}
		//compares the sum with n
		if(n==sum)
			return true;
		else
			return false;
		}
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any num to check that is armstrong or not");
		
	int num=sc.nextInt();
		
if(isArmstrong(num)) {
	System.out.println("it is Armstrong");
}else {
	System.out.println("its not an Armstrong");
}
	}

}
