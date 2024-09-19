package collections.set;


import java.util.LinkedHashSet;

public class LinkedHashSetPractices {

	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new	LinkedHashSet<Integer>();
		System.out.println(set.isEmpty());
		set.add(10);
		set.add(20);
		set.add(-96);
		set.add(52);
		set.add(65);
		System.out.println(set);

	}

}
