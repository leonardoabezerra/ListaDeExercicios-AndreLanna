import javax.swing.JOptionPane;

public class Exercicio5ConversorDeIdades {
    
    public static void main(String[] args) {

          // Declaração de variáveis
        float idade, dias, meses, horas, minutos;

          // Obtenção de dados
        String stridade = JOptionPane.showInputDialog("Insira sua idade em anos");
        idade = Float.parseFloat(stridade);
        
          // Converter para dias
        dias = idade * 365;
          // Converter para meses
        meses = dias / 30;
          // Converter para horas
        horas = dias * 24;
          // Converter para minutos
        minutos = horas * 60;

        JOptionPane.showMessageDialog(null, idade + " anos são equivalentes a:\n" +
                                                        meses + " meses\n" +
                                                        dias + " dias\n" +
                                                        horas + " horas\n" +
                                                        minutos + " minutos\n");


    }


}
