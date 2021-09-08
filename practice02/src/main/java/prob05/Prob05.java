package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {

		Random random = new Random();
		int correctNumber = random.nextInt(100) + 1;
		System.out.println(correctNumber);

		Scanner scanner = new Scanner(System.in);

		while (true) {

			int num = scanner.nextInt();
			
			if (correctNumber < num) {
				System.out.println("더 낮게");
				continue;
			} else if (correctNumber > num) {
				System.out.println("더 높게");
				continue;
			} else {
				System.out.println("정답!");
				// 새 게임 여부 확인하기
				System.out.print("다시 하겠습니까(y/n)>>");
				String answer = scanner.next();
				if ("y".equals(answer) == false) {
					break;
				}
				
			}

		}

		scanner.close();
		
	}

}