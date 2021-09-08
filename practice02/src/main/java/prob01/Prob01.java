package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		
		final int[] MONEY = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		Scanner scanner = new Scanner(System.in);
		int insert = scanner.nextInt();
		int cnt;
		
		System.out.println("금액 : " + insert);
		
		for(int i = 0; i < MONEY.length; i++){

			cnt = insert / MONEY[i];

			System.out.println(MONEY[i]+"원권 / " + cnt + "매");

			insert = insert - ( cnt * MONEY[i] );

		}
		
		scanner.close();
		
 	}
	
}