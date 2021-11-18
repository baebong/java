package pjtTest;

// 객체지향프로그래밍(Object-Oriented Programming=OOP)

// 객체란?
// 세상에 존재하는 모든 것을 뜻하며, 프로그래밍에서 속성과 기능을 가지는 프로그램 단위이다.

// 클래스란?
// 객체를 생성하기 위한 틀로 모든 객체는 클래스로부터 생성된다. ex) 붕어빵 틀

// 클래스 구성요소
// 클래스는 속성(멤버 변수)와 기능(메서드)로 구성된다.

public class JavaPractice07 { // 클래스 이름 : 일반적으로 첫글자는 대문자로 한다.

	// 클래스 제작
	// 클래스는 멤버 변수(속성), 메서드(기능), 생성자 등으로 구성된다.

	// 멤버 변수(속성)
	public String book; // "public" : 접근제어자
	public String subject;
	public int time;

	// 생성자(Constructor)
	// 클래스 이름과 동일한 이름을 가진 메서드
	// 반환형이 없음
	public JavaPractice07() {
		System.out.println("JavaPractice07 Class Constructor - 1"); // 생략가능
	}

	public JavaPractice07(String b, String s, int t) {
		System.out.println("JavaPractice07 Class Constructor - 2"); // 생략가능
		book = b;
		subject = s;
		time = t;
	}

	// C언어의 "함수" = JAVA의 "메서드"
	// 메서드1(기능)
	public void study() { // "void" : 반환값(반환할 값의 자료형)이 없을 때 사용
		System.out.println("-- study --");
	}

	// 메서드2(기능)
	public void rest() {
		System.out.println("-- rest --");
	}

	// 메서드2(기능)
	public void info() {
		System.out.println("-- info --");
		System.out.println("book : " + book);
		System.out.println("subject : " + subject);
		System.out.println("time : " + time);
	}

	public static void main(String[] args) {

		// 클래스로부터 "new"를 이용해서 객체를 생성한다.
		JavaPractice07 test1 = new JavaPractice07(); // 생성자 호출
		test1.book = "Java";
		test1.subject = "Programming";
		test1.time = 120;

		test1.study();
		test1.rest();
		test1.info();

		System.out.println();

		JavaPractice07 test2 = new JavaPractice07();
		test2.book = "Python";
		test2.subject = "Programming";
		test2.time = 110;

		test2.study();
		test2.rest();
		test2.info();

		System.out.println();

		JavaPractice07 test3 = new JavaPractice07("C++", "Programming", 150);

		test3.study();
		test3.rest();
		test3.info();

		System.out.println();

		test3.book = "JavaScript";
		test3.info();

		System.out.println();

	}

}
