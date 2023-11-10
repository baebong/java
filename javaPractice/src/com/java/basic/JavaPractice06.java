package com.java.basic;

import java.util.Scanner;

public class JavaPractice06 {
	public static void main(String[] args) {

		// 반복문
		// 프로그램 진행을 특정 조건에 따라 반복적으로 진행하는 것이다.
		// for문, while문 : 조건이 참일 때까지 반복 수행

		// for (int i = 0; i < 10; i++){실행문}
		// i가 1부터 10보다 작을 때까지 i에 1씩 더해가며 프로그램 반복 실행
		System.out.print("INPUT NUMBER : ");
		Scanner sc = new Scanner(System.in);
		int inputNum1 = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", inputNum1, i, (inputNum1 * i));

		}

		System.out.println();

		// for (int i = 1; i < 10; i = i + 2)
		// i가 1부터 10보다 작을 때까지 i에 2씩 더해가며 프로그램 반복 진행
		System.out.print("INPUT NUMBER : ");
		int inputNum2 = sc.nextInt();

		for (int i = 1; i < 10; i = i + 2) {
			System.out.printf("%d * %d = %d\n", inputNum2, i, (inputNum2 * i));

		}

		System.out.println();

		// while (true or false){실행문}
		// while (rNum < 10)
		// rNum이가 10보다 작을 때까지 프로그램 반복 진행
		// for문과 다르게 조건문을 바깥쪽에 써준다.
		System.out.print("INPUT NUMBER : ");
		int num = sc.nextInt();
		int i = 1; // 조건!
		while (i < 10) {
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
			i++;
		}

		sc.close();

		System.out.println();

		// do ~ while문
		// while문과 비슷하며, 차이점은 조건 결과에 상관없이 무조건 최초 한 번은 {실행문}의 프로그램을 수행한다.
		// do{실행문} while (rNum < 10)
		// rNum이가 10보다 작을 때까지 프로그램 반복 진행. 단, rNum의 조건에 상관없이 {실행문}의 프로그램은 1번 수행된다.
		// 그 다음 조건식, 비교식을 들어감.
		do {
			System.out.println("무조건 1번은 실행합니다.");
			System.out.println("조건이 거짓일 때");
		} while (false); // 조건이 거짓일지라도 무조건 위의 실행문 1번 실행

		System.out.println();

		int doNum = 10;
		do {
			System.out.println("무조건 1번은 실행합니다.");
			System.out.println("조건이 참일 때");
			doNum++;
		} while (doNum < 13);

	}

}
