import javax.swing.JOptionPane;

public class Exercicio18TransposicaoDeMatrizes {
    
    public static void main(String[] args) {

        String resultado = new String();
        resultado = "";
        int linhas, colunas;

        String strlinhas = JOptionPane.showInputDialog("Digite o número de linhas da matriz");
        linhas = Integer.parseInt(strlinhas);

        String strcolunas = JOptionPane.showInputDialog("Digite o número de colunas da matriz");
        colunas = Integer.parseInt(strcolunas);

        int[][] matriz = new int[linhas][colunas];
        int[][] matriztrans = new int[colunas][linhas];

        for (int i = 0; i < linhas; i ++) {
            for (int j = 0; j < colunas; j++) {
                String temp = JOptionPane.showInputDialog("Digite o " + (j+1) + " elemento da " + (i+1) + " linha");
                matriz[i][j] = Integer.parseInt(temp);
            }
        }

          // Transpor matriz
        for (int i = 0; i < linhas; i++) {
            for (int j =0; j < colunas; j++) {
                matriztrans[j][i] = matriz[i][j];
            }
        }

          // Montar o resultado
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                resultado += matriztrans[i][j] + " ";
            }
            resultado += "\n";
        }

        JOptionPane.showMessageDialog(null, "A matriz transposta é:\n" + resultado);
        

    }

}
