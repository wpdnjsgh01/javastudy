package test;

import java.io.*;
import java.net.*;

public class TCPClient {

	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = 5000;

	public static void main(String[] args) {
		Socket socket = null;

		try {
			// 1. 소켓 생성
			socket = new Socket();

			// 2. 서버 연결
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));
			//InetSocketAddress
			//이 클래스는 IP 소켓 주소 (IP 주소 + 포트 번호)를 구현합니다.
			//또한 쌍 (호스트 이름 + 포트 번호) 일 수도 있습니다.이 경우 호스트 이름을 확인하려고 시도합니다. 
			//해결에 실패하면 주소는unresolved프록시를 통한 연결과 같은 일부 환경에서는 여전히 사용할 수 있습니다.

			// 3. IO Stream 받아오기
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();

			// 4. 쓰기
			String data = "Hello World";
			os.write(data.getBytes("UTF-8"));
			//getBytes == 인코딩 형식 바꾸기

			// 5. 읽기
			byte[] buffer = new byte[256];
			int readByteCount = is.read(buffer); // blocking
			if (readByteCount == -1) {
				// 클라이언트가 정상적으로 종료(close() 호출)
				System.out.println("[client] closed by server");
			}

			data = new String(buffer, 0, readByteCount, "UTF-8");
			System.out.println("[client] received:" + data);
		} catch (SocketException e) {
			System.out.println("[client] suddenly closed by server");
		} catch (IOException e) {
			System.out.println("[client] error: " + e);
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