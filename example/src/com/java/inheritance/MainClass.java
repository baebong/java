package com.java.inheritance;

import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {

		ChildClass childClass = new ChildClass();

		childClass.childFun();
		childClass.parentFun(); // 부모클래스 참조가능

		// childClass.privateFun(); // 오류남

		// 메서드 오버라이드(Override) = 재정의
		System.out.println();
		childClass.makeJJajang();

		// 자료형(Type)
		System.out.println();
		ParentClass[] parentClass = new ParentClass[2];
		parentClass[0] = new FirstChildClass();
		parentClass[1] = new SecondChildClass();

		for (int i = 0; i < parentClass.length; i++) {
			parentClass[i].makeJJajang();
		}

		// super 클래스
		System.out.println();
		childClass.getOpenYear();

	}

}
