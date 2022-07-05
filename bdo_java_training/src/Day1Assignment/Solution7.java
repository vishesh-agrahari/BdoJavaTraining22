package Day1Assignment;
//Write a Java program to compare a given string to another string, ignoring case considerations

public class Solution7 {

	public static void main(String[] args) {
		String str1 = "Stephen Edwin King";
		String str2 = "Mike Royko";
		String str3 = "stephen edwin king";
		
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.equalsIgnoreCase(str3));
	}

}
