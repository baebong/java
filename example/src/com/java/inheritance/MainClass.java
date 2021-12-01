package com.java.inheritance;

public class MainClass {

	public static void main(String[] args) {

		ChildClass childClass = new ChildClass();

		childClass.childFun();
		childClass.parentFun(); // 부모클래스 참조가능

		// childClass.privateFun(); // 오류남

	}

}
