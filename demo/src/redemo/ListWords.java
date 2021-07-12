package redemo;

import java.util.regex.Pattern;

public class ListWords {

	public static void main(String[] args) {
		var st = "How do    you do?. Hope    you are fine!!!!";
		var pattern = Pattern.compile("\\s+");
		var matcher = pattern.matcher(st);
		System.out.println(matcher.replaceAll(" "));
	}
}
