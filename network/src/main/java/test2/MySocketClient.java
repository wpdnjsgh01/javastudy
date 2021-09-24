package test2;

import java.io.IOException;
import java.net.Socket;

public class MySocketClient {
	
	public static void main(String[] args) {
		
		Socket socket = null;
		
		try {
			
			socket = new Socket("127.0.0.1", 60000); 
			System.out.println("연결되었습니다.");
			
			//항상 값을 클라이언트로 보내주는 쓰레드
			ToClientThread lThread = new ToClientThread(socket);
			//항상 값을 서버로 보내주는 쓰레드
			ToServerThread wThread = new ToServerThread(socket);

			
			//소켓 생성되자마자 보내주고 받는 쓰레드 두개 실행
			lThread.start(); // ListeningThread Start
			wThread.start(); // WritingThread Start
            
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

