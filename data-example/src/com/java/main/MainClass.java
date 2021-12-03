package com.java.main;

import com.java.student.Student;

public class MainClass {

	public static void main(String[] args) {

		Student student1 = new Student("david", "1", 60);

		student1.getInfo();
		System.out.println();

		student1.setScore(30);
		student1.getInfo();

	}

}
