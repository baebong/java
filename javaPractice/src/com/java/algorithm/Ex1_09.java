package com.java.algorithm;

import java.util.Scanner;

public class Ex1_09 {

	// 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 메서드를 작성하세요.
	// a와 b의 대소 관계에 상관없이 합을 구하세요(a가 3, b가 5면 12, a가 6, b가 4면 15).
	static int sumof(int a, int b) {

		// 나의 풀이
		int sum = 0;

		if (a > b) {
			for (int i = b; i <= a; i++) {
				sum += i;
			}

		} else
			for (int i = a; i <= b; i++) {
				sum += i;
			}

		// 해답
//		int min; // a, b의 작은 쪽의 값
//		int max; // a, b의 큰 쪽의 값
//
//		if (a < b) {
//			min = a;
//			max = b;
//		} else {
//			min = b;
//			max = a;
//		}
//
//		int sum = 0; // 합
//		for (int i = min; i <= max; i++) // 변수 min, max를 추가해 더 간결해진 코드가 됨
//			sum += i;

		return sum;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		System.out.print("b의 값 : ");
		int b = sc.nextInt();

		System.out.println(sumof(a, b));

	}

}
