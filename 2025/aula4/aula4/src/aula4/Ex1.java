package aula4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>(); // Declaração
		Integer n = -1;
		do {
			System.out.println("Digite um número inteiro positivo ou -1 para sair");
			n = scan.nextInt();
			if (n != -1) {
				if (numeros.contains(n)) {
					System.out.println("O número " + n + " está no ArrayList");
				} else {
					numeros.add(n);
					System.out.println("O número " + n + " foi inserido no ArrayList");
				}

			}
		} while (n != -1);
		System.out.println("Foram registrados " + (numeros.size()) + " números. \n");

		// Ordenar o ArrayList
		Collections.sort(numeros);
		// Exibindo valores do ArrayList
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}

	}
}
