package oop;

public class Product {
	// Instance variables 
	private String name;
	private int price;

	// Methods 
	public void print() {
		System.out.println(name);
		System.out.println(price);
	}

	public int getSellingPrice() {
		return price + price * 10 / 100;
	}
	
	public void init(String n, int p) {
		name = n;
		price = p;
	}

}
