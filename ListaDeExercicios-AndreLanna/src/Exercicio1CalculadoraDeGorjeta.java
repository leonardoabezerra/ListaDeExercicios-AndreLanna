import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercicio1CalculadoraDeGorjeta {
    
    public static void main(String[] args) {

          // Declaração de variáveis
        DecimalFormat df = new DecimalFormat("#.##");
        String valor_gorjeta_format, total_pago_format;

        double valor_total, porcentagem_gorjeta, valor_gorjeta, total_pago;

          // Obtenção de valores
        String strvalor_total =JOptionPane.showInputDialog("Digite o valor total da conta");
        valor_total = Double.parseDouble(strvalor_total);

        String strporcentagem_gorjeta = JOptionPane.showInputDialog("Digite a porcentagem de gorjeta que deseja deixar (por exemplo, 15 para 15%)");
        porcentagem_gorjeta = Double.parseDouble(strporcentagem_gorjeta);

          // Calculo da gorjeta
        valor_gorjeta = (porcentagem_gorjeta / 100) * valor_total;
        valor_gorjeta_format = df.format(valor_gorjeta);

        total_pago = valor_total + valor_gorjeta;
        total_pago_format = df.format(total_pago);
        
          // Saida dos resultados
        JOptionPane.showMessageDialog(null, "Valor da gorjeta: " + valor_gorjeta_format + "\n" +
                                                            "Total a ser pago: " + total_pago_format);
        
        
    }


}

        