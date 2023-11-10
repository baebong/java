package com.java.puzzling.chap02;

import java.util.Scanner;

public class Chap2_10 {

	public static void main(String[] args) {

		// 구의 겉넓이와 부피를 구하는 프로그램을 작성하자.
		Scanner sc = new Scanner(System.in);

		System.out.print("구의 반지름 : ");
		double r = sc.nextDouble();

		// 구의 겉넓이
		double s = 4 * Math.PI * Math.pow(r, 2);

		// 구의 부피
		double v = 4 / 3.0 * Math.PI * Math.pow(r, 3);

		System.out.printf("구의 겉넓이 : %.2f\n", s);
		System.out.printf("구의 부피 : %.2f\n", v);

		// int로 뽑느냐 double로 뽑느냐에 따라 값이 크게 달라진다.
		System.out.println(4 / 3);
		System.out.println(4 / 3.0);

	}

}
