package library;

class Product {
	private String name;
	private int price;

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return this.name + " - " + this.price;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Product other) {
			return this.name.equals(other.name) && this.price == other.price;
		} else
			return false;
	}

	@Override
	public int hashCode() {
		 return this.price;
	}

}

public class TestProduct {

	public static void main(String[] args) {
		Product p1 = new Product("Bose Speakers", 40000);
		System.out.println(p1.hashCode());
		Product p2 = new Product("PowerBeats Pro", 35000);
		System.out.println(p2.hashCode());
		Product p3 = new Product("Bose Speakers", 40000);
		System.out.println(p3.hashCode());

		System.out.println(p1 == p3);
		System.out.println(p1.equals(p3));
		System.out.println(p1.toString());

		System.out.println(p1.equals("Abc"));

	}

}
