package aula4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int opcao;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar um número");
            System.out.println("2. Remover um número");
            System.out.println("3. Verificar a posição de um número");
            System.out.println("4. Modificar um número de uma posição");
            System.out.println("5. Média dos valores");
            System.out.println("6. Imprimir números");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o número a ser adicionado: ");
                    int numAdd = scanner.nextInt();
                    numeros.add(numAdd);
                    break;
                case 2:
                    System.out.print("Digite o número a ser removido: ");
                    int numRemove = scanner.nextInt();
                    if (numeros.remove((Integer) numRemove)) {
                        System.out.println("Número removido com sucesso.");
                    } else {
                        System.out.println("Número não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o número para verificar a posição: ");
                    int numBusca = scanner.nextInt();
                    int posicao = numeros.indexOf(numBusca);
                    if (posicao != -1) {
                        System.out.println("O número " + numBusca + " está na posição " + posicao + ".");
                    } else {
                        System.out.println("Número não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Digite a posição a ser modificada: ");
                    int pos = scanner.nextInt();
                    if (pos >= 0 && pos < numeros.size()) {
                        System.out.print("Digite o novo número: ");
                        int novoNum = scanner.nextInt();
                        numeros.set(pos, novoNum);
                        System.out.println("Número atualizado com sucesso.");
                    } else {
                        System.out.println("Posição inválida.");
                    }
                    break;
                case 5:
                    if (numeros.isEmpty()) {
                        System.out.println("Lista vazia. Não há média para calcular.");
                    } else {
                        double soma = 0;
                        for (int num : numeros) {
                            soma += num;
                        }
                        System.out.println("Média dos valores: " + (soma / numeros.size()));
                    }
                    break;
                case 6:
                    System.out.println("Números armazenados: " + numeros);
                    break;
                case 7:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 7);
        
        scanner.close();
    }
}
