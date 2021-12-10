package com.java.bank;

public abstract class Bank {

	// 일반 멤버
	String name;
	String account;
	int totalAmount;

	// 생성자
	public Bank() {
		System.out.println("Bank Constructor");
	}

	public Bank(String name, String account, int totalAmount) {
		System.out.println("Bank Constructor");

		this.name = name;
		this.account = account;
		this.totalAmount = totalAmount;
	}

	// 일반 메서드
	// 예금
	public void deposit() {
		System.out.println("-- deposit() START --");

	}

	// 출금
	public void withdraw() {
		System.out.println("-- withdraw() START --");

	}

	// 추상 메서드
	// 적금
	public abstract void installmentSavings();

	// 해약
	public abstract void cancellation();

	// 정보출력
	public void getInfo() {
		System.out.printf("name : %s\n", name);
		System.out.printf("account : %s\n", account);
		System.out.printf("totalAmount : %d\n", totalAmount);

	}

}
