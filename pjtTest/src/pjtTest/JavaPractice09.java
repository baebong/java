package pjtTest;

public class JavaPractice09 {

	/*
	 * public JavaPractice09() { // 기본 생성자는 굳이 생성하지 않아도 기본적으로 내포되어 있음.
	 * 
	 * }
	 */

	// 객체와 메모리

	// 메모리에서 객체생성(동적생성)
	// 객체는 메모리에서 동적으로 생성되며, 객체가 더이상 필요없게 되면 GC(Garbage Collector)에 의해서 제거된다.

	// 레퍼런스(가리킨다)
	// "ChildClass child = new ChildClass();"에서 "child"를 레퍼런스라고 한다.
	// 레퍼런스에는 객체의 주소값이 들어있다.
	// 클래스가 같다고 해서 동일한 객체라고 할 수 없다. (=주소값이 다 다르기 때문)

	// 자료형이 같아도 다른 객체
	// 자료형이 같아도 다른 공간에 존재하는 객체는 다른 객체이다.

	// null과 NullPointException
	// 레퍼런스에 null이 저장되면 객체의 연결이 끊기며, 더이상 객체를 이용할 수 없다.
	public void getInfo() {
		System.out.println("Null Point Exception Test");
	}

	public static void main(String[] args) {

		// 레퍼런스(가리킨다)
		JavaPractice09 test1 = new JavaPractice09();
		JavaPractice09 test2 = new JavaPractice09();
		JavaPractice09 test3 = new JavaPractice09();

		System.out.println(test1); // test1 주소값 출력
		System.out.println(test2); // test2 주소값 출력
		System.out.println(test3); // test3 주소값 출력

		// 자료형이 같아도 다른 객체
		if (test1 == test2) {
			System.out.println("test1==test2");
		} else {
			System.out.println("test1!=test2");
		}

		if (test2 == test3) {
			System.out.println("test2==test3");
		} else {
			System.out.println("test2!=test3");
		}

		if (test3 == test1) {
			System.out.println("test3==test1");
		} else {
			System.out.println("test3!=test1");
		}

		// null과 NullPointException
		System.out.println(test1);
		test1.getInfo();

		test1 = null;
		System.out.println(test1); // null 출력
//		test1.getInfo(); // 주소값에서 null이 되어 가리키고 있던 객체가 사라짐

	}

}
