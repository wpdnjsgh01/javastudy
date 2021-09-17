package test2;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ToServerThread extends Thread {
	
	Socket socket = null;
	
	Scanner scanner = new Scanner(System.in);
	
	public ToServerThread(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		try {
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
			
			while(true) {
				writer.println(scanner.nextLine());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(socket.equals(null)) {
					socket.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
