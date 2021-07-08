package network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class CountAnchorElements {

	public static int countString(String mainString, String subString) {
		int pos = -1;
		int count = 0;
		while (true) {
			pos = mainString.indexOf(subString, pos + 1);
			if (pos == -1)
				break;
			count++;
		}
		return count;
	}

	public static void main(String[] args) throws Exception {
		URL urlobj = new URL("http://www.srikanthtechnologies.com");
		Reader r = new InputStreamReader(urlobj.openStream());
		var br = new BufferedReader(r);
		int count = 0;
		String word = "<img";

		while (true) {
			var line = br.readLine();
			if (line == null)
				break;

			count += countString(line, word);
		}
		System.out.printf("%s found %d times", word, count);
	}

}
