package oop;


public class SavingsAccount {
	// Instance variables 
	private int acno;
	private String ahname;
	private double balance;
	private final static int MINBAL = 5000;
	
	// Class variables
	private static double rate = 3.0;

	public SavingsAccount(int acno, String ahname) {
		this.acno = acno;
		this.ahname = ahname;
	}

	public SavingsAccount(int acno, String ahname, double balance) {
		this(acno,ahname);  // call another constructor
		this.balance = balance;
	}

	public void print() {
		System.out.println(acno);
		System.out.println(ahname);
		System.out.println(balance);
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

	public double getBalance() {
		return balance;
	}

}
