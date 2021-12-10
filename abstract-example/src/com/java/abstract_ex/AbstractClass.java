package com.java.abstract_ex;

public abstract class AbstractClass {

	int num;
	String str;

	public AbstractClass() {
		System.out.println("AbstractClass Constructor");
	}

	public AbstractClass(int i, String s) {
		System.out.println("AbstractClass Constructor");

		this.num = i;
		this.str = s;
	}

	public void fun1() {
		System.out.println("-- fun1() START --");
	}

	public abstract void fun2();

}
