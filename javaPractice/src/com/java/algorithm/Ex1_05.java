package com.java.algorithm;

import java.util.Scanner;

public class Ex1_05 {

	// 중앙값을 구하는 메서드는 다음과 같이 작성할 수도 있습니다. 그러나 실습 1C-1의 med3 메서드에 비해 효율이 떨어지는데, 그 이유를
	// 설명하세요.

	// 메모리를 더 많이 잡아먹나...?
	// 조건을 계산할 때 더 많은 연산능력을 요구해야해서...?

	// 연습1-5 해답
	// 가장 처음의 if문의 판단
	// if ((b >= a && c<= a) || (b <= a && c >= a))
	// 에 주목합니다. 여기서 b >= a 및 b <= a의 판단을 뒤집은 판단(실질적으로 같은 판단)을 이어지는 else 이후의
	// else if ((a > b && c < b) || (b <= a && c > b))
	// 으로 수행합니다. 결국 가장 처음의 if가 성립한 경우 2 번째의 if에서도 (실질적으로)같은 판단을 수행하므로 효율이 나빠집니다.

	// 몬소리야...

	// 그니까 같은 값이 나오는 조건을 두.번.씩이나 썼다고 비효율적이라고 이야기하는건가?
	static int med3(int a, int b, int c) {

		if ((b >= a && c <= a) || (b <= a && c >= a))

			return a;

		else if ((a > b && c < b) || (a < b && c > b))

			return b;

		return c;

	}

	public static void main(String[] args) {

		System.out.println(med3(3, 2, 4));

	}

}
