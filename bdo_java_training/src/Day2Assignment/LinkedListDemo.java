package Day2Assignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> color = new LinkedList<String>();
		color.add("red");
		color.add("yellow");
		color.add("green");
		color.add("black");
		color.add("blue");
//		insert the specified element at the specified position in the linked list. 
		color.add(1, "white");
		System.out.println(color);
//		 insert elements into the linked list at the first and last position
		color.addFirst("brown");
		color.addLast("grey");
		System.out.println(color);
//		 insert the specified element at the front of a linked list
		color.offerFirst("orange");
		System.out.println(color);
//		display the elements and their positions in a linked list.
		for(int i=0;i<color.size();i++) {
			System.out.println("Index: "+ i + " Element: "+ color.get(i));
		}

	}

}
