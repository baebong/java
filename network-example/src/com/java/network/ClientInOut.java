package com.java.network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientInOut {

	public static void main(String[] args) {

		Socket socket = null;

		InputStream inputStream = null;
		DataInputStream dataInputStream = null;

		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;

		Scanner scanner = null;

		try {

			socket = new Socket("localhost", 8081);
			System.out.println("서버 연결 완료");

			outputStream = socket.getOutputStream();
			dataOutputStream = new DataOutputStream(outputStream);

			inputStream = socket.getInputStream();
			dataInputStream = new DataInputStream(inputStream);

			scanner = new Scanner(System.in);

			while (true) {

				System.out.print("client : ");
				String outMessage = scanner.nextLine();

				dataOutputStream.writeUTF(outMessage);
				dataOutputStream.flush(); // 데이터를 비워주는 것

				String serverMessage = dataInputStream.readUTF();
				System.out.println("serverMessage : " + serverMessage);

				if (outMessage.equals("stop"))
					break;

			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			try {

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
