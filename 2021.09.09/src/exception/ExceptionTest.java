package exception;

public class ExceptionTest {

	public static void main(String[] args) {

		int a = 10;
		int b = 10 - a;
		
		System.out.println("some code1");
		
		try {
			System.out.println("some code2");
			int result = ( 1 + 2 + 3 ) / b;
			System.out.println("some code3");
		} catch(ArithmeticException e) {
			/* 예외처리 */
			System.out.println("ERROR OCCUR : " + e);
			return;
		} finally { //finally는 무조건 실행 됨 예외 발생 하던 안하던ㄷ
			System.out.println("자원 정리");
		}

		System.out.println("some code4");
		
	}

}
