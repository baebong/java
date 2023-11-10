package com.java.puzzling.chap02;

import java.util.Scanner;

public class Chap2_02 {

	public static void main(String[] args) {

		// 2개의 변수 x와 y의 합과 평균을 구하자. x와 y에는 적당한 값을 대입해서 사용한다.
		int x, y;

		Scanner sc = new Scanner(System.in);
		System.out.print("x의 값을 입력하시오. : ");
		x = sc.nextInt();
		System.out.print("y의 값을 입력하시오. : ");
		y = sc.nextInt();

		int sum = x + y;
		double avg = (double) (x + y) / 2;

		System.out.println("x와 y의 합 : " + sum);
		System.out.println("x와 y의 평균 : " + avg);

	}

}
