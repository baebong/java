package com.java.bank;

public class MainClass {

	public static void main(String[] args) {

		Bank myBank = new MyBank("박찬호", "123-4567-89012", 1000);

		myBank.deposit();
		myBank.withdraw();
		myBank.installmentSavings();
		myBank.cancellation();

		System.out.println();

		myBank.getInfo();

	}

}
