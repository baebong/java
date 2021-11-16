package pjtTest;

import java.util.Arrays;

public class JavaPractice04 {
	public static void main(String[] args) {

		// 배열의 메모리 크기
		// 배열을 구성하는 데이터의 자료형에 따라서 배열의 메모리 크기가 결정된다.
		// 기본자료형 vs 객체자료형
		// 기본자료형 : 해당 메모리, 해당 변수에 대한 데이터가 직접 들어간다.
		// 객체자료형 : 변수에 데이터가 들어가는 것이 아니라 해당 객체에 대한 메모리 주소만 들어간다. (=레퍼런스)

		// 배열 기본속성
		// 기본 자료형 대이터를 담고 있는 변수와 달리 배열 변수는 배열 데이터의 주소를 담고 있다.
		int[] arrAtt1 = { 10, 20, 30, 40, 50, 60 };
		int[] arrAtt2 = null;
		int[] arrAtt3 = null;

		// 배열 길이 출력
		System.out.println("arrAtt1.length : " + arrAtt1.length);

		// 배열 요소(값) 출력
		System.out.println("arrAtt1 : " + Arrays.toString(arrAtt1));

		// 배열 요소(값) 복사
		// 주소값을 복사하는 것이 아니라 요소(값)만 복사
		// 같은 값, 다른 주소
		arrAtt3 = Arrays.copyOf(arrAtt1, arrAtt1.length);
		System.out.println("arrAtt3 : " + Arrays.toString(arrAtt3));

		// 배열 레퍼런스
		// 같은 주소, 같은 값
		arrAtt2 = arrAtt1;
		System.out.println("arrAtt1 : " + arrAtt1);
		System.out.println("arrAtt2 : " + arrAtt2);
		System.out.println("arrAtt3 : " + arrAtt3);

		System.out.println();

		// 다차원 배열
		// 배열 안에 또 다른 배열이 존재한다.
		// int[][] arrMul = new int[행][열];
		// 2차원 배열은 종종 사용하지만, 3차원 배열이상이 되면 메모리가 급격하게 많이 사용되기도 하고 자주 사용하지 않음.
		int[][] arrMul = new int[3][2];
		arrMul[0][0] = 10;
		arrMul[0][1] = 100;
		arrMul[1][0] = 20;
		arrMul[1][1] = 200;
		arrMul[2][0] = 30;
		arrMul[2][1] = 300;

		System.out.println("arrMul[0] : " + Arrays.toString(arrMul[0]));
		System.out.println("arrMul[1] : " + Arrays.toString(arrMul[1]));
		System.out.println("arrMul[2] : " + Arrays.toString(arrMul[2]));

	}

}
