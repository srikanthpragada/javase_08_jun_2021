package oop;

interface Printable {
	void print();
}

class MyClass implements Printable {
	@Override
	public void print() {
		System.out.println("I am in print()");	    
	}
}

public class TestPrintable {

	public static void main(String[] args) {
		Printable p = new MyClass();
		p.print(); 
	}

}
