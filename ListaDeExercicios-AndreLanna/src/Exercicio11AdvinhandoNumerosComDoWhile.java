import javax.swing.JOptionPane;
import java.util.Random;

public class Exercicio11AdvinhandoNumerosComDoWhile {
    
    public static void main(String[] args) {

          // Declaração de Variáveis
        int n, flag = 0, resultado, tentativas = 0;
        Random rand = new Random();

        resultado = rand.nextInt(10);

        do {
              // Obter tentativa do usuário
            String strn = JOptionPane.showInputDialog("Advinhe o número entre 1 e 10");
            n = Integer.parseInt(strn);
            tentativas++;

              // Verificar acerto
            if (n == resultado) {
                flag++;
            } else {
                if (n < resultado) {
                    JOptionPane.showMessageDialog(null, "Tente novamente, o número é maior");
                } else {
                    JOptionPane.showMessageDialog(null, "Tente novamente, o número é menor");
                }
            }

        } while (flag == 0);

        JOptionPane.showMessageDialog(null, "Parabéns! Você acertou o número " + resultado + " em " + tentativas + " tentativas");
    }

}
