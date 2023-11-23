package Exercicio19TrocaDeValoresEntreObjetos;

import javax.swing.JOptionPane;

public class ponto {
    
    public static float[] invertervalores(float x, float y) {
        return new float[] {y, x};

    }

    public static void main(String[] args) {

        float x, y;

        String strx = JOptionPane.showInputDialog("Digite o valor de x");
        String stry = JOptionPane.showInputDialog("Digite o valor de y");

        x = Float.parseFloat(strx);
        y = Float.parseFloat(stry);

        float[] valores = invertervalores(x, y);

        x = valores[0];
        y = valores[1];

        JOptionPane.showMessageDialog(null, "Aqui estão os valores trocados:\nx = " + x + "\ny = " + y);

    }

}
