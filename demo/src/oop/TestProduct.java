package oop;

public class TestProduct {

	public static void main(String[] args) {

		System.out.println(Product.getTaxrate());

		Product p; // Object reference

		p = new Product("PowerBeats", 10000);
		p.print();

	}

}
