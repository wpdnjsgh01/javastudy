package prob03;

public class CurrencyConverter {

	private static double Rate;

	public static double getRate() {
		return Rate;
	}

	public static void setRate(double rate) {
		Rate = rate;
	}
	
	public static double toDollar (double won) {
		
		double cnt = won / getRate();
		return cnt;
		
	}
	
	public static double toKRW(double dollar) {
		
		double cnt = dollar * getRate();
		return cnt;
		
	}
	
	public CurrencyConverter() {
		
	}
	
}
