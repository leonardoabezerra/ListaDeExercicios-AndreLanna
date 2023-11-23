import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2ConversorDeUnidadeDeTemperatura {

      // Declaração de funções
      // Função para conversão de celsius para fahrenheit
    public static float celsius_fahrenheit(float celsius) {

        float resultado_fahrenheit;

        resultado_fahrenheit = (float) (celsius * 1.8) + 32;
        return resultado_fahrenheit;
    }

      // Função para conversão de fahrenheit para celsius
    public static float fahrenheit_celsius(float fahrenheit) {

        float resultado_celsius;

        resultado_celsius = (fahrenheit - 32) / (float) 1.8;
        return resultado_celsius;
    }


      // Função principal do código
    public static void main(String[] args) {

          // Declaração de variáveis
        DecimalFormat df = new DecimalFormat("#.#");
        String celsius_format, fahrenheit_format;

        Scanner sc = new Scanner(System.in);

        float celsius, fahrenheit;
        int opcao, flag = 0;

        while (flag == 0) {

            System.out.println("Escolha o tipo de conversão:\n1. Celsius para Fahrenheit\n2. Fahrenheit para Celsius");
            System.out.print("Opção: ");

            String stropcao = sc.nextLine();
            opcao = Integer.parseInt(stropcao);

        
            switch (opcao) {
                case 1:
                    System.out.print("\nDigite a temperatura em graus Celsius: ");
                    String strcelsius = sc.nextLine();
                    celsius = Float.parseFloat(strcelsius);
                
                    fahrenheit_format = df.format(celsius_fahrenheit(celsius));

                    System.out.println("Resultado em graus Fahrenheit: " + fahrenheit_format);
                    flag++;
                    break;

                case 2:
                    System.out.print("\nDigite a temperatura em graus Fahrenheit: ");
                    String strfahrenheit = sc.nextLine();
                    fahrenheit = Float.parseFloat(strfahrenheit);

                    celsius_format = df.format(fahrenheit_celsius(fahrenheit));

                    System.out.println("Resultado em graus Celsius: " + celsius_format);
                    flag++;
                    break;

                default:
                    System.out.println("\nOpção Inválida...");
            }
        }

        sc.close();  // Liberar memória

    }

}
