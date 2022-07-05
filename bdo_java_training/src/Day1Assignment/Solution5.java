package Day1Assignment;
//Write a Java program to check whether a given string ends with the contents of another string
public class Solution5 {

	public static void main(String[] args) {
		String str1 = "Python Exercise";
		String str2 = "Python Exercises";
		String ends_with = "es";
		
		System.out.println(str1.endsWith(ends_with));
		System.out.println(str2.endsWith(ends_with));
		

	}

}
