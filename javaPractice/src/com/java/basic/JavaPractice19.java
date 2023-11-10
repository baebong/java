package com.java.basic;

public class JavaPractice19 {

	// 문자열 클래스

	// String 객체와 메모리
	// 문자열을 다루는 String 클래스(객체)는 데이터가 변화하면 메모리상의 변화가 많아 속도가 느리다.
	// 문자열이 변경되면 기존의 객체를 버리고, 새로운 객체를 메모리에 생성한다. (메모리 비효율성 발생)
	// 이때, 기존 객체는 GC에 의해서 메모리 회수가 이루어진다. (가리키는 주소값이 바뀌기 때문에)

	// StringBuffer, StringBuilder
	// String 클래스의 단점을 보완한 클래스로 데이터가 변경되면 메모리에서 기존 객체를 재활용한다.
	// 문자열이 변경되면 기존의 객체를 재활용한다.
	// 속도는 StringBuilder가 조금 더 빠르며, 데이터 안정성은 StringBuffer가 조금 더 좋다.

	public static void main(String[] args) {

		// String
		String str1 = "JAVA";
		String str2 = new String("JAVA");

		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);

		str1 = str1 + "_8";
		System.out.println("str1 : " + str1);

		// StringBuffer
		StringBuffer sf = new StringBuffer("JAVA");
		System.out.println("sf : " + sf);

		// 글자 이어 붙이기
		sf.append(" World");
		System.out.println("sf : " + sf);

		// 글자 길이 확인하기
		System.out.println("sf.length() : " + sf.length());

		// 원하는 위치의 글자 삽입하기
		sf.insert(sf.length(), "~~~");
		System.out.println("sf : " + sf);

		// 글자 삭제하기
		sf.delete(4, 8);
		System.out.println("sf : " + sf);
		System.out.println();

		// StringBuilder
		StringBuilder sb = new StringBuilder("JAVA World!!");
		System.out.println("sb : " + sb);

	}

}
