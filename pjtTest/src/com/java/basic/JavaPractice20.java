package com.java.basic;

import java.util.ArrayList;
import java.util.HashMap;

public class JavaPractice20 {

	// Collections
	// 배열과 같이 자료(데이터)를 효율적으로 관리하는 방법

	// List
	// List는 인터페이스로 이를 구현한 클래스는 인덱스를 이용해서 데이터를 관리한다.
	// 배열과 동일하다고 생각해보자.
	// Vector, AraayList, LinkedList 등이 있다.

	// List 특징
	// 1. 인덱스를 이용한다.
	// 2. 데이터 중복이 가능하다.

	// Map
	// Map은 인터페이스로 이를 구현한 클래스는 key를 이용해서 데이터를 관리한다.

	// Map 특징
	// 1. key를 이용한다.
	// 2. key는 중복될 수 없다.
	// 3. 데이터 중복이 가능하다.

	public static void main(String[] args) {

		// ArrayList<데이터 타입> 객체 생성
		ArrayList<String> list = new ArrayList<String>();

		System.out.println("list.size() : " + list.size());
		System.out.println();

		// 데이터 추가
		list.add("Hello");
		list.add("JAVA");
		list.add("World");

		System.out.println("데이터 추가");
		System.out.println("list.add() : " + list);
		System.out.println("list.size() : " + list.size());
		System.out.println();

		// 데이터 중간에 새 데이터 추가하기 (기존 위치의 데이터는 뒤로 밀린다.)
		list.add(2, "Programming");

		System.out.println("데이터 중간에 끼워넣기");
		System.out.println("list.add(추가할 글자 위치, 추가할 글자) : " + list);
		System.out.println("list.size() : " + list.size());
		System.out.println();

		// 중간데이터 변경하기
		list.set(3, "C");

		System.out.println("중간데이터 바꾸기");
		System.out.println("list.set(변경할 글자 위치, 변경할 글자) : " + list);
		System.out.println("list.size() : " + list.size());
		System.out.println();

		// 데이터 추출
		String str = list.get(2);

		System.out.println("데이터 추출");
		System.out.println("list.get(추출할 글자 위치) : " + list);
		System.out.println("str : " + str);
		System.out.println("list.size() : " + list.size());
		System.out.println();

		// 데이터 제거
		str = list.remove(2);

		System.out.println("데이터 제거");
		System.out.println("list.remove(제거할 글자 위치) : " + list);
		System.out.println("str : " + str);
		System.out.println("list.size() : " + list.size());
		System.out.println();

		// 데이터 전체 제거
		list.clear();

		System.out.println("데이터 전체 제거");
		System.out.println("list.clear() : " + list);
		System.out.println("list.size() : " + list.size());
		System.out.println();

		// 데이터 유무
		boolean b = list.isEmpty();

		System.out.println("데이터 유무");
		System.out.println("list.isEmpty() : " + b);
		System.out.println("\n======================\n");

		// HashMap<key값, 해당 key값에 들어갈 데이터 타입> 객체 생성
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		System.out.println("map.size() : " + map.size());
		System.out.println();

		// 데이터 추가
		map.put(5, "Hello");
		map.put(6, "JAVA");
		map.put(7, "World");
		map.put(8, "!!");

		System.out.println("데이터 추가");
		System.out.println("map : " + map);
		System.out.println("map.size() : " + map.size());
		System.out.println();

		// 데이터 교체 (key값은 중복될 수 없다.)
		map.put(8, "*****");

		System.out.println("데이터 교체");
		System.out.println("map : " + map);
		System.out.println("map.size() : " + map.size());
		System.out.println();

		// 데이터 추출
		str = map.get(5);

		System.out.println("데이터 추출");
		System.out.println("map.get(5) : " + map.get(5));
		System.out.println("str : " + str);
		System.out.println("map : " + map);
		System.out.println("map.size() : " + map.size());
		System.out.println();

		// 데이터 제거
		str = map.remove(8);

		System.out.println("데이터 추출");
		System.out.println("map.remove(8) : " + map.remove(8));
		System.out.println("str : " + str);
		System.out.println("map : " + map);
		System.out.println("map.size() : " + map.size());
		System.out.println();

		// 특정 데이터 포함 유무(포함되어 있다면 true, 그렇지 않으면 false)
		b = map.containsKey(7);

		System.out.println("특정 데이터 포함 여부");
		System.out.println("map.containsKey(7) : " + map.containsKey(7));
		System.out.println("b : " + b);

		b = map.containsValue("Worlds");

		System.out.println("map.containsValue(\"Worlds\") : " + map.containsValue("Worlds"));
		System.out.println("b : " + b);
		System.out.println();

		// 데이터 전체 제거
		map.clear();

		System.out.println("데이터 전체 제거");
		System.out.println("map : " + map);
		System.out.println("map.size() : " + map.size());
		System.out.println();

		// 데이터 유무
		b = map.isEmpty();

		System.out.println("데이터 유무");
		System.out.println("map.isEmpty() : " + map.isEmpty());
		System.out.println("b : " + b);

	}

}
