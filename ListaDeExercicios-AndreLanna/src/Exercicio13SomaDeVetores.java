import javax.swing.JOptionPane;

public class Exercicio13SomaDeVetores {
    
    public static void main(String[] args) {

          // Declaração de Variáveis
        String numero = new String();
        String resultado = new String();
        resultado = "";
        int n;

        String strn = JOptionPane.showInputDialog("Digite o tamanho dos vetores");
        n = Integer.parseInt(strn);

        int[] vetor1 = new int[n];
        int[] vetor2 = new int[n];
        int[] vetorsoma = new int[n];

        JOptionPane.showMessageDialog(null, "Informe os valores do primeiro vetor a seguir");

        for (int i = 0; i < n; i++) {

            numero = JOptionPane.showInputDialog("Dgite o " + (i+1) + " número");
            vetor1[i] = Integer.parseInt(numero);

        }

        JOptionPane.showMessageDialog(null, "Informe os valores do segundo vetor a seguir");

        for (int i = 0; i < n; i++) {

            numero = JOptionPane.showInputDialog("Digite o " + (i+1) + " número");
            vetor2[i] = Integer.parseInt(numero);

        }

          // SOma de vetores

          for (int i = 0; i < n; i++) {
            vetorsoma[i] = vetor1[i] + vetor2[i];

          }

          for (int i = 0; i < n-1; i++) {resultado += vetorsoma[i] + ", ";}

          JOptionPane.showMessageDialog(null, "A soma dos vetores é: [" + resultado + vetorsoma[n-1] + "]");



    }

}
