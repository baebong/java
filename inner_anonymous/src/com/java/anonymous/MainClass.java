package com.java.anonymous;

public class MainClass {

	public static void main(String[] args) {

		// 익명(anonymous) 클래스
		// 한 번 사용하고 버리는 용도
		// 인터페이스나 추상클래스에서 주로 이용된다.
		new AnonymousClass() {

			@Override
			public void method() {
				System.out.println("-- AnonymousClass's Override method() START --");
			}

		}.method();

	}

}
