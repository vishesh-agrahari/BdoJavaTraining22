package Day1Assignment;
//Write a Java program to create a new String object with the contents of a character array.
public class Solution4 {

	public static void main(String[] args) {
		char ch[] = {'T', 'h', 'e',  ' ', 'b', 'o', 'o', 'k',  ' ', 'c', 'o', 'n', 't', 'a', 'i', 'n', 's',  ' ', '2', '3', '4',  ' ', 'p', 'a', 'g', 'e', 's'};
//		method1
		String str = new String(ch);
		System.out.println(str);
		
//		method2
		String str1 = String.valueOf(ch);
		System.out.println(str1);

	}

}
