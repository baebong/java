package com.java.inputOutput.data;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DataInOut {

	public static void main(String[] args) {

		String str = "Hello JAVA World!!";
		OutputStream outputStream = null;
		DataOutputStream dataOutputStream = null;

		try {

			outputStream = new FileOutputStream("저장될 파일 위치");
			dataOutputStream = new DataOutputStream(outputStream);

			dataOutputStream.writeUTF(str);

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

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
