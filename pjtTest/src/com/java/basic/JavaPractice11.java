package com.java.basic;

public class JavaPractice11 {

	// 패키지(Package)와 import, static ☆☆☆☆☆

	// 패키지(Package) >>>>>
	// java 프로그램은 많은 클래스로 구성되고, 이러한 클래스를 '폴더' 형식으로 관리하는 것을 패키지라고 한다.

	// 패키지(Package) 이름 결정 요령
	// 1. 패키지에 속해 있는 클래스가 최대한 다른 클래스와 중복되는 것을 방지하도록 만든다.
	// 2. 패키지 이름은 일반적으로 도메인을 거꾸로 이용한다.
	// 3. 개발 중에 패키지의 이름과 구조는 변경될 수 있다.
	// 4. 패키지 이름만 보고도 해당 패키지 안에 있는 클래스가 어떤 속성과 기능을 가지고 있는지 예상이 될 수 있도록 이름을 짓는다.

	// import >>>>>
	// 다른 패키지에 있는 클래스를 사용하기 위해서는 import 키워드를 이용한다.

	// import 사용할 패키지 이름.사용할 클래스 이름;
	// import com.java.basic.JavaPractice11;

	// 한 패키지 안의 여러 클래스를 사용하고 싶다면 "*"를 이용한다.
	// import com.java.basic.*;

	// static >>>>>
	// 클래스의 속성과 메서드에 static 키워드를 사용하면 어디서나 속성과 메서드를 공유할 수 있다.
	// static int amount = 0;

}
