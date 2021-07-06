package io;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class ReadMarks {

	public static void main(String[] args) throws Exception {
		 
		var raf = new RandomAccessFile("marks.dat","r");
		
		var s = new Scanner(System.in);
		System.out.print("Enter rollno : ");
		int rollno = s.nextInt();
		
		// Calculate the position 
		int pos = (rollno - 1)  * 4;
		
		// Move to pos in file 
		raf.seek(pos);
		
		System.out.println(raf.readInt());
		
		raf.close();
	}

}
