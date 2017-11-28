package com.techolution.problmes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LargeResponses {
	private static final int NOOF_FIELDS = 10;
	private static final int THRESHOLD_BYTES = 5000;
	private static final String FILE_PREFIX = "bytes_";

	public static void main(String[] args) {

		BufferedReader fileContentReader = null;
		PrintWriter writer = null;
		int nofoRecords = 0;
		int totalBytes = 0;
		String line = "";
		try {
			Scanner scanner = new Scanner(System.in);
			String fileName = scanner.nextLine();
			String outputFileName = fileName.substring(0, fileName.lastIndexOf("/") + 1) + FILE_PREFIX
					+ fileName.substring(fileName.lastIndexOf("/") + 1);
			fileContentReader = new BufferedReader(new FileReader(fileName));

			while ((line = fileContentReader.readLine()) != null) {
				String tempArray[] = line.split(" ");
				if (tempArray.length != NOOF_FIELDS)
					throw new Exception("There is more or less data is there in the given record :" + line);
				if (Integer.parseInt(tempArray[9]) > THRESHOLD_BYTES) {
					nofoRecords++;
					totalBytes = totalBytes + Integer.parseInt(tempArray[9]);
				}
			}

			writer = new PrintWriter(outputFileName, "UTF-8");
			writer.println(nofoRecords);
			writer.println(totalBytes);

			System.out.println(nofoRecords);
			System.out.println(totalBytes);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {

				if (fileContentReader != null)
					fileContentReader.close();

				if (writer != null)
					writer.close();

			} catch (IOException ex) {
				ex.printStackTrace();
			}

		}
	}

}
