package oop;

public class TestSavingsAccount {

	public static void main(String[] args) {

		SavingsAccount s1 = new SavingsAccount(1, "Scott");
		SavingsAccount s2 = new SavingsAccount(2, "Mark", 10000);
		// SavingsAccount s3 = new SavingsAccount();
		

		s1.deposit(10000);
		s1.withdraw(5000);
		s1.print();

		if (s2.getBalance() == 0)
			System.out.println("Zero balance account!");

	}

}
