package collections.set;

import java.util.HashSet;

public class HashSetPractices {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		System.out.println(set.isEmpty());
		set.add(10);
		set.add(20);
		set.add(-96);
		set.add(52);
		set.add(65);
		System.out.println(set);
		System.out.println(set.contains(3));
		System.out.println(set.remove(52));
		System.out.println(set.isEmpty());
		System.out.println(set);
		System.out.println(set.size());
		
	}

}
