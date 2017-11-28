package com.techolution.problmes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InTheFuture {

	public static void main(String[] args) {
		BufferedReader reader = null;
			reader = new BufferedReader(new InputStreamReader(System.in));
			int a = Integer.parseInt(reader.readLine());
			int k = Integer.parseInt(reader.readLine());
			int p = Integer.parseInt(reader.readLine());

			int minNum = minNum(a, k, p);
			System.out.println(minNum);
	}

	private static int minNum(int a, int k, int p) {

		int asha = a + p;
		int kelly = k;
		int no_of_Days = 1;

		if (asha > kelly) {
				while (true) {
				if (asha < kelly) {
					return no_of_Days;
				} else if (asha == kelly)
					return no_of_Days + 1;
				else {
					asha = asha + a;
					kelly = kelly + k;
					no_of_Days++;
				}
			}
		} else if (asha < kelly) {
			return no_of_Days;
		} else {
			return no_of_Days+1;
		}
	}
}
