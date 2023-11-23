import javax.swing.JOptionPane;

public class Exercicio4CalculadoraDeMediaPonderada {
    
    public static void main(String[] args) {

        // Declaração de variáveis
        String strn1, strn2, strn3, strpeso1, strpeso2, strpeso3;
        float n1, n2, n3, peso1, peso2, peso3, media, somapesos;

        while(true) {

              // Obter dados das notas e pesos
            strn1 = JOptionPane.showInputDialog("Insira a primeira nota");
            strpeso1 = JOptionPane.showInputDialog("Insira o peso da primeira matéria");

            strn2 = JOptionPane.showInputDialog("Insira a segunda nota");
            strpeso2 = JOptionPane.showInputDialog("Insira o peso da segunda nota");

            strn3 = JOptionPane.showInputDialog("Insira a terceira nota");
            strpeso3 = JOptionPane.showInputDialog("Insira o peso da terceira nota");
            
              // Transformar String em Float
            peso1 = Float.parseFloat(strpeso1);
            peso2 = Float.parseFloat(strpeso2);
            peso3 = Float.parseFloat(strpeso3);
            n1 = Float.parseFloat(strn1); 
            n2 = Float.parseFloat(strn2);
            n3 = Float.parseFloat(strn3);

            if (n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10 || n3 < 0 || n3 > 10) {
                JOptionPane.showMessageDialog(null, "Insira notas válidas...");
            } else {
                break;
            }

        }

        somapesos = peso1 + peso2 + peso3;
        media = ((n1 * peso1) + (n2 * peso2) + (n3 * peso3)) / somapesos;

        JOptionPane.showMessageDialog(null, "A média ponderada das notas informadas é " + media);

    }

}
