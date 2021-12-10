package com.java.abstract_ex;

public class MainClass {

	public static void main(String[] args) {

		AbstractClass ex = new ClassEx(10, "JAVA");

		ex.fun1(); // ClassEx 클래스가 AbstractClass 클래스를 상속받고 있기 때문에 호출가능
		ex.fun2();

	}

}
