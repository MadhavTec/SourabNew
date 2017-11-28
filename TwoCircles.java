package com.techolution.problmes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwoCircles {

	private static String getRelation(int x0, int x1, int y0, int y1, int r0, int r1) {

		double distance = Math.sqrt(Math.pow(Math.abs(x0 - x1), 2) + Math.pow(Math.abs(y0 - y1), 2));

		if ((distance == Math.abs(r0 + r1)) || (distance == Math.abs(r0 - r1))) {
			return "Touching";
		} else if (distance < (r0 + r1)) {
			return "Intersecting";
		} else if (x0 == x1 && y0 == y1) {
			return "Concentric";
		} else if (((x0 < x0) && (y0 < y1) && (r0 < r1)) || ((x0 > x0) && (y0 > y1) && (r0 > r1))) {
			return "Disjoint‐Inside";
		} else {
			return "Disjoint‐Outside";
		}

	}

	public static void main(String[] args) {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			int x0 = Integer.parseInt(reader.readLine());
			int x1 = Integer.parseInt(reader.readLine());
			int y0 = Integer.parseInt(reader.readLine());
			int y1 = Integer.parseInt(reader.readLine());
			int r0 = Integer.parseInt(reader.readLine());
			int r1 = Integer.parseInt(reader.readLine());

			System.out.println(getRelation(x0, x1, y0, y1, r0, r1));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
