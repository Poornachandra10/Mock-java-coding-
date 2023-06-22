package java_Basic_Programs;

public class Q4_Factorial {

	public static void main(String[] args) {
	int fact=1;
	int num=5;
	for(int i=1; i<=num; i++) {
		fact=fact*i;
	}
	System.out.println(num+" factorial value is = "+ fact);

	}

}
