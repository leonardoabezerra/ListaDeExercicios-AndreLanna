import javax.swing.JOptionPane;

public class Exercicio14ProdutoEscalar {
    
    public static void main(String[] args) {

          // Declaração de Variáveis
        String numero = new String();
        int n;
        float resultado = 0;

        String strn = JOptionPane.showInputDialog("Digite o tamanho dos vetores");
        n = Integer.parseInt(strn);

        float[] vetor1 = new float[n];
        float[] vetor2 = new float[n];
        float[] vetormult = new float[n];

        JOptionPane.showMessageDialog(null, "Informe os valores do primeiro vetor a seguir");

        for (int i = 0; i < n; i++) {

            numero = JOptionPane.showInputDialog("Dgite o " + (i+1) + " número");
            vetor1[i] = Float.parseFloat(numero);

        }

        JOptionPane.showMessageDialog(null, "Informe os valores do segundo vetor a seguir");

        for (int i = 0; i < n; i++) {

            numero = JOptionPane.showInputDialog("Digite o " + (i+1) + " número");
            vetor2[i] = Float.parseFloat(numero);

        }

          // SOma de vetores

          for (int i = 0; i < n; i++) {
            vetormult[i] = vetor1[i] * vetor2[i];

          }

          for (int i = 0; i < n; i++) {resultado += vetormult[i];}
        

          JOptionPane.showMessageDialog(null, "O produto escalar dos vetores é: " + resultado);



    }

}
