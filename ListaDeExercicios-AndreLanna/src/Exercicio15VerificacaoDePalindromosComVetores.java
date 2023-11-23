import javax.swing.JOptionPane;

public class Exercicio15VerificacaoDePalindromosComVetores {
    
    public static void main(String[] args) {

        String palavra = JOptionPane.showInputDialog("Digie uma palavra");
        String palavra_rev = new StringBuilder(palavra).reverse().toString();

        if (palavra.equals(palavra_rev)) {
            JOptionPane.showMessageDialog(null, "A palavra \"" + palavra + "\" é um palíndromo");
        } else {
            JOptionPane.showMessageDialog(null, "A palavra \"" + palavra + "\" não é um palíndromo");
        }

    }

}
