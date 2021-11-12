package pjtTest;

public class JavaPractice01 {

	public static void main(String[] args) {
		int i = 10;
		int j;
		j = 100;
		System.out.println("i + j = " + (i + j));

		i = 100;
		System.out.println("i = " + i);

		// 변수를 활용하는 이유 : 데이터 재활용을 하기 위해
		System.out.println();

		System.out.println("Hello World");
		System.out.println();

		char c = 'a';
		System.out.println("c = " + c);

		i = 10;
		System.out.println("i = " + i);

		double d1 = 10.123;
		System.out.println("d = " + d1);

		boolean b = false;
		System.out.println("b = " + b);

		String s = "Hello Java World";
		System.out.println("s = " + s);
		System.out.println();

		System.out.println("Good\tMorning~");
		System.out.println("Good\nMorning~");
		System.out.println("Good\'Morning~\'");
		System.out.println("Good\"Morning~\"");
		System.out.println("Good\\Morning~\\");
		System.out.println();

		System.out.println("오늘의 날씨는 10도 입니다.");
		System.out.printf("오늘의 기온은 %d도입니다.\n\n", 8);

		// 문자(%c)
		char c1 = 'a';
		char c2 = 'A';
		System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다.\n\n", c1, c2);

		// 서식문자
		int num1 = 20;
		System.out.println("오늘의 기온은 " + num1 + "도 입니다.");
		System.out.printf("오늘의 기온은 %d도 입니다.\n\n", num1);

		System.out.printf("홍길동's Info. : %d학년 %d반 %d번\n\n", 6, 2, 10);

		// 정수(%d)
		int num2 = 30;
		System.out.printf("num2 (10진수) : %d\n", num2);
		System.out.printf("num2 (8진수) : %o\n", num2);
		System.out.printf("num2 (16진수) : %x\n\n", num2);

		// 문자열(%s)
		System.out.printf("소문자 \'%s\'의 대문자는 \'%s\'입니다.\n\n", "java", "JAVA");

		// 실수(%f)
		float f = 1.23f;
		System.out.printf("f = %f\n", f);

		double d2 = 1.23456d;
		System.out.printf("d = %f\n\n", d2);

		// 서식문자 정렬 기능
		// 좌측정렬
		System.out.printf("%d\n", 123);
		System.out.printf("%d\n", 1234);
		System.out.printf("%d\n\n", 12345);
		// 우측정렬
		System.out.printf("%5d\n", 123);
		System.out.printf("%5d\n", 1234);
		System.out.printf("%5d\n\n", 12345);

		// 서식문자 소수점 제한 기능
		System.out.printf("%f\n", 1.23);
		System.out.printf("%.0f\n", 1.23);
		System.out.printf("%.1f\n", 1.23);
		System.out.printf("%.2f\n", 1.23);
		System.out.printf("%.3f\n\n", 1.23);

	}

}
