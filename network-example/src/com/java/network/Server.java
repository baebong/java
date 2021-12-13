package com.java.network;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {

		// 서버 소켓
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {

			serverSocket = new ServerSocket(8081);
			System.out.println("클라이언트 맞을 준비 완료!!");

			socket = serverSocket.accept(); // 소켓 객체를 받아들인다.
			System.out.println("클라이언트 연결!");
			System.out.println("socket : " + socket);

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				if (serverSocket != null)
					serverSocket.close();

				if (socket != null)
					socket.close();

			} catch (Exception e) {

				e.printStackTrace();

			}

		}

	}

}
