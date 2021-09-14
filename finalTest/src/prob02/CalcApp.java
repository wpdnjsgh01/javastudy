package prob02;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while( true ) {
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			
			if( "quit".equals( expression ) ) {
				break;
			}
			
			String[] tokens = expression.split( " " );
			
			if( tokens.length != 3 ) {
				System.out.println( ">> 알 수 없는 식입니다.");
				continue;
			}
			
			int lValue = Integer.parseInt( tokens[ 0 ] );
			int rValue = Integer.parseInt( tokens[ 1 ] );
			
			Arithmetic arithmetic = null;
			
			/* 코드 작성 */
			String symbol = tokens[2];
			int result = arithmetic.calculate(lValue, rValue);
			
			Arithmetic add = new Add();
			Arithmetic div = new Div();
			Arithmetic mul = new Mul();
			Arithmetic sub = new Sub();
			
			if(symbol.equals("+")) {
				result = add.calculate(lValue, rValue);
			}
			if(symbol.equals("/")) {
				result = div.calculate(lValue, rValue);
			}
			if(symbol.equals("*")) {
				result = mul.calculate(lValue, rValue);
			}
			if(symbol.equals("-")) {
				result = sub.calculate(lValue, rValue);
			}
			
			System.out.println( ">> " + result );
		}
		
		scanner.close();
	}
}