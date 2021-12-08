package com.java.toy;

import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {

		Toy airplane = new ToyRobot();
		Toy robot = new ToyAirplane();

		Toy toys[] = { airplane, robot };

		for (int i = 0; i < toys.length; i++) {

			toys[i].walk();
			toys[i].run();
			toys[i].alarm();
			toys[i].light();

			System.out.println();

		}

	}

}
