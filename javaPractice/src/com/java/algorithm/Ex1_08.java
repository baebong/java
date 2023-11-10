package com.java.algorithm;

import java.util.Scanner;

public class Ex1_08 {

	public static void main(String[] args) {

		// 1부터 10까지의 합은 (1 + 10) * 5와 같은 방법으로 구할 수 있습니다. 가우스의 덧셈이라는 방법을 이용하여 1부터 n까지의 정수
		// 합을 구하는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);

		// 나의 풀이
		int sum = 0;
		int n = sc.nextInt();

		if (n % 2 == 1) {
			sum = (int) ((1 + n) * ((1 + n) / 2 - 0.5)); // 나는 강제 형변환을 통해 소수점을 이용함
		} else
			sum = (1 + n) * n / 2;

		// 해답
//		int n = sc.nextInt();
//		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // 자료형을 int로 설정했을 시 소수점이 사라지는 것을 이용한 해답풀이
		// 해답 풀이가 간결하니 좋긴함

		System.out.println("1부터 " + n + "까지의 합 : " + sum);

	}

}
