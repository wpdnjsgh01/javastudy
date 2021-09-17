package udp;

import java.net.*;

public class UDPEchoServer {
	
	public static final int PORT = 7777;
	public static final int BUFFER_SIZE = 1024;

	public static void main(String[] args) {

		//1.소켓 생성
		DatagramSocket socket = null;
		
		try {
			
			socket = new DatagramSocket(PORT);
			
			while(true) {
			
			DatagramPacket rcvPacket = new DatagramPacket(new byte[1024], 1024);
			socket.receive(rcvPacket);
			
			byte[] rcvData = rcvPacket.getData();
			int length = rcvPacket.getLength();
			String message = new String(rcvData, 0, length, "utf-8");
			
			System.out.println("[server] receive : " + message);
			
			byte[] sndData = message.getBytes("utf-8");
			DatagramPacket sndPacket = new DatagramPacket(sndData, sndData.length, rcvPacket.getAddress(), rcvPacket.getPort());
			socket.send(sndPacket);
			
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(socket != null && socket.isClosed() == false) {
				socket.close();
			}
		}
	}

}
