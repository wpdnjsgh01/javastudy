package toy;
import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
       ServerSocket serverSocket = null ;
       try {
           serverSocket = new ServerSocket();
           serverSocket.bind( new InetSocketAddress( "localhost", 10001 ) );
           System.out.println( "[서버] 연결 기다림");
           Socket socket = serverSocket.accept();
          System.out.println( "[서버] 연결됨");
          socket.close();  
       } catch (IOException e) {
           e.printStackTrace();
       } finally {
           if( serverSocket != null && serverSocket.isClosed() == false ) {
              try {
                  serverSocket.close();
              } catch( IOException ex ) {
                  ex.printStackTrace();
              }
           }
       }
       
    }
 }