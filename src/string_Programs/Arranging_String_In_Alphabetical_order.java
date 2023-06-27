package string_Programs;

public class Arranging_String_In_Alphabetical_order {

	public static void main(String[] args) {
		String temp;
		String[] arr = new String[] { "akila", "madhav", "subini", "rex", "zek" };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) > 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.println(arr[i]);
		}
	}

}
