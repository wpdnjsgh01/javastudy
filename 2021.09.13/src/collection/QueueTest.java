package collection;
import java.util.*;

public class QueueTest {

	public static void main(String[] args) {

		Queue<String> q = new LinkedList<>();
		
		q.offer("마이콜1");
		q.offer("마이콜2");
		q.offer("마이콜3");
		
		while(!q.isEmpty()) {
			String s = q.poll();
			System.out.println(s);
		}
		
		q.offer("마이콜4");
		q.offer("마이콜5");
		q.offer("마이콜6");
	
		System.out.println(q.poll());
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.poll());

		
	}

}
