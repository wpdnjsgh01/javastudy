package ch01;
import java.util.*;

public class WrapperClassTest01 {

	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		Character c = new Character('c');
		Boolean b = new Boolean(true);
		
		Integer j1 = 10;
		Integer j2 = 10;
		
		//System.out.println(j1 == j2);
		//System.out.println(j1.equals(j2));
		
		//묵시적 언박싱
		int m = j1 + 10;
		//System.out.println(m);
		
		//명시적 언박싱
		int n = j1.intValue() + 10;
		//System.out.println(n);

	}

}
