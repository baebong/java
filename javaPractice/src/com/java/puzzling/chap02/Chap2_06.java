package com.java.puzzling.chap02;

import java.util.Scanner;

public class Chap2_06 {

	public static void main(String[] args) {

		// 키보드에서 입력한 정숫값에 10을 더한 값과 10을 뺀 값을 출력하자.
		int x;
		int y = 10;

		Scanner sc = new Scanner(System.in);
		System.out.print("x의 값을 입력하시오. : ");
		x = sc.nextInt();

		int sum = x + y;
		int dif = x - y;

		System.out.println("합 : " + sum);
		System.out.println("차 : " + dif);

	}

}
