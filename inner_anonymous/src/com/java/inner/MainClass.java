package com.java.inner;

public class MainClass {

	public static void main(String[] args) {

		OuterClass out = new OuterClass();
		System.out.println("out.num : " + out.num);
		System.out.println("out.outStr1 : " + out.outStr1);
		System.out.println("out.outStr2 : " + out.outStr2);
		System.out.println();

		// 멤버 inner 클래스
		OuterClass.InnerClass in = out.new InnerClass();
		System.out.println("in.num : " + in.num);
		System.out.println("in.inStr1 : " + in.inStr1);
		System.out.println("in.inStr2 : " + in.inStr2);
		System.out.println();

		// static inner 클래스
		OuterClass.StaticInnerClass sin = new OuterClass.StaticInnerClass();
		System.out.println("sin.num : " + sin.num);
		System.out.println("sin.inStr1 : " + sin.sInStr1);
		System.out.println();

	}

}
