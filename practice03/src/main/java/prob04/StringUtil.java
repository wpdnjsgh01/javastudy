package prob04;

public class StringUtil {
	
	public static String concatenate(String[] str) {
		
		String set = "";
		
		for(int i = 0; i < str.length; i++) {
			set += str[i];
		}
		
		return set;
	}
	
}
