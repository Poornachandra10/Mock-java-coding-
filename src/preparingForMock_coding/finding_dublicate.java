package preparingForMock_coding;

public class finding_dublicate {

	public static void main(String[] args) {

String str="poorna chandra";
str=str.toLowerCase();
char ch[]=str.toCharArray();
for(int i=0; i<str.length(); i++) {
	for(int j=i+1; j<str.length(); j++) {
		if(ch[i]==ch[j]) {
			System.out.println(ch[i]+" : This value is duplicate");
			break;
		}
	}
}
		
		
		
	}

}
