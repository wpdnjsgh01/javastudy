package io;

import java.io.*;

public class ByteExam01 {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src/io/ByteExam01.java");
			fos = new FileOutputStream("src/io/byte2.txt");
			
			int readCount = -1;
			byte[] buffer = new byte[1024];
			
			while((readCount = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, readCount);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		
	}

}
