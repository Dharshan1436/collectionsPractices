package collections.queue;

import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQuequPractices {

	public static void main(String[] args) {
		LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
		queue.add(10);
		queue.add(20);
		queue.add(15);
		queue.add(5);
		queue.offer(100);
		System.out.println(queue);

	}

}
