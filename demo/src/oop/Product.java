package oop;

public class Product {
	// Instance variables
	private String name;
	private int price;
	
	// Constructor 
	public Product(String n, int p) {
		this.name = n;
		this.price = p;
	}

	// Methods
	public void print() {
		System.out.println(this.name);
		System.out.println(this.price);
	}

	public int getSellingPrice() {
		return this.price + this.price * 10 / 100;
	}

}
