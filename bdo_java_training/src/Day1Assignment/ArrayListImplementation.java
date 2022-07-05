package Day1Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListImplementation {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(25);
		ar.add(12);
		ar.add(18);
		ar.add(10);
		ar.add(20);
//		size
		System.out.println(ar.size());
//		sort
		Collections.sort(ar);
		System.out.println("After sorted: "+ar);
//      clone
		ArrayList <Integer> ar2 = ar;
		System.out.println("cloned array: "+ar2);
//		contains
		System.out.println(ar.contains(18));
//		EnsureCapacity
		ar.ensureCapacity(20);
//		check isEmpty
		System.out.println("Is Array Empty? "+ar.isEmpty());
//		IndexOf
		System.out.println("Index of Element 18: "+ar.indexOf(18));
//		insert an element into the array list at the first position
		ar.add(0, 100);
		System.out.println(ar);
//		retrieve an element (at a specified index) from a given array list
		System.out.println(ar.get(3));
//		update specific array element by given element 
		ar.set(3, 125);
		System.out.println(ar);
//		 remove the third element from a array list
		ar.remove(2);
		System.out.println(ar);
//		search an element in a array list
		System.out.println("Is 30 present in this list: "+ar.contains(30));
	}

}
