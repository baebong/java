package com.java.basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class JavaPractice22 {

	// 입력과 출력
	// 다른 곳의 데이터를 가져오는 것을 입력이라 하고, 다른 곳으로 데이터를 내보내는 것을 출력이라고 한다.
	// 데이터가 오고 가는 길을 스트림(Stream) 이라고 한다.
	// 입력(Input) : 파일 읽기, 이미지 & 동영상 불러오기
	// 출력(Output) : 파일 쓰기, 이미지 & 동영상 내보내기

	// 입/출력 기본 클래스
	// 입/출력에 사용되는 기본 클래스는 1byte 단위로 데이터를 전송하는 InputStream / OutputStream이 있다.

	// stream
	// 1. 명사 개울, 시내 (→downstream, upstream, the Gulf Stream)
	// 2. 명사 (액체기체의) 줄기 (→bloodstream)
	// 3. 동사 줄줄[계속] 흐르다[흘러나오다]
	// 4. 동사 줄을 지어[줄줄이] 이어지다[이동하다]

	// FileInputStream / FileOutputStream
	// 파일에 데이터를 읽고, 쓰기 위한 클래스로 read(), write() 메서드를 이용한다.

	// 파일 복사
	// 파일 입/출력 클래스를 이용해서 파일을 복사할 수 있다.

	// DataInputStream / DataOutputStream
	// byte 단위의 입출력을 개선해서 문자열을 좀 더 편리하게 다룰 수 있다.

	// BufferedReader / BufferedWriter
	// byte 단위의 입출력을 개선해서 문자열을 좀 더 편리하게 다룰 수 있다.

	public static void main(String[] args) {

		// read() : 1byte씩 불러오는 방법
		InputStream inputStream1 = null;

		try { // 네트워크와 관련된 코드라면 컴파일 에러를 방지하기 위해서 예외처리 필수~!

			inputStream1 = new FileInputStream("파일 위치"); // 읽어올 데이터 파일의 주소를 입력
			int data = 0;

			while (true) {

				try {

					data = inputStream1.read();

				} catch (IOException e) {

					e.printStackTrace();

				}

				if (data == -1) // 읽을 데이터가 더이상 없을 때 -1을 반환하여, while문 나가기
					break;
				System.out.print((char) data); // 형변환을 하여 숫자에서 문자로 반환 출력

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} finally {

			try {

				if (inputStream1 != null)

					inputStream1.close(); // 까먹지 말고 꼭~!

				System.out.println();

			} catch (IOException e) {

				e.printStackTrace();

			}

		}

		// read(byte[]) : 배열을 이용해 배열의 데이터 크기만큼 읽어오는 방법
		InputStream inputStream2 = null;

		try {

			inputStream2 = new FileInputStream("파일 위치");
			int data = 0;
			byte[] bs = new byte[3];

			while (true) {
				try {

					data = inputStream2.read(bs);

				} catch (IOException e) {

					e.printStackTrace();

				}

				if (data == -1)
					break;

				System.out.println("data : " + data);

				for (int i = 0; i < bs.length; i++) {

					System.out.println("bs[" + i + "] : " + bs[i]);

				}

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} finally {

			try {

				if (inputStream2 != null)

					inputStream2.close();

				System.out.println();

			} catch (IOException e) {

				e.printStackTrace();

			}

		}

		// read(byte[]) : 배열을 이용해 배열의 데이터 크기만큼 읽어오는 방법 (한글)
		// [참고사이트] https://aricode.tistory.com/2 아리의 코딩 모험
		InputStream inputStream3 = null;

		try {
			inputStream3 = new FileInputStream(new File("파일 위치"));
			int size;

			try {

				size = inputStream3.available(); // 읽어올 수 있는 byte의 수를 반환한다.
				byte[] bs = new byte[size]; // size 만큼의 byte 배열을 선언한다.

				inputStream3.read(bs);
				System.out.println(new String(bs)); // 바이트 배열을 문자열로 변환한 값을 출력한다.
				inputStream3.close();

			} catch (IOException e) {

				e.printStackTrace();

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		}

		// write()
		OutputStream outputStream1 = null;

		try {

			outputStream1 = new FileOutputStream("저장될 위치 또는 저장할 파일 위치");
			String data = "입력할 데이터 내용";
			byte[] bs = data.getBytes(); // 입력될 데이터를 byte 단위 배열로 환산

			try {

				outputStream1.write(bs);

			} catch (IOException e) {

				e.printStackTrace();

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} finally {

			try {

				if (outputStream1 != null)
					outputStream1.close();

			} catch (IOException e) {

				e.printStackTrace();

			}

		}

		// write()
		OutputStream outputStream2 = null;

		try {

			outputStream2 = new FileOutputStream("저장될 위치 또는 저장할 파일 위치");
			String data = "입력할 데이터 내용";
			byte[] bs = data.getBytes(); // 입력될 데이터를 byte 단위 배열로 환산

			try {

				outputStream2.write(bs, 0, 5); // outputStream2.write(bs, 시작, 끝);

			} catch (IOException e) {

				e.printStackTrace();

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} finally {

			try {

				if (outputStream2 != null)
					outputStream2.close();

			} catch (IOException e) {

				e.printStackTrace();

			}

		}

	}

}
