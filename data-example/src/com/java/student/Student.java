package com.java.student;

public class Student {

	// String name; // 외부에서 쉽게 데이터를 변경할 수 있다.
	// String no; // 외부에서 쉽게 데이터를 변경할 수 있다.
	// int score; // 외부에서 쉽게 데이터를 변경할 수 있다.

	private String name;
	private String no;
	private int score;

	public Student(String name, String no, int score) {
		this.name = name;
		this.no = no;
		this.score = score;
	}

	public void getInfo() {
		System.out.println("name : " + name);
		System.out.println("no : " + no);
		System.out.println("score : " + score);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("-- The name can not be modified --");
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		System.out.println("-- The no can not be modified --");
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if (score > 50) {
			this.score = score;
		} else {
			System.out.println("-- The score can not be modified --");
		}

	}

}
