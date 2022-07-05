package Day1Assignment;
/*** Write a Java program to compare a given string to the specified character sequence. 
Sample Output: ***/
public class Solution2 {

	public static void main(String[] args) {
		String str1 = "example.com";
		CharSequence cs = "example.com";
		CharSequence cs1 = "EXAMPLE.COM";
		
		System.out.println(str1.contentEquals(cs));
		System.out.println(str1.contentEquals(cs1));

	}

}
