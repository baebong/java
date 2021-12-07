package com.java.inner;

public class OuterClass {

	int num = 10;
	String outStr1 = "JAVA";
	static String outStr2 = "World";

	public OuterClass() {
		System.out.println("OuterClass Constructor");
	}

	class InnerClass {

		int num = 100;
		String inStr1 = outStr1;
		String inStr2 = outStr2;

		public InnerClass() {
			System.out.println("InnerClass Constructor");
		}

	}

	// static 클래스는 외부 클래스 멤버에 접근할 수 없다.
	static class StaticInnerClass {

		int num = 1000;
		String sInStr1 = outStr2;
		// String sInStr2 = outStr1; // static 클래스는 외부 클래스 멤버에 접근할 수 없다.

		public StaticInnerClass() {
			System.out.println("static InnerClass Constructor");
		}

	}

}
