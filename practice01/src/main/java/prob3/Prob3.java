package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();
		int rst = 0;
		
		if(num % 2 == 0) {
			for(int i = 0; i <= num; i++) {
				if(i % 2 == 0) {
					rst += i;
				}
			}
		}
		
		if(num % 2 == 1) {
			for(int i = 0; i <= num; i++) {
				if(i % 2 == 1) {
					rst += i;
				}
			}
		}

		System.out.println(rst);
		//clear
		scanner.close();
	}
}
