package collections.queue;

import java.util.PriorityQueue;

public class PriorityQueuepractices {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue= new PriorityQueue<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(15);
		queue.add(5);
		System.out.println(queue);
//		queue.clear();
		System.out.println(queue.remove());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue);
		
	
	}

}
