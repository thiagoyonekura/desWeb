package aula3;

import java.security.SecureRandom;

import javax.swing.JOptionPane;

public class Loop {
	
	 public static void main(String[]args) {
		 int tamanho = 10;
		 String nomes []; //Declaração
		 nomes = new String [tamanho]; // Instanciação
		 for(int i=0; i< tamanho; i++) {
			 nomes [i] = JOptionPane.showInputDialog("Digite o nome " + (i+1));
			 JOptionPane.showMessageDialog(null, nomes[i]);
		 }
		 SecureRandom random = new SecureRandom();
		 int sorteio = random.nextInt(tamanho);
		 JOptionPane.showMessageDialog(null, "O nome sorteado é:"+nomes[sorteio]);
	    }
}
