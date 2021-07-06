package io;

import java.io.RandomAccessFile;

public class WriteMarks {

	public static void main(String[] args) throws Exception {
		 
		var raf = new RandomAccessFile("marks.dat","rw");
		
		for(int i = 1; i <= 60; i ++) {
			int marks = (int) Math.round(Math.random() * 100);
			raf.writeInt(marks);
		}
		
		raf.close();
	}

}
