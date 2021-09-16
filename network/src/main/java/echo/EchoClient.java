package echo;

import java.io.*;
import java.net.*;
import java.util.*;

public class EchoClient {
	private static final String SERVER_IP = "127.0.0.1";
	private static final int SERVER_PORT = 6000;
	
	public static void main(String[] args) {
		
		Socket socket = null; //소켓 초기화
		Scanner scanner = null; //스캐너 초기화
		
		try {
			
			scanner = new Scanner(System.in); //스캐너 선언
			
			socket = new Socket(); //소켓 선언
			
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT)); //서버 아이피, 포트주소를 들고와서 소켓에 연결
			log("connected"); //연결 되자마자 sysout으로 콘솔에 찍어줌
			/*
			private static void log(String log) {
				System.out.println("[Echo Client] " + log);
			}
			*/
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
			//new InputStreamReader(socket.getInputStream(), "UTF-8") 내가 입력한 인풋 스트림 데이터를 utf-8 타입으로 받는다
			
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);

			while(true) { //무한루프
				System.out.print(">");
				String line = scanner.nextLine();
				
				if("quit".equals(line)) {
					System.out.println("님이 퇴장하셨습니다.");
					break;
				}
				
				pw.println(line);
				
				String data = br.readLine();
				if(data == null) {
					log("closed by server");
					break;
				}
				
				System.out.println("<" + data);
			}
		} catch(SocketException e) {
			log("suddenly closed by server");
		} catch(IOException e) {
			log("error:" + e);
		} finally {
			try {
				if(scanner != null) {
					scanner.close();
				}
				if(socket != null && socket.isClosed() == false) {
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void log(String log) {
		System.out.println("[Echo Client] " + log);
	}
}