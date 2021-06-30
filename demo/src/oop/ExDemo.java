package oop;

public class ExDemo {

	public static void main(String[] args) {
		String input = "0";

		try {
			int num = Integer.parseInt(input);
			System.out.println(100 / num);
		} catch (NumberFormatException ex) {
			System.out.println("Invalid Number!");
		}

		System.out.println("The End!");

	}

}
