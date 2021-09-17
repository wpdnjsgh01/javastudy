package Multitest;

import java.io.*;
import java.net.*;
import java.util.*;

// 소켓통신용 서버 코드
public class MySocketServer extends Thread {

	ArrayList<Socket> list = new ArrayList<Socket>();

	Socket socket = null;

	public MySocketServer(Socket socket) {
		this.socket = socket;
		list.add(socket);
	}

	public void run() {

		try {
		
			System.out.println(socket.getInetAddress() + "에 연결되었습니다.");

			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));

			OutputStream out = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);

			writer.println(">사용할 ID를 입력하십시오.");

			String readValue; // Client에서 보낸 값 저장
			String name = null; // 클라이언트 이름 설정용
			int identify = 0;

			while ((readValue = reader.readLine()) != null) {
				if (identify == 0) { // 연결 후 한번만 노출
					name = readValue; // 이름 할당
					writer.println(name + "님이 접속하셨습니다.");
					identify++;
					continue;
				}

				for (int i = 0; i < list.size(); i++) {
					out = list.get(i).getOutputStream();
					writer = new PrintWriter(out, true);
					writer.println(name + " : " + readValue);
				}
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

	public static void main(String[] args) {
		try {
			int socketPort = 60000;
			ServerSocket serverSocket = new ServerSocket(socketPort);
			System.out.println(socketPort + "번 소켓에 연결되었습니다.");

			while (true) {
				Socket socketUser = serverSocket.accept();
				Thread thd = new MySocketServer(socketUser);
				thd.start(); // Thread 시작
			}

		} catch (IOException e) {
			e.printStackTrace(); // 예외처리
		}

	}

}
