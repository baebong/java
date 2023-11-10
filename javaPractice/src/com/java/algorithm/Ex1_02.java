package com.java.algorithm;

import java.util.Scanner;

public class Ex1_02 {

	// 세 값의 최솟값을 구하는 min3 메서드를 작성하세요
	static int min3(int a, int b, int c) {

		int min = a;

		if (b < min)
			min = b;

		if (c < min)
			min = c;

		return min;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("a에 들어갈 숫자를 입력하시오 : ");
		int a = sc.nextInt();

		System.out.print("b에 들어갈 숫자를 입력하시오 : ");
		int b = sc.nextInt();

		System.out.print("c에 들어갈 숫자를 입력하시오 : ");
		int c = sc.nextInt();
		
		int min = min3(a, b, c);

		System.out.println();
		System.out.println("최솟값은 " + min + "입니다.");

	}

}
