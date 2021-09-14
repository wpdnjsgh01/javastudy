package prob03;

public class CurrencyConverterTest {

	public static void main(String[] args) {
		//  환율을 세팅 합니다.
		
		CurrencyConverter.setRate(1197.0);
		
		double dollar = 0;
		try {
			dollar = CurrencyConverter.toDollar( 1000000. );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println( "백만원은 " + dollar + "달러 입니다" );
		
		double krw = 0;
		try {
			krw = CurrencyConverter.toKRW( 100. );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println( "백달러는 " + krw + "원 입니다" );
	}

}
