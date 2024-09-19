package collections.list;

import java.util.LinkedList;

public class LinkedListPractices {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(100);
		list.add(25);
		list.addFirst(32);
		list.addLast(35);
//		list.clear();
		System.out.println(list.contains(20));
		System.out.println(list.element());
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.hashCode());
		System.out.println(list.indexOf(20));
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		list.push(89);
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list.peekLast());
		
		System.out.println(list.pop());
		System.out.println(list);
		System.out.println(list.remove(0));
		System.out.println(list);
	
	}

}
