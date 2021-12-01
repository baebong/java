package com.java.main;

// 다른 패키지에 있는 클래스를 사용하기 위해선 "import+패키지 풀네임"를 통해 사용할 수 있다.
import com.java.employee.*; // *은 해당 패키지 경로 아래의 모든 클래스를 말한다.
import com.java.pay.PayClass;
import com.java.pay.fullTime.FullTimeClass;

public class MainClass {

	public static void main(String[] args) {

		EmployeeClass employee = new EmployeeClass();
		EmployeeBankClass bank = new EmployeeBankClass();
		PayClass pay = new PayClass();
		FullTimeClass fullTime = new FullTimeClass();

		// 패키지주소전체를 적어주는 것도 가능하나 코드가 지저분해져 비추천!
		com.java.pay.partTime.PartTimeClass partTime = new com.java.pay.partTime.PartTimeClass();

		EmployeeBankClass parkBank = new EmployeeBankClass("박찬호");
		parkBank.saveMoney(100);
		parkBank.getBankInfo();
		System.out.println();

		EmployeeBankClass leeBank = new EmployeeBankClass("이승엽");
		leeBank.saveMoney(300);
		leeBank.getBankInfo();
		System.out.println();

		parkBank.spendMoney(400);
		System.out.println();

		leeBank.getBankInfo();
		System.out.println();

	}

}
