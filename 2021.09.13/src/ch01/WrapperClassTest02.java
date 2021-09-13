package ch01;

import java.util.Vector;

public class WrapperClassTest02 {

	public static void main(String[] args) {

		String s1 = "123456";
		int i = Integer.parseInt(s1);

		String s2 = String.valueOf(i);
		System.out.println(s2);
		
		String s4 = Integer.toBinaryString(15);
		System.out.println(s4);
		
		String s5 = Integer.toHexString(48);
		System.out.println(s5);
		
		Vector v = new Vector();

	}

}
