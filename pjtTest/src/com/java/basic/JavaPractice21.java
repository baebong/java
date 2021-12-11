package com.java.basic;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaPractice21 {

	// 예외처리
	// 프로그램에 문제가 발생했을 때 시스템 동작에 문제가 없도록 사전에 예방하는 코드

	// 예외란?
	// 프로그램에 문제가 있는 것을 말하며, 예외로 인해 시스템 동작이 멈추는 것을 막는 것을 '예외처리'라고 한다.

	// Exception VS Error
	// Exception : Error는 개발자가 대처할 수 있음.
	// Error : Error는 개발자가 대처할 수 없음.

	// Checked Exception VS Unchecked Exception
	// Checked Exception : '예외처리'를 반듯이 해야하는 경우 (네트워크, 파일 시스템 등)
	// Unchecked Exception : '예외처리'를 개발자의 판단에 맞기는 경우 (데이터 오류 등)

	// Exception 클래스
	// Exception 클래스 하위클래스로 NullPointerException, NumberFormatException 등이 있다.

	// Exception 클래스 종류 (수십가지가 있다.)
	// NullPointerException : 객체를 가리키지 않고 있는 레퍼런스를 이용할 때
	// ArrayIndexOutOfBoundException : 배열에서 존재하지 않는 인덱스를 가리킬 때
	// NumberFormatException : 숫자데이터에 문자데이터 등을 넣었을 때

	// try {예외가 발생할 수 있는 코드} catch (Exception e) {예외가 발생했을 때 처리할 코드}
	// 개발자가 예외처리하기 가장 쉽고, 많이 사용되는 방법이다.

	// 다양한 예외처리
	// Exception 및 하위클래스를 이용해서 예외처리를 다양하게 할 수 있다.

	// finally {반드시 실행되야할 코드}
	// 에외 발생 여부에 상관없이 반듯이 실행된다.
	// catch 구문 뒤에 넣어주면 된다.

	// throws
	// 예외 발생 시 예외 처리를 직접 하지 않고 호출한 곳으로 넘긴다.

	public void firtMethod() {
		secondMethod();

	}

	public void secondMethod() {
		thirdMethod();

	}

	public void thirdMethod() {
		System.out.println("10 / 0 = " + (10 / 0));
	}

	public static void main(String[] args) {

		JavaPractice21 ex = new JavaPractice21();

		int i = 10;
		int j = 0;
		int r = 0;

		System.out.println("Exception BEFORE");

		// try {예외가 발생할 수 있는 코드} catch (Exception e) {예외가 발생했을 때 처리할 코드}

		try {
			r = i / j;

		} catch (Exception e) {
			e.printStackTrace(); // 에러가 어떤 예외처리가 되었는지 콘솔창에 알려주는 메서드
			String msg = e.getMessage(); // 예외를 간략하게 나타내주는 메서드
			System.out.println("Exception : " + msg);

		}

		System.out.println("Exception AFTER");

		// finally {반드시 실행되야할 코드}
		Scanner sc = new Scanner(System.in);

		int x, y;
		ArrayList<String> list = null;

		int[] iArr = { 0, 1, 2, 3, 4 };

		System.out.println("Exception BEFORE");

		try {
			System.out.print("input x : ");
			x = sc.nextInt();

			System.out.print("input y : ");
			y = sc.nextInt();
			System.out.println();

			System.out.println("x / y = " + (x / y));

			for (int k = 0; k < 5; k++) {
				System.out.println("iArr[" + k + "] : " + iArr[k]);

			}

			System.out.println("list.size() : " + list.size());

		} catch (InputMismatchException e) {
			e.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			System.out.println("finally는 예외 발생 여부 상관없이 언제나 실행됩니다.");

		}

		// throws

		System.out.println("Exception BEFORE");

		try {
			ex.firtMethod();

		} catch (Exception e) {
			e.printStackTrace();

		}

		System.out.println("Exception AFTER");

	}

}
