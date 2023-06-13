package preparingForMock_coding;

public class swappingNums {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int temp=0;
		System.out.println("before swapping the value a is= "+a);
		System.out.println("before swapping the value a is= "+b);
		
		temp=a; //storing a to temp
		a=b; //b value in to a
		b=temp;  //temp to a
		System.out.println("After swapping the value a is= "+a);
		System.out.println("After swapping the value a is= "+b);
		
		
		
		
		System.out.println("Another method of swapping without using temp variable");
		
		a=a+b; //10+5=15
		b=a-b; //15-5=10
		a=a-b;  //15-10=5
		System.out.println("Another method of swapping without using temp variable" +"a val is"+ a);
		System.out.println("Another method of swapping without using temp variable" +"b val is"+ b);
	}

}
