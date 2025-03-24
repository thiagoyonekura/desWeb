package aula4;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<>(); // Declaração
		Integer n = -1;
		do {
			System.out.println("Digite um número inteiro positivo ou -1 para sair");
			n = scan.nextInt();
			if (n != -1) {
				numeros.add(n);
			}
		} while (n != -1);
		System.out.println("Foram registrados " + (numeros.size()) + " números.");
		// Exibindo valores do ArrayList
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}

		numeros.remove(0);
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
		// Verificar se um valor existe no ArrayList
		System.out.println("Digite um número para buscar no ArrayList: ");
		int buscar = scan.nextInt();
		if (numeros.contains(buscar)) {
			System.out.println("O número " + buscar + " está no ArrayList");
		} else {
			System.out.println("O número " + buscar + " NÃO está no ArrayList");
		}
	}
}
