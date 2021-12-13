package com.java.inputOutput.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Writer {

	public static void main(String[] args) {

		String fileName = "저장될 파일 위치";

		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;

		try {

			String str = "Hello Java World\n" + "Hello C World\n" + "Hello C++ World\n";

			fileWriter = new FileWriter(fileName);
			bufferedWriter = new BufferedWriter(fileWriter);

			bufferedWriter.write(str);

			System.out.println("end");

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				if (bufferedWriter != null)
					bufferedWriter.close();

				if (fileWriter != null)
					fileWriter.close();

			} catch (Exception e) {

				e.printStackTrace();

			}

		}

	}

}
