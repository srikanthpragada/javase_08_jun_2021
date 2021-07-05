package io;

import java.io.BufferedReader;
import java.io.FileReader;

public class PrintLongNames {

	public static void main(String[] args) throws Exception {
		String line;

		try (var fr = new FileReader("langs.txt"); 
			 var br = new BufferedReader(fr)) {
			while (true) {
				line = br.readLine();
				if (line == null) // EOF
					break;

				if (line.length() > 4)
					System.out.println(line);
			}
		}
	}

}
