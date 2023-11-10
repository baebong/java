package com.java.puzzling.chap02;

import java.util.Random;
import java.util.Scanner;

public class Chap2_12 {

	public static void main(String[] args) {

		// 키보드에서 입력한 정숫값을 +5 또는 -5범위의 핸덤 정숫값을 생성하자.
		// 입력한 정숫값(num)에 ±범위가 될 정숫값을 뺀다.
		// ±5는 -5부터 +5까지 11개의 숫자를 가지고 있다.
		// 난수 범위를 11로 잡는다. random.nextInt(11)±
		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		int i;

		do {
			int num = sc.nextInt();
			i = num - 5 + random.nextInt(11);
			System.out.println(i);

			if (i == 6)
				break;

		} while (i != 6);

		System.out.println(i);

	}

}
