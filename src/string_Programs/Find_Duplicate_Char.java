package string_Programs;

public class Find_Duplicate_Char {

	public static void main(String[] args) {
		String str="poornachnadra";
		char [] ch=str.toCharArray();
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				if(ch[i]==ch[j]) {
					System.out.println("duplicate char is :"+ ch[i]);
					break;
				}else {
					System.out.println();
				}
			}
		}
	}

}
