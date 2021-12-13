package com.java.inputOutput.data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class DataInOutCopy {

	public static void main(String[] args) {

		InputStream inputStream = null;
		DataInputStream dataInputStream = null;

		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;

		try {

			inputStream = new FileInputStream("읽을 파일 위치");
			dataInputStream = new DataInputStream(inputStream);

			String str = dataInputStream.readUTF();

			outputStream = new FileOutputStream("복사 파일 위치");
			dataOutputStream = new DataOutputStream(outputStream);

			dataOutputStream.writeUTF(str);

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				if (dataInputStream != null)
					dataInputStream.close();

			} catch (Exception e) {

				e.printStackTrace();

			}

			try {

				if (inputStream != null)
					inputStream.close();

			} catch (Exception e) {

				e.printStackTrace();

			}

			try {

				if (dataOutputStream != null)
					dataOutputStream.close();

			} catch (Exception e) {

				e.printStackTrace();

			}

			try {

				if (outputStream != null)
					outputStream.close();

			} catch (Exception e) {

				e.printStackTrace();

			}

		}

	}

}
