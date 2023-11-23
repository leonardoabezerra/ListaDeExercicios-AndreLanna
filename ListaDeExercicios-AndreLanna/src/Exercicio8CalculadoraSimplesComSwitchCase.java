import javax.swing.JOptionPane;

public class Exercicio8CalculadoraSimplesComSwitchCase {

    public static void main(String[] args) {

          // Declaração de Variáveis
        int n1, n2, resultado;
        String opcao;
        String[] operador = new String[] {
                "Adição (+)",
                "Subtração (-)",
                "Multiplicação (*)",
                "Divisão (/)" 
        };

          // Obtenção de dados
        String strn1 = JOptionPane.showInputDialog("Digite o primeiro número");
        n1 = Integer.parseInt(strn1);

        String strn2 = JOptionPane.showInputDialog("Digite o segundo numero");
        n2 = Integer.parseInt(strn2);

        opcao = (String)JOptionPane.showInputDialog(null, "Escolha a operação", 
                                                    "Operadores",
                                                    JOptionPane.QUESTION_MESSAGE,
                                                    null,
                                                    operador,
                                                    null);

          // Calculos
        switch (opcao) {
            case "Adição (+)":
                resultado = n1 + n2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);                

                break;
            case "Subtração (-)":
                resultado = n1 - n2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

                break;
            case "Multiplicação (*)":
                resultado = n1 * n2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

                break;
            case "Divisão (/)":
                resultado = n1 / n2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);

                break;
            default:
                JOptionPane.showMessageDialog(null, "Erro. Operador Inválido...");
                
        }
    }
}
