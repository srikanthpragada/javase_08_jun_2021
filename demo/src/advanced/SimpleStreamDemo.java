
package advanced;

import java.util.Arrays;

public class SimpleStreamDemo {

	public static void main(String[] args) {
		var marks = new int[] { 90, 56, 45, 87, 67, 34,88,59,23, 93 };

		Arrays.stream(marks).filter(v -> v >= 50)                  // filter(IntPredicate)
		                    .sorted()
		                    .forEach(v -> System.out.println(v));  // forEach(Consumer)
	}

}
