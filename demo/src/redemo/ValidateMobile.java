package redemo;

import java.util.regex.Pattern;

public class ValidateMobile {

	public static void main(String[] args) {
		var st = "3939334443";

		if (Pattern.matches("\\d{10}", st))
			System.out.println("Valid Mobile Number!");
		else
			System.out.println("Not a valid Mobile Number!");
	}

}
