package com.java.algorithm;

import java.util.Scanner;

public class Ex1_11 {

	public static void main(String[] args) {

		// 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요. 예를 들어 135를 입력하면 '그 수는 3자리입니다.'라고 출력하고,
		// 1314를 입력하면 '그 수는 4자리입니다.'라고 출력하면 됩니다.
		Scanner sc = new Scanner(System.in);

		// 나의 풀다만 풀이(문제가 많음)
//		String a = sc.next();
//		System.out.println("숫자 " + a + "의 자릿수는 " + a.length() + "입니다.");

		// 해답
		int num;
		int num_copy;
		int no = 0; // 자릿수를 표현할 변수

		do {

			System.out.print("num의 값 : ");
			num = sc.nextInt();
			num_copy = num;

			if (num > 0)
				break;
			System.out.println("0보다 큰 값을 입력하세요.");

		} while (num <= 0);

		while (num > 0) {

			num /= 10;
			no++;

		}

		System.out.println("숫자 " + num_copy + "의 자릿수는 " + no + "입니다.");

	}

}
