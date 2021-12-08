package com.java.interface_ex;

public class MainClass {

	public static void main(String[] args) {

		InterfaceA a = new InterfaceClass();
		InterfaceB b = new InterfaceClass();
		InterfaceC c = new InterfaceClass();
		InterfaceD d = new InterfaceClass();

		a.funA(); // 데이터 타입이 InterfaceA이기 때문에 funA()에만 접근가능
		b.funB(); // 데이터 타입이 InterfaceB이기 때문에 funB()에만 접근가능
		c.funC(); // 데이터 타입이 InterfaceC이기 때문에 funC()에만 접근가능
		d.funD(); // 데이터 타입이 InterfaceD이기 때문에 funD()에만 접근가능

	}

}
