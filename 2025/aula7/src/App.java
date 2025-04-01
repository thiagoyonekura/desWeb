
import javax.swing.JOptionPane;



public class App {

    /*
    Código
    1. Crie a classe Pessoa (defina os atributos que achar necessário). Para
    essa classe, os atributos devem ser privados. Criem também os
    métodos de acesso aos atributos e também um método que
    imprime os dados da pessoa. Crie também uma outra classe com
    um método principal, que instancia um objeto da classe Pessoa,
    atribui valores aos atributos e acessa os seus métodos.

     * https://github.com/costasilvati/POO/ 
     * 2025_MAT
     */
    public static void main(String[] args) throws Exception {
        // Aqui vai o código ClasseObjeto.java
        Carro c1; // Declaração
        // instanciação do objeto c1 que pertence a classe Carro
        c1 = new Carro();
        // Editando atributos usando SET
        c1.setTipo("Gol");
        c1.setCor("Preto");
        c1.setPlaca("OBP4J41");
        c1.setNum_portas(5);
        // Método
        c1.ligar();

        Carro c2 = new Carro();// Declaração + instanciação do objeto c2
        String t = JOptionPane.showInputDialog("Digite o modelo do carro");
        c2.setTipo(t);
        c2.setCor(JOptionPane.showInputDialog("Digite a cor do carro"));
        c2.setPlaca(JOptionPane.showInputDialog("Digite a placa do carro"));
        /* String n = JOptionPane.showInputDialog("Digite o numero de portas");
        int nInt = Integer.parseInt(n);
        c2.setNum_portas(nInt);*/
        c2.setNum_portas(
                Integer.parseInt(
                    JOptionPane.showInputDialog("Digite o numero de portas")
                    )
                );
        JOptionPane.showMessageDialog(null,
        "--- Carro --- \n"+
        "Tipo: "+ c2.getTipo() + "\n"+
        "Cor: "+ c2.getCor() + "\n" +
        "Placa: " + c2.getPlaca() + "\n" + 
        "N. portas: "+ c2.getNum_portas() );
    } 
}
