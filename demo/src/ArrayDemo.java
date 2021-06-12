
public class ArrayDemo {

	public static void main(String[] args) {
		int a[] = new int[5];

		for (var i = 0; i < a.length; i++)
			System.out.println(a[i]);

		System.out.println("\nEnhanced For Loop\n");
		
		for (var n : a)
			System.out.println(n);

	}

}
