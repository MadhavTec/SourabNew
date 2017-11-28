package com.techolution.problmes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindTheWinner {
	
	public static void main(String[] args) {
		BufferedReader reader = null;
	
			reader = new BufferedReader(new InputStreamReader(System.in));
			
			int aArrayLenght = Integer.parseInt(reader.readLine());
			int aArray[] = new int[aArrayLenght];
			for (int i = 0; i < aArrayLenght; i++) {
				aArray[i] = Integer.parseInt(reader.readLine());
			}

			int mArrayLenght = Integer.parseInt(reader.readLine());
			int mArray[] = new int[mArrayLenght];
			for (int i = 0; i < mArrayLenght; i++) {
				mArray[i] = Integer.parseInt(reader.readLine());
			}

			String evenOrOdd = reader.readLine();

			String winner = winner(aArray, mArray, evenOrOdd);
			System.out.println(winner);

		

	}

	private static String winner(int[] aArray, int[] mArray, String evenOrOdd) {
		int startIndex = -1;
		int aScore = 0;
		int mScore = 0;
		
			if (evenOrOdd.equals("Even"))
				startIndex = 0;
			else if (evenOrOdd.equals("Odd"))
				startIndex = 1;
			else
				throw new Exception("Invalid input");

			for (int i = startIndex; i < aArray.length; i = i + 2) {

				aScore = aScore + (aArray[i] - mArray[i]);
				mScore = mScore + (mArray[i] - aArray[i]);
			}

			if (aScore < mScore)
				return "Maria";
			else if (aScore > mScore)
				return "Andrea";
			else
				return "Tie";

		return null;
	}
}
