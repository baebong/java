package com.java.algorithm;

import java.util.Scanner;

public class Ex1_03 {

	// 네 값의 최솟값을 구하는 min4 메서드를 작성하세요.
	static int min4(int a, int b, int c, int d) {
		
		int min = a;

		if (b < min)
			min = b;

		if (c < min)
			min = c;

		if (d < min)
			min = d;

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
		
		System.out.print("d에 들어갈 숫자를 입력하시오 : ");
		int d = sc.nextInt();
		
		int min = min4(a, b, c, d);
		
		System.out.println();
		System.out.println("최솟값은 " + min + "입니다.");
		
	}

}
