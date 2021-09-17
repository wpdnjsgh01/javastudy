package Multitest;

import java.io.IOException;
import java.net.Socket;

// 소켓통신용 클라이언트 부분
public class MySocketClient {

	public static void main(String[] args) {
		
		try {
			Socket socket = null;
            		// 소켓 서버에 접속
			socket = new Socket("218.154.207.14", 60000); 
			System.out.println("접속 성공"); // 접속 확인용
			
            		// 서버에서 보낸 메세지 읽는 Thread
			ToClientThread clientThread = new ToClientThread(socket);
			ToServerThread serverThread = new ToServerThread(socket); // 서버로 메세지 보내는 Thread

			clientThread.start(); // ListeningThread Start
			serverThread.start(); // WritingThread Start
            
		} catch (Exception e) {
			e.printStackTrace(); // 예외처리
		}
	}
}