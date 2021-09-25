package com.hexacta.test;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {

	public String combinationsOf(int[] A, int x) {
		Set<String> combinations = new HashSet<>(); // Evitar combinações repetidas

		for (int i = 0; i < A.length; i++) {
			for (int j = i; j < A.length; j++) {
				if (A[i] + A[j] == x) {
					combinations.add("[" + A[i] + ", " + A[j] + "]");
				}
			}
		}

		return combinations.toString();
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();

		int[] array = { -2, -1, 0, 2, 4, 7, 8, 9, 9 };
		System.out.println(s.combinationsOf(array, 8));

		System.out.println("-------------------------");

		array = new int[] { -1, 0, 1, 2, 3, 4, 5, 6 };
		System.out.println(s.combinationsOf(array, 2));
	}
}
