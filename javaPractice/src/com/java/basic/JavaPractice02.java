package com.java.basic;

public class JavaPractice02 {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;

		// 대입연산자(=)
		System.out.println("x = " + x);
		System.out.println("y = " + y);

		x = y;
		System.out.println("x = " + x);
		System.out.println("y = " + y + "\n");

		// 산술연산자(+, -, *, /, %)
		x = 10;
		System.out.println("x + y = " + (x + y));
		System.out.println("x - y = " + (x - y));
		System.out.println("x * y = " + (x * y));
		System.out.println("x / y = " + ((double) x / y));
		System.out.println("x % y = " + (x % y) + "\n");

		// 복합대입연산자(산술 + 대입)
		System.out.println("x += 10 : " + (x += 10));
		x = 10;
		System.out.println("x -= 10 : " + (x -= 10));
		x = 10;
		System.out.println("x *= 10 : " + (x *= 10));
		x = 10;
		System.out.println("x /= 10 : " + (x /= 10));
		x = 10;
		System.out.println("x %= 10 : " + (x %= 10) + "\n");

		// 관계연산자(<. >. <=. >=. ==. !=)
		System.out.println("x > y : " + (x > y));
		System.out.println("x < y : " + (x < y));
		System.out.println("x >= y : " + (x >= y));
		System.out.println("x <= y : " + (x <= y));
		System.out.println("x == y : " + (x == y));
		System.out.println("x != y : " + (x != y) + "\n");

		// 증감연산자(++, --)
		x = 10;
		System.out.println("++x : " + (++x)); // 전위 : 먼저 결과값이 반영되어 출력
		x = 10;
		System.out.println("--x : " + (--x));
		x = 10;
		System.out.println("x++ : " + (x++)); // 후위 : 이후에 결과값이 반영됨
		System.out.println("x : " + x);
		x = 10;
		System.out.println("x-- : " + (x--));
		System.out.println("x : " + x + "\n");

		// 논리연산자(&&, ||, !)
		boolean b1 = false;
		boolean b2 = true;
		// &&(논리곱(AND)) - a && b : a와 b가 모두 참이면 참
		System.out.println("b1 && b2 : " + (b1 && b2));
		// ||(논리합(OR)) - a || b : a와 b중 하나라도 참이면 참
		System.out.println("b1 || b2 : " + (b1 || b2));
		// !(논리부정(NOT)) - !a : a의 상태를 부정
		System.out.println("!b1 : " + (!b1));
		System.out.println("!b2 : " + (!b2) + "\n");

		// 조건(삼항)연산자
		// 조건식 ? 식1(참) : 식2(거짓)
		// 조건식이 참이면 식1이 실행되고, 조것니이 거짓이면 식2가 실행된다.
		x = 10;
		y = 20;
		int result = 0;
		result = (x > y) ? 100 : 200;
		System.out.println("result : " + result);

		result = (x < y) ? 100 : 200;
		System.out.println("result : " + result);

		result = (x == y) ? 100 : 200;
		System.out.println("result : " + result + "\n");

		// 비트연산자(실제로는 잘 사용안함 BUT 계산과정은 알아야함) : 데이터를 비트(bit)단위로 환산하여 연산을 수행하며, 다른 연산자보다 연산 속도가 향상된다.
		x = 2;
		y = 3;
		// &(AND연산) : a & b - a와 b가 모두 1이면 1
		System.out.println("x & y : " + (x & y));
		// |(OR연산) : a | b - a와 b중 하나라도 1이면 1
		System.out.println("x | y : " + (x | y));
		// ^(XOR연산) : a ^ b - a와 b가 같지 않으면 1
		System.out.println("x ^ y : " + (x ^ y) + "\n");

	}

}
