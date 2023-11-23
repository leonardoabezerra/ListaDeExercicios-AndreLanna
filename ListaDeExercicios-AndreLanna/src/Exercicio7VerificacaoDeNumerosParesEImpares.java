import javax.swing.JOptionPane;

public class Exercicio7VerificacaoDeNumerosParesEImpares {
    
    public static void main(String[] args) {

          // Declaração de Variáveis
        int n;
        String resultado = new String();

          // Obtenção de dados  
        
        String strn = JOptionPane.showInputDialog("Insira um número inteiro qualquer");
        n = Integer.parseInt(strn);

        
        if (n % 2 == 0) {
            resultado = "par";
        } else {
            resultado = "ímpar";
        }

          // Organização dos dados e mostrar o resultado para o usuário
        JOptionPane.showMessageDialog(null, "O número " + n + " é " + resultado);

    }


}
