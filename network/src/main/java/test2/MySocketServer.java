package test2;

import java.io.*;
import java.net.*;
import java.util.*;

public class MySocketServer extends Thread {

	static ArrayList<Socket> LoginedUserList = new ArrayList<Socket>();
	static Socket socket = null;

	public MySocketServer(Socket socket) {
		this.socket = socket;
		LoginedUserList.add(socket);
	}

	public void run() {
		try {
			System.out.println(socket.getInetAddress());

			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));

			OutputStream out = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);

			writer.println("사용할 ID를 입력해주십시오.");

			String inputString;
			String name = null;
			int chgStat = 0;

			while ((inputString = reader.readLine()) != null) {

				if (chgStat == 0) {
					name = inputString;
					writer.println(name + " 연결됨.");
					chgStat++;
					continue;
				}
				
				/*
				if ("exit".equals(inputString)) {
					for (int i = 0; i < LoginedUserList.size(); i++) {
						out = LoginedUserList.get(i).getOutputStream();
						writer = new PrintWriter(out, true);
						writer.println(name + "님이 퇴장하셨습니다.");
						break;
					}
				}
				*/
				
				if ("exit".equals(inputString)) {
						writer.println(name + "님이 퇴장하셨습니다.");
						socket.close();
						break;
				}
				
				for (int i = 0; i < LoginedUserList.size(); i++) {
					out = LoginedUserList.get(i).getOutputStream();
					if(socket.isClosed() == true) {
						break;
					}
					writer = new PrintWriter(out, true);
					writer.println(name + " : " + inputString);
				}
			}
		} catch (IOException e) {
			System.out.println("종료되었습니다.");
		} finally {
			try {
				if (socket.equals(null)) {
					socket.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		try {
			int socketPort = 60000;
			ServerSocket serverSocket = new ServerSocket(socketPort);
			System.out.println("서버 소켓 : " + socketPort);

			while (true) {
				Socket socketUser = serverSocket.accept();
				Thread thd = new MySocketServer(socketUser);
				System.out.print("연결 IP : ");
				thd.start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (socket.equals(null)) {
					socket.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}

	}

}
