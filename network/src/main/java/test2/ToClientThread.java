package test2;

import java.io.*;
import java.net.*;

public class ToClientThread extends Thread { 
	
	//소켓 선언
	Socket socket = null;

	public ToClientThread(Socket socket) {
		this.socket = socket; 
	}
	
	public void run() {
		try {
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			String inputString;
			
			while((inputString = reader.readLine()) != null) { 
				System.out.println(inputString);
				
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
