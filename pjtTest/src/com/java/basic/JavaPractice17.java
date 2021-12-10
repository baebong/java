package com.java.basic;

public class JavaPractice17 {

	// 추상클래스(Abstract Class)
	// 클래스의 공통된 부분을 뽑아서 별도의 클래스(추상클래스)로 만들어 놓고, 이것을 상속해서 사용한다.

	// 추상(abstract) 클래스의 특징
	// 1. 멤버변수를 가진다.
	// 2. abstract 클래스를 상속하기 위해서는 extends를 이용한다.
	// 3. abstract 메서드를 가지며, 상속한 클래스에서 반듯이 구현해야 한다.
	// 4. 일반 베서드도 가질 수 있다.
	// 5. 일반 클래스와 마찬가지로 생성자도 있다.

	// 추상클래스 구현
	// 클래스 상속과 마찬가지로 extends 키워드를 이용해서 상속하고 abstract 메서드를 구현한다.

	// 인터페이스 vs 추상클래스

	// 공통점
	// 1. 추상 메서드를 가진다.
	// 2. 객체 생성이 불가하며 자료형(Type)으로 사용된다.

	// 차이점 - 인터페이스
	// 1. 상수, 추상 메서드만 가진다.
	// 2. 추상 메서드를 구현만 하도록 한다.
	// 3. 다형성을 지원한다.

	// 차이점 - 추상클래스
	// 1. 클래스가 가지는 모든 속성과 기능을 가진다.
	// 2. 추상 메서드 구현 및 상속의 기능을 가진다.
	// 3. 단일 상속만 지원한다.

}
