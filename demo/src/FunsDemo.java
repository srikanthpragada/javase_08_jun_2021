
public class FunsDemo {

	public static void main(String[] args) {
		System.out.println(max(10, 20, 15, 25, 18));
		System.out.println(max(100, 20, 54));
	}

	public static int max(int... values) {

		int largest = values[0];
		for (int v : values) 
			if (v > largest)
				largest = v;

		return largest;

	}

}
