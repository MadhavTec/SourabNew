package com.techolution.problmes;

import java.util.Scanner;

public class ConsecutiveSum {
	static void consecutiveSumCount(int N) {
		int start = 1, end = 1;
		int sum = 1;
		int count = 0;
		while (start <= N / 2) {
			if (sum < N) {
				end += 1;
				sum += end;
			} else if (sum > N) {
				sum -= start;
				start += 1;
			} else if (sum == N) {
				count++;
				sum -= start;
				start += 1;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		try {
			if (input >= 1 && input <= Math.pow(10, 12)) {
				consecutiveSumCount(input);
			} else {
				throw new Exception("The given inpiut is not in the given limits.");
			}
		} catch (Exception e) {
			System.out.println(e);

		}

	}

}
