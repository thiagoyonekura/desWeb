package aula3;


import java.util.Scanner;
import javax.swing.JOptionPane;


public class App {


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int codAluno = 0;
        float media = 0;
        do {
            for(int i=1; i<=3; i++){
                System.out.println("Digite a nota "+ i +" do aluno");
                media+= scanner.nextFloat();
            }
            //System.out.println("Digite o código do aluno");
            String texto = JOptionPane.showInputDialog(null, "Digite o código do aluno");

            codAluno = Integer.parseInt(texto);
            System.out.println("A media do aluno é "+ (media/3));

        } while (codAluno != 0);
        scanner.close(); //encerrar o scanner
        System.out.println("Hello, World!");

    }
}
