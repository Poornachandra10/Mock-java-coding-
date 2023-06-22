package preparingForMock_coding;

public class Q13_stringReverse_Q13 {

	public static void main(String[] args) {
		//String reverse in several ways:
		
		System.out.println("***************************");
		String str="Poornachandra";
		System.out.println("using string builder reversing\n");
		StringBuilder str2=new StringBuilder();
		str2.append(str);
		str2=str2.reverse();
		System.out.println(str2);
		System.out.println("***************************");
		System.out.println("\nusing string buffer reversing\n");
		
String name="Thejal Shree";
StringBuffer s1=new StringBuffer(name);
System.out.println(s1.reverse());
System.out.println("the charAt at()function   "+s1.charAt(1));
System.out.println("\n"+s1.replace(0, 1, "Love"));
System.out.println("***************************");


//*************************************************

String str4= "Java code";
System.out.println("using to char Array method");
char ch[]=str4.toCharArray();
System.out.println("print the str 4 =   "+str4);
for(int i =0; i<=ch.length-1; i++) {
	
	System.out.print(ch[i]);
}
//******************************************************
  System.out.println("\n"+"print the str 5in revere"); 
  String str5 ="Akila";
  char st[]=str5.toCharArray();
  for(int i=st.length-1; i<=0; i--) { 
	  
	  System.out.print(st[i]); }
 //this method is not working 
 
System.out.println();

System.out.println("***************************");

String son="pukazh";
String [] son1= son.split("");
for(int i=son1.length-1; i<=0; i--) {
	System.out.println(son1[i]);
	//this method is also not working
}

System.out.println("***************************");
	

	
	
	

	
	String family="i love my family";
	StringBuffer fam=new StringBuffer(family);
	System.out.print(fam.reverse());System.out.println();
	System.out.println(fam.charAt(4));

	String s= "Java Code";
	StringBuffer sb= new StringBuffer(s);
	System.out.println(sb.reverse());
}}
