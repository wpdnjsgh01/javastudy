package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		
		while( true ) {
			
			Random random = new Random();
			int correctNumber = random.nextInt( 100 ) + 1;
			System.out.println(correctNumber);

			int num = scanner.nextInt();
			
			if(correctNumber == num) {
				System.out.println("정답!");
			} 
			else if(correctNumber > num) {
				System.out.println("더 높게");
			}
			else {
				System.out.println("더 낮게");
			}

		}
		
		System.out.println( "다시 하겠습니까(y/n)>>" );
		String answer = scanner.next();
		if( "y".equals( answer ) == false ) {
			break;
		}
		
		scanner.close();
		
	}

}