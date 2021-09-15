package util;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
public class NSLookup {
	
	public static void main(String[] args) {
		 
		while(true){
			
			Scanner scanner = new Scanner(System.in);
			String str = scanner.next();
			
			if(str.equalsIgnoreCase("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			
			try {
				
				InetAddress ia = InetAddress.getByName(str);
				InetAddress[] inetAddresses = InetAddress.getAllByName(str);
				
				System.out.println(ia.getHostName());
				System.out.println(ia.getHostAddress());
	
				for(int i = 0; i < inetAddresses.length; i++) {
					System.out.println(inetAddresses[i]);
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		}

	}

}