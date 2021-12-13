package com.java.inputOutput.buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

	public static void main(String[] args) {

		String fileName = "읽어올 파일 위치";

		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		try {

			fileReader = new FileReader(fileName);
			bufferedReader = new BufferedReader(fileReader);

			String strLine;

			try {

				while ((strLine = bufferedReader.readLine()) != null) { // 한 라인씩 읽는다.
					System.out.println(strLine);

				}

			} catch (IOException e) {

				e.printStackTrace();

			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} finally {

			try {

				if (bufferedReader != null)
					bufferedReader.close();

				if (fileReader != null)
					fileReader.close();

			} catch (Exception e) {

				e.printStackTrace();

			}

		}

	}

}
