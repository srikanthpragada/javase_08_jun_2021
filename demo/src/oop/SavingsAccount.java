package oop;

public class SavingsAccount {
	private int acno;
	private String ahname;
	private double balance;

	public SavingsAccount(int acno, String ahname) {
		this.acno = acno;
		this.ahname = ahname;
	}

	public SavingsAccount(int acno, String ahname, double balance) {
		this.acno = acno;
		this.ahname = ahname;
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
