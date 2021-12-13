package com.java.network;

import java.net.Socket;

public class Client {

	public static void main(String[] args) {

		// 클라이언트 소켓
		Socket socket = null;

		try {

			socket = new Socket("localhost", 8081); // IP 도메인 주소, 포트번호 입력 / 127.0.0.1 = localhost
			System.out.println("서버 연결");
			System.out.println("socket : " + socket);

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				if (socket != null)
					socket.close();

			} catch (Exception e) {

				e.printStackTrace();

			}

		}

	}

}
