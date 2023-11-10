package com.java.puzzling.chap02;

import java.util.Scanner;

public class Chap2_14 {

	public static void main(String[] args) {

		// 키보드로 입력한 성과 이름으로 인사하는 프로그램을 작성하자.
		Scanner sc = new Scanner(System.in);

		System.out.print("성 : ");
		String lastName = sc.nextLine();
		System.out.print("이름 : ");
		String firstName = sc.nextLine();

		System.out.println(lastName + firstName + "님 안녕하세요~!");

	}

}
