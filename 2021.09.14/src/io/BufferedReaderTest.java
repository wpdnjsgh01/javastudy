package io;

import java.io.*;

public class BufferedReaderTest {

	@SuppressWarnings({ "resource", "null" })
	public static void main(String[] args) {

		BufferedReader br = null;
		
		try {
			
			//기반 스트림
			FileReader fr = new FileReader("./src/main/java/io/BufferedReaderTest.java");
			
			//보조 스트림
			new BufferedReader(fr);
			
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
