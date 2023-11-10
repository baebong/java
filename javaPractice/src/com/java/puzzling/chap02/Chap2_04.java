package com.java.puzzling.chap02;

import java.util.Scanner;

public class Chap2_04 {

	public static void main(String[] args) {

		// 3개의 int형 변수에 각각 값을 대입해서 합계와 평균을 구하는 프로그램을 작성하자.
		int x, y, z;

		Scanner sc = new Scanner(System.in);
		System.out.print("x의 값을 입력하시오. : ");
		x = sc.nextInt();
		System.out.print("y의 값을 입력하시오. : ");
		y = sc.nextInt();
		System.out.print("z의 값을 입력하시오. : ");
		z = sc.nextInt();

		int sum = x + y + z;
		double avg = (double) (x + y + z) / 3;

		System.out.println("x, y, z의 합 : " + sum);
		System.out.println("x, y, z의 평균 : " + avg);

	}

}
