package com.java.puzzling.chap02;

import java.util.Random;

public class Chap2_13 {

	public static void main(String[] args) {

		// 0.0이상 1.0미만의 실숫값을 랜덤으로 생성해서 표시
		// 0.0이상 10.0미만의 실숫값을 랜덤으로 생성해서 표시
		// -1.0이상 1.0미만의 실숫값을 랜덤으로 생성해서 표시
		Random random = new Random();

		double num1 = random.nextDouble();
		double num2 = random.nextDouble() * 10;
		double num3 = random.nextDouble() * 2 - 1;

		System.out.println("1번 난수 : " + num1);
		System.out.println("2번 난수 : " + num2);
		System.out.println("3번 난수 : " + num3);

	}

}
