package java_Basic_Programs;

public class Q4_b_Recursion_factorial_java_program {
static int factorial(int n) {
if(n==0)
	return 1;
else
	return(n*factorial(n-1));
}
	


public static void main(String[] args) {
	int i, fact=1;
	int number =4;
	fact=factorial(number);
	System.out.println("factorial of "+number+ "is : "+fact);

	}

}
