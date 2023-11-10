package com.java.algorithm;

import java.util.Scanner;

public class Ex1_10 {

	public static void main(String[] args) {

		// 두 변수 a, b에 정수를 입력하고 b - a를 출력하는 프로그램을 작성하세요.
		// 단, 변수 b에 입력한 값이 a 이하면 변수 b의 값을 다시 입력하세요.

		int a;
		int b;

		Scanner sc = new Scanner(System.in);
		System.out.print("a의 값 : ");
		a = sc.nextInt();

//		while (true) {
//
//			System.out.print("b의 값 : ");
//			b = sc.nextInt();
//
//			if (b > a)
//				break;
//			System.out.println("a보다 큰 값을 입력하세요!");
//
//		}

		do {

			System.out.print("b의 값 : ");
			b = sc.nextInt();

			if (b > a)
				break; // 핵심 뽀인트~!
			System.out.println("a보다 큰 값을 입력하세요!");

		} while (a >= b);

		System.out.println("b - a는 " + (b - a) + "입니다.");

	}

}
