package com.java.basic;

import java.net.ServerSocket;
import java.net.Socket;

public class JavaPractice23 {

	// 네트워킹

	// 네트워크 데이터 입력 및 출력
	// 네트워크 대상(객체) 사이에 입/출력(InputStream, OutputStream)을 이용해서 데이터를 입력하고 출력한다.

	// 소켓(Socket)
	// 네트워크상에서 데이터를 주고받기 위한 장치이다.

	// Socket 클래스
	// 서버는 클라이언트를 맞을 준비를 하고 있다가 클라이언트의 요청에 반응한다.
	// 클라이언트(Client) : 어떠한 데이터를 요청하는 곳 (ex. 브라우저)
	// 서버(Server) : 데이터를 제공해 주는 곳 (ex. 네이버)

	// Client와 Server 소켓(Socket)
	// 서버에 ServerSocket을 준비하고 클라이언트에서 Socket을 이용해서 접속한다.

	// 양방향 통신
	// 클라이언트와 서버는 InputStream, OutputStream을 이용해서 양방향 통신을 할 수 있다.

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null;

		try {

			serverSocket = new ServerSocket(8081);
			System.out.println("클라이언트 맞을 준비 완료!!");

			socket = serverSocket.accept();
			System.out.println("클라이언트 연결");
			System.out.println("socket : " + socket);

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			try {

				if (socket != null)
					socket.close();

				if (serverSocket != null)
					serverSocket.close();

			} catch (Exception e) {

				e.printStackTrace();

			}

		}

	}

}
