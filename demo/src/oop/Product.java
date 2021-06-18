package oop;

public class Product {
	// Instance variables
	private String name;
	private int price;
	// static or class variable
	private static double taxrate = 12;
	private static int count;
	
	public static int getCount() {
		return Product.count; 
	}
	
	public static double getTaxrate() {
		return Product.taxrate;
	}
	
	// Constructor 
	public Product(String name, int price) {
		 this.name = name;
		 this.price = price;
		 Product.count ++;
	}

	// Methods
	public void print() {
		System.out.println(this.name);
		System.out.println(this.price);
	}

	public double getSellingPrice() {
		return this.price + this.price * Product.taxrate / 100;
	}

}
