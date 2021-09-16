package Multitest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Writer;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class ChatServerThread extends Thread{

	private String nickname;
	private Socket socket;
	
	public ChatServerThread(Socket socket) {
		this.socket = socket;
	}
	
	public void start() {
		super.start();
	}
	
}
