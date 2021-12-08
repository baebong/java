package com.java.interface_ex;

public class InterfaceClass implements InterfaceA, InterfaceB, InterfaceC, InterfaceD { // 다형성

	public InterfaceClass() {
		System.out.println("InterfaceClass Constructor");
	}

	@Override
	public void funA() {
		System.out.println("-- funA() --");

	}

	@Override
	public void funB() {
		System.out.println("-- funB() --");

	}

	@Override
	public void funC() {
		System.out.println("-- funC() --");

	}

	@Override
	public void funD() {
		System.out.println("-- funD() --");

	}

}
