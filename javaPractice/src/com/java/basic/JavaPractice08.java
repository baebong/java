package com.java.basic;

public class JavaPractice08 {

	// 메서드
	// 메서드 선언과 호출
	// 메서드도 변수와 같이 선언 및 정의 후 필요시에 호출해서 사용한다.
	// 메서드 선언 : public(접근자) void(반환형) getInfo()(메서드이름, '()'매개변수) {메서드 정의}
	// '{}'안의 내용을 메서드 정의라고 함.
	// 메서드 호출 : 클래스명.메서드명;
	// '.' : 도트접근자

	// 접근자 : 메서드의 허용여부 판가름
	// 반환형 : 메서드의 결과값에 대한 자료형 결정
	// 메서드 이름 : 클래스와 다르게 소문자로 시작, 가독성을 높히기 위해 동사+명사로 이름짓기

	// 매개변수(Parameter)
	// 메서드를 호출할 때 데이터를 전달할 수 있다.
	// 매개변수(Parameter)는 필요시에만 정의된다.
	// 매개변수(Parameter)는 자료형과 변수(지역변수)로 이루어진다.

	// 중복메서드(Overloading)
	// 이름은 같고, 매개변수의 개수 또는 타입이 다른 메서드를 만들 수 있다.
	// public void getInfo(){}
	// public void getInfo(int x, int y){}
	// public void getInfo(String s1, String s2){}

	// 접근자
	// 메서드를 호출할 때 접근자에 따라서 호출이 불가할 수 있다.
	// private(외부에서 접근불가), public(외부에서 접근가능) etc.

	public String name;
	public String gender;
	public int age;

	public JavaPractice08() {
		System.out.println("--- JavaPractice08 Constructor ---");
	}

	public void getInfo() { // 매개변수(Parameter)는 필요시에만 정의된다.
		System.out.println("--- getInfo() START 1 ---");
		System.out.println("name : " + name);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
	}

	public void getInfo(int x, int y) {
		System.out.println("--- getInfo() START 2 ---");
		System.out.printf("parameter >> x : %d, y : %d\n", x, y);
	}

	public void getInfo(String s1, String s2) {
		System.out.println("--- getInfo() START 3 ---");
		System.out.printf("parameter >> s1 : %s, s2 : %s\n", s1, s2);
	}

	public void setInfo(String n, String g, int a) { // 매개변수(Parameter)는 자료형과 변수(지역변수)로 이루어진다.
		System.out.println("--- setInfo() START ---");

		name = n;
		gender = g;
		age = a;

	}

	public static void main(String[] args) {

		JavaPractice08 child = new JavaPractice08();

		child.name = "dexter";
		child.gender = "male";
		child.age = 32;

		child.getInfo();

		System.out.println();

		child.setInfo("james", "male", 15);

		child.getInfo();

		System.out.println();

		JavaPractice08 over = new JavaPractice08();

		over.getInfo();
		over.getInfo(2, 3);
		over.getInfo("hi", "java");

	}

}
