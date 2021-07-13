package advanced;

import java.util.Arrays;
import java.util.Comparator;

class LengthCompare implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

public class LambdaDemo2 {

	public static void main(String[] args) {
		var names = new String[] { "python", "Java", "JavaScript", "c", "Ruby", "TypeScript" };

		Arrays.sort(names);

		for (var n : names)
			System.out.println(n);

		// Arrays.sort(names, new LengthCompare()); // Array, Comparator

		System.out.println("Length based Sorting");
		Arrays.sort(names, (s1, s2) -> s1.length() - s2.length());

		for (String n : names)
			System.out.println(n);

		System.out.println("Case Insensitive Sorting");
		Arrays.sort(names, (s1, s2) -> 
		            s1.toUpperCase().compareTo(s2.toUpperCase()));

		for (String n : names)
			System.out.println(n);

	}

}
