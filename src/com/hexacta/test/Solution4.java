package com.hexacta.test;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution4 {

	public void printIntersection(int[] setA, int[] setB) {
		if (setA != null && setB != null) {
			Arrays.sort(setA);
			Arrays.sort(setB);
			ArrayList<Integer> commonSet = new ArrayList<Integer>();

			int i = 0;
			int j = 0;

			while (i < setA.length && j < setB.length) {
				if (setA[i] == setB[j]) {
					commonSet.add(setA[i]);
					i++;
					j++;
				} else if (setA[i] > setB[j]) {
					j++;
				} else {
					i++;
				}
			}

			for (int k = 0; k < commonSet.size(); k++) {
				System.out.print(commonSet.get(k) + " ");
			}
		}
	}

	public static void main(String[] args) {

		int[] setA = { 1, 25, 3, 0, -4, 81 };
		int[] setB = { 45, 9, 2, 3, -3, 1, 24, 25, 9 };

		new Solution4().printIntersection(setA, setB);

	}

}
