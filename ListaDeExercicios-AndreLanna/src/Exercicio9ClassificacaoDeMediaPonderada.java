import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio9ClassificacaoDeMediaPonderada {
    
    public static void main(String[] args) {

          // Declaração de Variáveis
        float n1, n2, n3, p1, p2, p3, media;
        String classificacao = new String();

        DecimalFormat df = new DecimalFormat("#.#");

          // Obtenção de dados
        String strn1 = JOptionPane.showInputDialog("Informe a primeira nota");
        String strp1 = JOptionPane.showInputDialog("Informe o peso da primeira nota");

        String strn2 = JOptionPane.showInputDialog("Informa a segunda nota");
        String strp2 = JOptionPane.showInputDialog("Informe o peso da segunda nota");

        String strn3 = JOptionPane.showInputDialog("Informe a terceira nota");
        String strp3 = JOptionPane.showInputDialog("Informe o peso da terceira nota");

        n1 = Float.parseFloat(strn1);
        n2 = Float.parseFloat(strn2);  // String --> float
        n3 = Float.parseFloat(strn3);
        
        p1 = Float.parseFloat(strp1);
        p2 = Float.parseFloat(strp2);  // String --> float
        p3 = Float.parseFloat(strp3);

          // Cálculo da média
        media = ((n1 * p1) + (n2 * p2) + (n3 * p3)) / (p1 + p2 + p3);
        String media_df = df.format(media);  // Formatar com uma casa decimal

          // Verificação da Classificação
        if (media >= 90 && media <= 100) {
            classificacao = "A";
        } else if (media >= 80 && media < 90) {
            classificacao = "B";
        } else if (media >= 70 && media < 80) {
            classificacao = "C";
        } else if (media >= 60 && media < 70) {
            classificacao = "D";
        } else if (media < 60) {
            classificacao = "F";
        } else {
            JOptionPane.showMessageDialog(null, "Erro. Valor da média muito alto");
        }

          // Mostrar resultado para o usuário
        JOptionPane.showMessageDialog(null, "A média ponderada é " + media_df + " que corresponde à classificação " + classificacao);

    }
}
