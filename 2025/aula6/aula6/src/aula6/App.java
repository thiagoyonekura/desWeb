package aula6;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws Exception {
        //Aqui vai o código ClasseObjeto.java
        Carro c1; //Declaração
        c1 = new Carro(); //Instanciação do objeto c1 que pertence a classe Carro

        //c1.tipo = "Porsche";
        c1.setTipo("Porsche");
        c1.setPlaca ("ABC4J41");
        c1.setCor ("Preto");
        c1.setNum_portas (2);

        c1.ligar();

        Carro c2 = new Carro();
        String t = JOptionPane.showInputDialog("Digite o modelo do carro");
        c2.setTipo(t);
        c2.setPlaca (JOptionPane.showInputDialog("Digite a placa do carro"));
        c2.setCor (JOptionPane.showInputDialog("Digite a cor do carro"));
        //String n = JOptionPane.showInputDialog("Digite o número de portas");
        //c2.num_portas = Integer.parseInt(n);
        c2.setNum_portas(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de portas")));
        JOptionPane.showMessageDialog(null, "--- Carro --- \n" + "Tipo: " + c2.getTipo() + "\n" + "Cor: " + c2.getCor() + "\n" + "Placa: " + c2.getPlaca() + "\n" + "Número de Portas: " + c2.getNum_portas());
    }
}