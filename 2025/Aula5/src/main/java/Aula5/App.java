package Aula5;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws Exception {
        //Aqui vai o código ClasseObjeto.java
        Carro c1; //Declaração
        c1 = new Carro(); //Instanciação do objeto c1 que pertence a classe Carro

        c1.tipo = "Porsche";
        c1.placa = "ABC4J41";
        c1.cor = "Preto";
        c1.num_portas = 2;

        c1.ligar();

        Carro c2 = new Carro();
        c2.tipo = JOptionPane.showInputDialog("Digite o modelo do carro");
        c2.placa = JOptionPane.showInputDialog("Digite a placa do carro");
        c2.cor = JOptionPane.showInputDialog("Digite a cor do carro");
        //String n = JOptionPane.showInputDialog("Digite o número de portas");
        //c2.num_portas = Integer.parseInt(n);
        c2.num_portas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de portas"));
        JOptionPane.showMessageDialog(null, "--- Carro --- \n" + "Tipo: " + c2.tipo + "\n" + "Cor: " + c2.cor + "\n" + "Placa: " + c2.placa + "\n" + "Número de Portas: " + c2.num_portas);
    }
}
