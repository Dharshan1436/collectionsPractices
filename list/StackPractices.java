package collections.list;

import java.util.Stack;

public class StackPractices {

	public static void main(String[] args) {
		Stack<Integer> list = new Stack<Integer>();
		list.add(100);
		list.add(25);

//		list.clear();
		System.out.println(list.contains(20));

		System.out.println(list);

		System.out.println(list.hashCode());
		System.out.println(list.indexOf(20));
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		list.push(89);
		System.out.println(list);
		System.out.println(list.peek());

		System.out.println(list.pop());
		System.out.println(list);
		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println(list.capacity());
		
	}

}
