package oop;

import java.util.Arrays;
import java.util.Comparator;

class LengthCompare implements Comparator<String> {
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

public class ComparatorDemo {
	public static void main(String[] args) {
		String names[] = {"R", "Java", "JavaScript", "Python", "C#", "C" };

		// Arrays.sort(names, new LengthCompare());
		
		// Anonymous inner class 
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
		
		// Lambda expression
		// Arrays.sort(names, (s1,s2) -> s1.length() - s2.length());

		for (var n : names)
			System.out.println(n);
	}

}
