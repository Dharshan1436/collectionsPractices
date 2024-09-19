package collections.queue;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityblockingQueuepractices {

	public static void main(String[] args) {
		PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(15);
		queue.add(5);
		queue.offer(100);
		queue.clear();
		try {
			System.out.println(queue.take());
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(queue);
	}

}
