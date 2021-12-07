package com.java.inheritance;

public class FirstChildClass extends ParentClass {
	
	public FirstChildClass() {
		System.out.println("FirstChildClass Constructor");
	}

	@Override
	public void makeJJajang() {
		System.out.println("-- FirstChildClass() makeJJajang() START --");
	}

}
