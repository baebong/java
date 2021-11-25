package com.java.basic;

import java.util.Scanner;

public class JavaPractice03 {
	public static void main(String[] args) {

		// 배열 : 인덱스를 이용해서 자료형이 같은 데이터를 관리하는 것이다.
		// 배열 선언 후 초기화
		int[] arr1 = new int[5];
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;

		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[1] : " + arr1[1]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr1[3] : " + arr1[3]);
		System.out.println("arr1[4] : " + arr1[4] + "\n");

		// 배열 선언과 초기화를 동시에
		int[] arr2 = { 10, 20, 30, 40, 50 };

		System.out.println("arr2[0] : " + arr2[0]);
		System.out.println("arr2[1] : " + arr2[1]);
		System.out.println("arr2[2] : " + arr2[2]);
		System.out.println("arr2[3] : " + arr2[3]);
		System.out.println("arr2[4] : " + arr2[4] + "\n");

		// 배열을 이용한 학사관리
		String[] name = { "박찬호", "이승엽", "박병호", "이병규", "류현진" };
		int[] score = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s의 점수를 입력하시오. : ", name[0]);
		score[0] = sc.nextInt();
		System.out.printf("%s의 점수를 입력하시오. : ", name[1]);
		score[1] = sc.nextInt();
		System.out.printf("%s의 점수를 입력하시오. : ", name[2]);
		score[2] = sc.nextInt();
		System.out.printf("%s의 점수를 입력하시오. : ", name[3]);
		score[3] = sc.nextInt();
		System.out.printf("%s의 점수를 입력하시오. : ", name[4]);
		score[4] = sc.nextInt();

		System.out.println();

		System.out.printf("%s 점수 : \t%.2f\n", name[0], (double) score[0]);
		System.out.printf("%s 점수 : \t%.2f\n", name[1], (double) score[1]);
		System.out.printf("%s 점수 : \t%.2f\n", name[2], (double) score[2]);
		System.out.printf("%s 점수 : \t%.2f\n", name[3], (double) score[3]);
		System.out.printf("%s 점수 : \t%.2f\n\n", name[4], (double) score[4]);

		double ave = (double) (score[0] + score[1] + score[2] + score[3] + score[4]) / 5;
		System.out.printf("---------------------------\n평\t점 : \t%.2f", ave);

		sc.close();

		System.out.println();

	}

}
