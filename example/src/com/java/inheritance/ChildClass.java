package com.java.inheritance;

public class ChildClass extends ParentClass {

	int openYear = 2000;

	public ChildClass() {
		System.out.println("ParentClass Constructor");
	}

	public void childFun() {
		System.out.println("-- childFun() START --");
	}

	@Override
	public void makeJJajang() {
		System.out.println("-- more delicious makeJJajang() START --");
	}

	public void getOpenYear() {
		System.out.println("ChildClass's Open Year : " + this.openYear);
		System.out.println("ParentClass's Open Year : " + super.openYear);
	}

}
