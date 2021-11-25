package pjtTest;

import java.util.Arrays;

public class JavaPractice10 {

	// 전역변수
	int num;
	String str;
	int nums[];

	// 생성자와 소멸자 그리고 this 키워드

	// 디폴트 생성자
	// 객체가 생성될 때 가장 먼저 호출되는 생성자로, 만약 개발자가 명시하지 않아도 컴파일 시점에 자동 생성된다.
	// 디폴트 생성자가 없는 경우 컴파일러가 자동 생성한다.
	public JavaPractice10() {
		System.out.println("Default constructor");
	}

	// 사용자 정의 생성자
	// 디폴트 생성자 외에 특정 목적에 의해서 개발자가 만든 생성자로, 매개변수에 차이가 있다.
	public JavaPractice10(int i) { // 여기서 "int i"는 지역변수
		System.out.println("UserDefined constructor");
		num = i;
	}

	public JavaPractice10(String s, int i[]) {
		System.out.println("UserDefined constructor");
		str = s;
		nums = i;
	}

	// 소멸자
	// 객체가 GC에 의해서 메모리에서 제거 될 때 finalize() 메서드가 호출된다.
	@Override
	protected void finalize() throws Throwable { // 이런게 있다는 것만 알아두기
		System.out.println(" -- finalize() method -- ");
		super.finalize();
	}

	// this 키워드
	// 현재 객체를 가리킬 때 this를 사용한다.
	public JavaPractice10(int i, String s, int is[]) {
		System.out.println("UserDefined constructor");
		this.num = i;
		this.str = s;
		this.nums = is;
	}

	public void getInfo() {
		System.out.println(num);
		System.out.println(str);
		System.out.println(Arrays.toString(nums));
	}

	public static void main(String[] args) {

		// 디폴트 생성자
		JavaPractice10 test1 = new JavaPractice10();
		System.out.println();

		// 사용자 정의 생성자
		JavaPractice10 test2 = new JavaPractice10(10);

		int arr[] = { 10, 20, 30 };
		JavaPractice10 test3 = new JavaPractice10("Java", arr);

		System.out.println();

		// 소멸자
		JavaPractice10 test4;

		test4 = new JavaPractice10(); // 다음 객체생성에서 주소값이 바뀌기 때문에 "System.gc();"에 의해서 소멸됨.
		test4 = new JavaPractice10();

		// "System.gc();"를 사용한다고 해서 GC가 바로 작동하는 것이 아니라, 가급적 빨리 작동하도록 요청하는 것이다.
		// java는 기본적으로 메모리를 개발자가 직접 관리하지하지 않으므로 일반적으로 "System.gc();"를 사용하는 경우는 드물다.
		System.gc();

		System.out.println();

		// this 키워드
		int ints[] = { 10, 20, 30 };
		JavaPractice10 test5 = new JavaPractice10(10, "Java", ints);

		test5.getInfo();

	}

}
