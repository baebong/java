package com.java.puzzling.chap02;

import java.util.Scanner;

public class Chap2_03 {

	public static void main(String[] args) {

		// 'Chap2_2'와 동일한 프로그램의 변수 x, y에 실숫값을 대입하고 그 결과를 알아보자.
		// 자료형이 맞지않아 오류 발생 int에서 double로 자료형 변경
		double x, y;

		Scanner sc = new Scanner(System.in);
		System.out.print("x의 값을 입력하시오. : ");
		x = sc.nextDouble();
		System.out.print("y의 값을 입력하시오. : ");
		y = sc.nextDouble();

		double sum = x + y;
		double avg = (x + y) / 2;

		System.out.println("x와 y의 합 : " + sum);
		System.out.println("x와 y의 평균 : " + avg);

	}

}
