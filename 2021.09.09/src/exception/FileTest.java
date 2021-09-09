package exception;

import java.io.*;

public class FileTest {

	public static void main(String[] args) {

		FileInputStream fis = null;

		try {

			fis = new FileInputStream("hello.txt");
			int data = fis.read();

		} catch (FileNotFoundException e) {

			System.out.println("errer : " + e);

		} catch (IOException e) {

			System.out.println("errer : " + e);

		}

		finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
