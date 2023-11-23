import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio6CalculadoraDeIMC {
    
    public static void main(String[] args) {

          // Declaração de Variáveis
        float peso, altura, imc;
        String classificacao = new String();

        DecimalFormat df = new DecimalFormat("#.##");


          // Obtenção de dados
        String strpeso = JOptionPane.showInputDialog("Insira o seu peso em kg");
        peso = Float.parseFloat(strpeso);

        String straltura = JOptionPane.showInputDialog("Insira sua altura em metros");
        altura = Float.parseFloat(straltura);

        imc = peso / (altura * altura);
        String imc_df = df.format(imc);  // Aplicar formatação para duas casas decimais

          // Definição da classificação do IMC
        if (imc <= 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc > 18.5 && imc < 25) {
            classificacao = "Normal";
        } else if (imc >= 25) {
            classificacao = "Acima do peso";
        } else {
            JOptionPane.showMessageDialog(null, "Erro. Valor do IMC inválido...");
        }
        
          // Organizar e mostrar informações para o usuário
        String str1 = "Seu IMC é: " + imc_df + "\nClassificação de IMC: ";
        String str2 = str1 + classificacao;

        JOptionPane.showMessageDialog(null, str2);

    }


}
