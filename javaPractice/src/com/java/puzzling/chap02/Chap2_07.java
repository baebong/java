package com.java.puzzling.chap02;

import java.util.Scanner;

public class Chap2_07 {

	public static void main(String[] args) {

		// 키보드에서 입력한 정숫값에서 마지막 자릿수를 제외한 값과 마지막 자릿수 값만 표시하는 프로그램을 작성하자.
		int x;
		int y = 10;

		Scanner sc = new Scanner(System.in);
		System.out.print("x의 값을 입력하시오. : ");
		x = sc.nextInt();

		int sum = x + y;
		int dif = x - y;
		int div = x / y;
		int dec = x % y;

		System.out.println("덧셈 : " + sum);
		System.out.println("뺄셈 : " + dif);
		System.out.println("나눗셈 : " + div);
		System.out.println("나머지 : " + dec);

	}

}
