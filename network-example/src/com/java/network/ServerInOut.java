package com.java.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerInOut {

	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		Socket socket = null;

		InputStream inputStream = null;
		DataInputStream dataInputStream = null;

		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;

		Scanner scanner = null;

		try {

			serverSocket = new ServerSocket(8081);
			System.out.println("클라이언트 맞을 준비 완료!!");

			socket = serverSocket.accept();
			System.out.println("클라이언트 연결!");
			System.out.println("socket : " + socket);

			inputStream = socket.getInputStream();
			dataInputStream = new DataInputStream(inputStream);

			outputStream = socket.getOutputStream();
			dataOutputStream = new DataOutputStream(outputStream);

			scanner = new Scanner(System.in);

			while (true) {

				String clientMessage = dataInputStream.readUTF();
				System.out.println("clientMessage : " + clientMessage);

				System.out.print("server : ");
				String outMessage = scanner.nextLine();

				dataOutputStream.writeUTF(outMessage);
				dataOutputStream.flush(); // 데이터를 비워주는 것

				if (clientMessage.equals("stop"))
					break;

			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			try {

				if (serverSocket != null)
					serverSocket.close();

				if (socket != null)
					socket.close();

				if (inputStream != null)
					inputStream.close();

				if (dataInputStream != null)
					dataInputStream.close();

				if (outputStream != null)
					outputStream.close();

				if (dataOutputStream != null)
					dataOutputStream.close();

			} catch (Exception e) {

				e.printStackTrace();

			}

		}

	}

}
