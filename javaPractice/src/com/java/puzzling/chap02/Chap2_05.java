package com.java.puzzling.chap02;

import java.util.Scanner;

public class Chap2_05 {

	public static void main(String[] args) {

		// 키보드에서 입력한 정숫값을 표시하는 프로그램을 작성하자.
		int x;

		Scanner sc = new Scanner(System.in);
		System.out.print("x의 값을 입력하시오. : ");
		x = sc.nextInt();

		System.out.println("입력한 값은 " + x + "입니다.");

	}

}
