package oop;

public class Product {
	// Instance variables
	private String name;
	private int price;
	
	// Constructor 
	public Product(String n, int p) {
		name = n;
		price = p;
	}

	// Methods
	public void print() {
		System.out.println(name);
		System.out.println(price);
	}

	public int getSellingPrice() {
		return price + price * 10 / 100;
	}

}
