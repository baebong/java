package com.java.puzzling.chap02;

import java.util.Scanner;

public class Chap2_09 {

	public static void main(String[] args) {

		// 삼각형의 밑변과 높이를 받아 삼각형의 넓이를 구하는 프로그램을 작성하자.
		Scanner sc = new Scanner(System.in);

		double width;
		double height;

		do {
			System.out.print("삼각형 밑변: ");
			width = sc.nextDouble();
			System.out.print("삼각형 높이 : ");
			height = sc.nextDouble();

			if (!(width <= 0 || height <= 0))
				break;
			if (width <= 0)
				System.out.println("밑변의 길이를 0보다 큰 수로 설정하세요.");
			if (height <= 0)
				System.out.println("높이의 길이를 0보다 큰 수로 설정하세요.");

		} while (width <= 0 || height <= 0);

		double perimeter = (width * height) / 2;

		System.out.println("삼각형의 넓이는 " + perimeter + "입니다.");

	}

}
