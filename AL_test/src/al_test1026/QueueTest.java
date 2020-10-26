package al_test1026;

import java.util.Queue;
import java.util.*;

public class QueueTest {

	public static void main(String[] args) throws InterruptedException {
		int time=10;
		Queue<Integer> queue=new LinkedList<>();
		for (int i = time; i >= 0; i--) {
			queue.add(i);
		}
		while(!queue.isEmpty()) {
			System.out.println(queue.remove()+" ");
			Thread.sleep(1000);
		}

	}

}
