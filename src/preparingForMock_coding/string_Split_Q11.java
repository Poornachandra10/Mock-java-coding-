package preparingForMock_coding;


import java.util.Arrays;


public class string_Split_Q11 {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
//String a =sc.next();	
String a="I Love My country" ;
		String [] str=a.split("\\s");
for (String string : str) {
	System.out.println(string);
}
System.out.println();
// another way
String[] str1 = new String ("Hello world, This is Poorna").split(" ");
String[] str2= new String ("I m a great mom for two kids").split(a);
System.out.println(Arrays.toString(str1));
System.out.println(Arrays.toString(str2));
//sc.close();
	}

}
