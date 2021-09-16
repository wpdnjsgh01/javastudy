package Multitest;

import java.net.*;

public class MainThread {
	
	private static void log(String string) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		int PORT = 0;
		
		try {
		serverSocket = new ServerSocket();
					
		String hostAddress = InetAddress.getLocalHost().getHostAddress();
		serverSocket.bind( new InetSocketAddress( hostAddress, PORT ) );			
		log( "연결 기다림 " + hostAddress + ":" + PORT );

		while( true ) {
		   Socket socket = serverSocket.accept();
		   new ChatServerThread( socket ).start();
		}

		} catch(Exception e) {
			e.printStackTrace();
		}

	}

	

}
