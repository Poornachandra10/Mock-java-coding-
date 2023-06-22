package preparingForMock_coding;

public class fibonacciSeries {

	public static void main(String[] args) {
	
		int  i=0;
	int sum=0;
	while(i<100) {
		sum=sum+1;
		sum=i+sum;
		i+=1;
	}
	System.out.println(sum);
	}

}
