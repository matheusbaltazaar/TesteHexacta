package com.hexacta.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution1 {

	public int solution(int[] A) {

		List<Integer> list = Arrays.stream(A)
				.distinct() // Remover números repetidos, caso houver
				.boxed()
				.collect(Collectors.toList());

		int max = Arrays.stream(A).max().getAsInt();

		if (max > 0) {
			// O menor inteiro positivo maior que 0 possível será sempre 1.
			Iterator<Integer> it = IntStream.range(1, max).iterator();

			while (it.hasNext()) {
				int n = it.next();
				
				// Se no range de inteiros possíveis gerado a partir de 1
				// até o maior valor (incrementados em 1) conter um
				// número que não está presente entre os inteiros
				// contidos no array A, então este será o menor inteiro
				// não presente possível.
				if (!list.contains(n)) {
					return n;
				}
			}

			// Se no array A conter todos os inteiros entre 1 e o
			// maior, então o menor inteiro não presente será o
			// inteiro após o maior presente.
			return max + 1;
		}

		// Se no array A o maior valor presente for menor ou igual
		// a 0, então o menor inteiro positivo possível será 1.
		return 1;
	}

	public static void main(String[] args) {
		Solution1 s = new Solution1();

		int[] array = { 1, 3, 6, 4, 1, 2 }; // MIN: 1 | MAX: 6
		System.out.println(Arrays.toString(array));
		System.out.println("Solução: " + s.solution(array));

		System.out.println("----------------------------------");

		array = new int[] {2, 3 }; // MIN: 1 | MAX: 3
		System.out.println(Arrays.toString(array));
		System.out.println("Solução: " + s.solution(array));

		System.out.println("----------------------------------");

		array = new int[] { -1, -3 }; // MIN: -1 | MAX: 3
		System.out.println(Arrays.toString(array));
		System.out.println("Solução: " + s.solution(array));

		System.out.println("----------------------------------");

		array = new int[] { -1 }; // MIN: -1 | MAX: -1
		System.out.println(Arrays.toString(array));
		System.out.println("Solução: " + s.solution(array));
	}
}
