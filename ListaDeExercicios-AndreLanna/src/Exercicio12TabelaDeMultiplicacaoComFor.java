import javax.swing.JOptionPane;

public class Exercicio12TabelaDeMultiplicacaoComFor {
    
    public static void main(String[] args) {

          // Declaração de Variáveis
        int n, mult;
        String tabela = new String();
        tabela = "";

        String strn = JOptionPane.showInputDialog("Digite um número para a tabela de multiplicação");
        n = Integer.parseInt(strn);

        for (int i = 1; i <= 10; i++) {

            mult = i * n;
            tabela += i + " x " + n + " = " + mult + "\n"; 

        }

        JOptionPane.showMessageDialog(null, "Tabela de multiplicação para " + n + ":\n" + tabela);

    }

}
