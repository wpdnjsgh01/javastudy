package collection;
import java.util.*;
public class HashSetTest01 {

	public static void main(String[] args) {

		Set<String> s = new HashSet<>();
		String s1 = new String("3");
		String s2 = new String("3");
		
		s.add("1");
		s.add("2");
		s.add("3");

		//System.out.println(s.size());
		System.out.println(s.contains(s2));
		
		/*
		for(String str : s) {
			System.out.println(str);
		}
		*/
		
	}

}
