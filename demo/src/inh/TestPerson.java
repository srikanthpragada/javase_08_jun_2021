package inh;

abstract class Person {
	protected String name, email;

	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.email);
	}

	// Cannot override
	final public String getEmail() {
		return this.email;
	}
    // Must override 
	abstract public String getOccupation();
}

class Student extends Person {
	private String course;

	public Student(String name, String email, String course) {
		super(name, email); // Call super class's constructor
		this.course = course;
	}

	// Overriding
	@Override
	public void print() {
		super.print();
		System.out.println(this.course);
	}

	public String getCourse() {
		return this.course;
	}

	public String getOccupation() {
		return "Studying " + this.course;
	}
}

class FStudent extends Student {
	private String country;

	public FStudent(String name, String email, String course, String country) {
		super(name, email, course); // Call super class's constructor
		this.country = country;
	}

	// Overriding
	@Override
	public void print() {
		super.print();
		System.out.println(this.country);
	}

	public String getCountry() {
		return this.country;
	}

	public String getOccupation() {
		return "From " + this.country + " and studying " + this.getCourse();
	}
}

public class TestPerson {

	public static void main(String[] args) {

		Person p;
		// = new Person("Joe", "joe@yahoo.com");
		// p.print(); // Runtime polymorphism

		p = new Student("Ben", "ben@gmail.com", "Java");
		p.print(); // Runtime polymorphism
		System.out.println(p.getOccupation()); // Runtime polymorphism

		p = new FStudent("Larry", "larry@gmail.com", "Java", "India");
		p.print();
		System.out.println(p.getOccupation());

	}

}
