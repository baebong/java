package com.java.algorithm;

import java.util.Scanner;

public class Ex1_01 {

	// 네 값의 최댓값을 구하는 max4 메서드를 작성하세요.
	static int max4(int a, int b, int c, int d) {

		int max = a;

		if (b > max) // 주의 : else if를 사용하면 조건문 분기에서 조건이 참이 되면 빠져나와 else if 조건문은 실행되지 않는다.
			max = b;

		if (c > max)
			max = c;

		if (d > max)
			max = d;

		return max;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("a에 들어갈 숫자를 입력하시오 : ");
		int a = sc.nextInt();

		System.out.print("b에 들어갈 숫자를 입력하시오 : ");
		int b = sc.nextInt();

		System.out.print("c에 들어갈 숫자를 입력하시오 : ");
		int c = sc.nextInt();

		System.out.print("d에 들어갈 숫자를 입력하시오 : ");
		int d = sc.nextInt();

		int max = max4(a, b, c, d);

		System.out.println();
		System.out.println("최댓값은 " + max + "입니다.");

	}

}
