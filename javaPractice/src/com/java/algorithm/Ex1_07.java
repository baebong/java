package com.java.algorithm;

import java.util.Scanner;

public class Ex1_07 {

	public static void main(String[] args) {

		// 실습 1-5 프로그램을 참고하여 n이 7이면 '1 + 2 + 3 + 4 + 5 + 7 = 28'로 출력하는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		System.out.print("변수 n의 값 : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			if (i < n)
				System.out.print(i + " + ");
			else
				System.out.print(i);

			sum += i;

		}

		System.out.println(" = " + sum);

	}

}
