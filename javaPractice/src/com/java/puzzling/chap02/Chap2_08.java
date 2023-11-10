package com.java.puzzling.chap02;

import java.util.Scanner;

public class Chap2_08 {

	public static void main(String[] args) {

		// 2개의 실숫값을 입력받아 그 합과 평균을 구하는 프로그램을 작성하자.
		Scanner sc = new Scanner(System.in);

		System.out.print("a의 값 : ");
		double a = sc.nextDouble();
		System.out.print("b의 값 : ");
		double b = sc.nextDouble();

		double sum = a + b;
		double avg = (a + b) / 2;

		System.out.println();
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);

	}

}
