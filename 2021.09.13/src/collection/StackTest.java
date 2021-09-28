package collection;
import java.util.*;

public class StackTest {

	public static void main(String[] args) {

		Stack<String> s = new Stack<>();
		
		s.push("둘리1");
		s.push("둘리2");
		s.push("둘리3");
		
		while(!s.empty()) {
			String str = s.pop();
		//	String str = s.peek();
			System.out.println(str);
		}
	
	}

}
