package udp;

import java.io.*;
import java.net.*;
import java.util.*;

public class UDPEchoClient {
	
	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = 7777;

	public static void main(String[] args) {

		DatagramSocket socket = null;
		Scanner scanner = null;
		
		scanner = new Scanner(System.in);
		
		try {
			
			scanner = new Scanner(System.in);
			socket = new DatagramSocket();
			
			while(true) {
				System.out.println(">");
				String line = scanner.nextLine();
				
				if(line.equalsIgnoreCase("exit")) {
					break;
				}
				
				
				//보내기
				byte[] sndData = line.getBytes("utf-8");
				DatagramPacket sndPacket = new DatagramPacket(sndData, sndData.length, new InetSocketAddress(SERVER_IP, SERVER_PORT));
				socket.send(sndPacket);
				
				DatagramPacket rcvPacket = new DatagramPacket(new byte[BUFFER_SIZE], BUFFER_SIZE);
				
				byte[] rcvDa
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(socket != null && socket.isClosed()) {
				socket.close();
			}
			if(socket != null) {
				socket.close();
			}
		}
		
	}

}
