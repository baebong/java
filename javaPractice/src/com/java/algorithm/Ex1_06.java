package com.java.algorithm;

import java.util.Scanner;

public class Ex1_06 {

	public static void main(String[] args) {

		// 실습 1-4에서 while문이 종료될 때 변수 i의 값이 n+1이 됨을 확인하세요. (변수 i의 값을 출력하도록 프로그램을 수적하세요.)
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i = 1;

		System.out.print("변수 n의 값 : ");
		int n = sc.nextInt();

		while (i <= n) {

			sum += i;
			i++;

		}

		System.out.println("1부터 n까지 합계 : " + sum);
		System.out.println("최종 i의 값 : " + i);

	}

}
