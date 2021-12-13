package com.java.inputOutput.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {

		// 파일 복사
		InputStream inputStream = null;
		OutputStream outputStream = null;

		try {

			inputStream = new FileInputStream("원본 파일 위치");
			outputStream = new FileOutputStream("복사 파일 위치");

			byte[] bs = new byte[3];

			while (true) {

				int len = inputStream.read(bs);
				if (len == -1)
					break;
				outputStream.write(bs);
				// outputStream.write(bs, 0, len);

			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			if (inputStream != null) {

				try {

					inputStream.close();

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

			if (outputStream != null) {

				try {

					outputStream.close();

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		}

	}

}
