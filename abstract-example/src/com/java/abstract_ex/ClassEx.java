package com.java.abstract_ex;

public class ClassEx extends AbstractClass {

	public ClassEx() {
		System.out.println("ClassEx Contructor");
	}

	public ClassEx(int i, String s) {
		super(i, s); // 상위 클래스로 올리기
	}

	@Override
	public void fun2() { // 강제로 반듯이 구현하도록 함
		System.out.println("-- fun2() START --");
	}

}
