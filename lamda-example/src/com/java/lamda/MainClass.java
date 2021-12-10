package com.java.lamda;

public class MainClass {

	public static void main(String[] args) {

		// 매개변수와 실행문만으로 작성한다. (접근자, 반환형, return 키워드 생략)
		LamdaInterface01 li1 = (String s1, String s2, String s3) -> {
			System.out.println(s1 + " " + s2 + " " + s3);
		};

		System.out.println("매개변수와 실행문만으로 작성한다. (접근자, 반환형, return 키워드 생략)");
		li1.method("Hello", "JAVA", "World");
		System.out.println();

		// 매개변수가 1개이거나 타입이 같을 때, 타입을 생략할 수 있다.
		LamdaInterface01 li2 = (s1, s2, s3) -> {
			System.out.println(s1 + " " + s2 + " " + s3);
		};

		System.out.println("매개변수가 1개이거나 타입이 같을 때, 타입을 생략할 수 있다.");
		li2.method("Hello", "JAVA", "World");
		System.out.println();

		LamdaInterface02 li3 = (s1) -> {
			System.out.println(s1);
		};

		li3.method("Hello");
		System.out.println();

		// 실행문이 1개일 때, '{ }'를 생략할 수 있다.
		LamdaInterface02 li4 = (s1) -> System.out.println(s1);

		System.out.println("실행문이 1개일 때, '{ }'를 생략할 수 있다.");
		li4.method("Hello");
		System.out.println();

		// 매개변수와 실행문이 1개일 때, '( )'와 '{ }'를 생략할 수 있다.
		LamdaInterface02 li5 = s1 -> System.out.println(s1);

		System.out.println("매개변수와 실행문이 1개일 때, '( )'와 '{ }'를 생략할 수 있다.");
		li5.method("Hello");
		System.out.println();

		// 매개변수가 없을 때, '( )'만 작성한다.
		LamdaInterface03 li6 = () -> System.out.println("no parameter");

		System.out.println("매개변수가 없을 때, '( )'만 작성한다.");
		li6.method();
		System.out.println();

		// 반환값이 있는 경우
		LamdaInterface04 li7 = (x, y) -> {
			int result = x + y;
			return result;
		};

		System.out.println("반환값이 있는 경우");
		System.out.printf("li7.method(10, 20) : %d\n", li7.method(10, 20));

		li7 = (x, y) -> {
			int result = x - y;
			return result;
		};

		System.out.printf("li7.method(10, 20) : %d\n", li7.method(10, 20));

		li7 = (x, y) -> {
			int result = x * y;
			return result;
		};

		System.out.printf("li7.method(10, 20) : %d\n", li7.method(10, 20));

	}

}
