package io;

import java.io.*;

public class BufferOutputStreamTest {

	public static void main(String[] args) {

		BufferedOutputStream bos = null;
		
		try {
			//기반스트림
			FileOutputStream fos = new FileOutputStream("test.txt");
			
			//보조스트림
			bos = new BufferedOutputStream(fos);
			
			//a = 97, z = 122
			for(int i = 'a'; i < 'z'; i++) {
				bos.write(i);
			}
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bos != null) {
					bos.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
