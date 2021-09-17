package Multitest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ToClientThread extends Thread { // 서버에서 보낸 메세지 읽는 Thread
	Socket socket = null;

	public ToClientThread(Socket socket) { // 생성자
		this.socket = socket; // 받아온 Socket Parameter를 해당 클래스 Socket에 넣기
	}
	
	public void run() {
		try {
			// InputStream - Server에서 보낸 메세지를 클라이언트로 가져옴
			InputStream input = socket.getInputStream();
            		// socket의 InputStream 정보를 InputStream in에 넣은 뒤
			BufferedReader br = new BufferedReader(new InputStreamReader(input));

			while(true) { // 무한반복
				System.out.println(br.readLine());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
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