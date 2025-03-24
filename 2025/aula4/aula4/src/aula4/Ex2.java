package aula4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<>();
		String nomeDigitado = "Fim";
		do {
			System.out.println("Digite um nome completo ou fim para sair");
			nomeDigitado = scanner.nextLine();
			// Verificar se o nome já existe no ArrayList
			if (nomes.contains(nomeDigitado)) {
				System.out.println("O nome " + nomeDigitado + " está na posição " + nomes.indexOf(nomeDigitado));
			} else {
				nomes.add(nomeDigitado);
			}

		} while (!nomeDigitado.equalsIgnoreCase("Fim"));
		System.out.println("Digite um nome que deseja remover do ArrayList");
		String nomeRemover = scanner.nextLine();
		if((nomes.contains(nomeRemover))) {
			nomes.remove(nomes.indexOf(nomeRemover));
		}else {
			System.out.println("Nome " + nomeRemover + " não está cadastrado");
		}
		
		scanner.close();

	}
}
