package prob04;

import java.util.Arrays;

public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray(c1);

		char[] c2 = reverse("Java Programming!");
		printCharArray(c2);
	}

	public static char[] reverse(String str) {

		char[] chr = new char[str.length()];
		
		int j = 0;
		
		for (int i = str.length() - 1; i >= 0; i--) {
			chr[j] = str.charAt(i);
			j++;
		}
		
		return chr;

	}

	public static void printCharArray(char[] array) {
		/* 코드를 완성합니다 */
		System.out.println(array);
	}
}