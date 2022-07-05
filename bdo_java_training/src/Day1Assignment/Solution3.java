package Day1Assignment;
//Write a Java program to compare a given string to the specified string buffer.

public class Solution3 {

	public static void main(String[] args) {
		String str = "example.com";
		StringBuffer sb = new StringBuffer("example.com");
		StringBuffer sb1 = new StringBuffer("Example.COM");
//		comparing
		System.out.println(str.contentEquals(sb));
		System.out.println(str.contentEquals(sb1));

	}

}
