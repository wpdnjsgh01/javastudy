package Multitest;

import java.io.*;
import java.net.*;
import java.util.*;

public class ToServerThread extends Thread {
	
	Socket socket = null;
	
	public ToServerThread(Socket socket) {
		this.socket = socket; 
	}
	
	public void run() {
		try {
			
			Scanner scanner = new Scanner(System.in);

			OutputStream out = socket.getOutputStream();

			PrintWriter writer = new PrintWriter(new OutputStreamWriter(out), true);

			
			while(true) { //무한루프
				System.out.print(">");
				String line = scanner.nextLine();
				
				if("exit".equals(line)) {
					System.out.println("님이 퇴장하셨습니다.");
					break;
				}
				
				writer.println(line);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace(); // 예외처리
		} finally {
			try {
				if (socket != null && socket.isClosed() == false) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}


}