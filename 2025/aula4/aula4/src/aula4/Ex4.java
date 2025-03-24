package aula4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> filaPacientes = new ArrayList<>();
        int opcao;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar um paciente");
            System.out.println("2. Atender um paciente");
            System.out.println("3. Desistência");
            System.out.println("4. Verificar posição de um paciente");
            System.out.println("5. Verificar tamanho da fila");
            System.out.println("6. Imprimir fila");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do paciente: ");
                    String paciente = scanner.nextLine();
                    filaPacientes.add(paciente);
                    System.out.println("Paciente adicionado à fila.");
                    break;
                case 2:
                    if (!filaPacientes.isEmpty()) {
                        System.out.println("Paciente atendido: " + filaPacientes.remove(0));
                    } else {
                        System.out.println("A fila está vazia.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do paciente que desistiu: ");
                    String desistente = scanner.nextLine();
                    if (filaPacientes.remove(desistente)) {
                        System.out.println("Paciente removido da fila.");
                    } else {
                        System.out.println("Paciente não encontrado na fila.");
                    }
                    break;
                case 4:
                    System.out.print("Digite o nome do paciente para verificar a posição: ");
                    String nomeBusca = scanner.nextLine();
                    int posicao = filaPacientes.indexOf(nomeBusca);
                    if (posicao != -1) {
                        System.out.println("O paciente " + nomeBusca + " está na posição " + (posicao + 1) + ".");
                    } else {
                        System.out.println("Paciente não encontrado na fila.");
                    }
                    break;
                case 5:
                    System.out.println("Tamanho da fila: " + filaPacientes.size());
                    break;
                case 6:
                    System.out.println("Fila de pacientes: " + filaPacientes);
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
