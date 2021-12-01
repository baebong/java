package com.java.employee;

public class EmployeeBankClass {

	String name;
	static int amount = 0; // static은 데이터를 공유할 수 있게 해준다.

	public EmployeeBankClass() {

	}

	public EmployeeBankClass(String name) {
		this.name = name;
	}

	public void saveMoney(int money) {
		amount += money;
		System.out.println("amount : " + amount);
	}

	public void spendMoney(int money) {
		amount -= money;
		System.out.println("amount : " + amount);
	}

	public void getBankInfo() {
		System.out.println("Employee name : " + this.name);
		System.out.println("amount : " + amount);
	}

}
