package collections.list;

import java.util.ArrayList;

public class ArrayListPractices {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		System.out.println(list1.isEmpty());

		list1.add(10);
		list1.add(20);
		list1.add(1, 15);

		list1.add(0);
//		list.clear();
		boolean status = list1.contains(15);
		System.out.println(status);

		System.out.println(list1);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(100);
		System.out.println(list2);
		list2.addAll(list1);
		System.out.println(list2);
		System.out.println(list2.containsAll(list2));
		System.out.println(list1.containsAll(list2));
		System.out.println(list1.equals(list2));
		System.out.println(list1.isEmpty());
		System.out.println(list1.size());
		System.out.println(list1.get(2));
		System.out.println(list2);
		list2.set(0, 36);
		System.out.println(list2);
		Object[] ar = list2.toArray();
		for (Object o : ar) {
			System.out.print(o + " ");
		}

	}

}
