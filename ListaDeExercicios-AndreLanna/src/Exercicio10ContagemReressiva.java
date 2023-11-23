import javax.swing.JOptionPane;

public class Exercicio10ContagemReressiva {
    
    public static void main(String[] args) {

          // Declaração de Variáveis
        int n;

        String strn = JOptionPane.showInputDialog("Digite um número inicial");
        n = Integer.parseInt(strn);
        int y = n;
        int i = 0;

        while (i < n) {
            JOptionPane.showMessageDialog(null, y);
            y--;
            i++;
        }
        

    }

}
