package com.java.basic;

import java.util.Scanner;

public class JavaPractice05 {
	public static void main(String[] args) {

		// 조건문
		// 어떠한 조건에 따라서 프로그램의 흐름이 결정되는 구조
		// 조건의 결과에 따라서 양자 택일 또는 다자 택일을 진행한다.
		// 양자 택일 : 주로 if문이 사용됨.
		// 다자 택일 : 주로 switch문이 사용됨.

		// if문 : 조건식이 참이면 실행
		// if(조건식), if(조건식) else, if(조건식) else if(조건식)

		int num1 = 10;
		int num2 = 20;

		// if(조건식)
		if (num1 < num2) {
			System.out.println("num1는 num2보다 작다.");
		}

		System.out.println();

		// if(조건식) else
		if (num1 < num2) {
			System.out.println("num1는 num2보다 작다.");
		} else {
			System.out.println("num1는 num2보다 크거나 같다.");
		}

		System.out.println();

		// if(조건식) else if(조건식) = 다자택일
		if (num1 > num2) {
			System.out.println("num1는 num2보다 작다.");
		} else if (num1 < num2) {
			System.out.println("num1는 num2보다 크다.");
		} else if (num1 == num2) {
			System.out.println("num1는 num2와 같다.");
		} else {
			System.out.println("num1은 num2보다 크지도 작지도 같지도 않다.");
		}

		System.out.println();

		// switch문
		// 비교대상이 되는 결과값과 선택사항이 많을 경우 주로 사용한다.
		System.out.print("점수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();

		switch (score) {
		case 100:
		case 90: // case를 연달아 쓰면 다른 조건으로 같은 결과값을 도출해낼 수 있다.
			System.out.println("수");
			break;
		case 80:
			System.out.println("우");
			break;
		case 70:
			System.out.println("미");
			break;
		case 60:
			System.out.println("양");
			break;
		case 50:
			System.out.println("가");
			break;
		default:
			System.out.println("try again!!");
			break;

		}

		sc.close();

	}

}
