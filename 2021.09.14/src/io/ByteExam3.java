package io;
import java.io.*;
public class ByteExam3 {

	public static void main(String[] args) {

		//try-with-resource
		
		try(
				DataOutputStream out = new DataOutputStream(new FileOutputStream("src/io/data1.txt"));
				){
			
		} catch(Exception e) {
			
		} 

	}

}
