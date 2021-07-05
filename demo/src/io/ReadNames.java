package io;

import java.io.FileReader;

public class ReadNames {

	public static void main(String[] args) throws Exception {
		var fr = new FileReader("langs.txt");
		int ch;

		while (true) {
			ch = fr.read();
			if (ch == -1) // EOF
				break;
			System.out.print((char) ch);
		}
		fr.close();
	}

}
