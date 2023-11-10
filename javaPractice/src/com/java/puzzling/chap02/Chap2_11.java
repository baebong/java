package com.java.puzzling.chap02;

import java.util.Random;

public class Chap2_11 {

	public static void main(String[] args) {

		// 한 자리 양의 정숫값(즉, 1이상 9이하의 값)을 랜덤으로 생성해서 표시
		// 한 자리 음의 정숫값(즉, -9이상 -1이하의 값)을 랜덤으로 생성해서 표시
		// 두 자리 양의 정숫값(즉, 10이상 99이하의 값)을 랜덤으로 생성해서 표시
		Random random = new Random();

		// random.nextInt(n) : 0이상 n미만의 난수
		int num1 = 1 + random.nextInt(9); // 0이상 9미만의 정숫값들에 1을 더한 값, 즉, 1부터 10미만의 난수
		int num2 = -1 - random.nextInt(9); // 0이상 9미만의 정숫값들에 1을 더한 값, 즉, 1부터 10미만의 난수
		int num3 = 10 + random.nextInt(90); // 0이상 9미만의 정숫값들에 1을 더한 값, 즉, 1부터 10미만의 난수

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

	}

}
