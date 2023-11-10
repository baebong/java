package com.java.algorithm;

import java.util.Scanner;

public class Ex1_04 {

	// 세 값의 대소 관계 13종류의 모든 조합에 대해 중앙값을 구하여 출력하는 프로그램을 작성하세요.
	// 실습 1-2와 실습 1C-1을 참고하세요.
	static int mid3(int a, int b, int c) {

		if (a >= b) {
			if (b >= c) {
				return b;
			} else if (a <= c) {
				return a;
			} else
				return c;

		} else if (a > c) {
			return a;
		} else if (c > b) {
			return b;
		} else
			return c;

	}

	public static void main(String[] args) {

		System.out.println("1. 중앙값은 " + mid3(3, 2, 1) + "입니다.");
		System.out.println("2. 중앙값은 " + mid3(3, 2, 2) + "입니다.");
		System.out.println("3. 중앙값은 " + mid3(3, 1, 2) + "입니다.");
		System.out.println("4. 중앙값은 " + mid3(3, 2, 3) + "입니다.");
		System.out.println("5. 중앙값은 " + mid3(2, 1, 3) + "입니다.");
		System.out.println("6. 중앙값은 " + mid3(3, 3, 2) + "입니다.");
		System.out.println("7. 중앙값은 " + mid3(3, 3, 3) + "입니다.");
		System.out.println("8. 중앙값은 " + mid3(2, 2, 3) + "입니다.");
		System.out.println("9. 중앙값은 " + mid3(2, 3, 1) + "입니다.");
		System.out.println("10. 중앙값은 " + mid3(2, 3, 2) + "입니다.");
		System.out.println("11. 중앙값은 " + mid3(1, 3, 2) + "입니다.");
		System.out.println("12. 중앙값은 " + mid3(2, 3, 3) + "입니다.");
		System.out.println("13. 중앙값은 " + mid3(1, 2, 3) + "입니다.");

	}

}
