package io;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class ListMarks {

	public static void main(String[] args) throws Exception {
		 
		var raf = new RandomAccessFile("marks.dat","r");
	 
		var count = raf.length() / 4;
		
		for(int i = 1; i <= count ; i ++)
			System.out.printf("%2d %3d\n",i, raf.readInt());
		
		raf.close();
	}

}
