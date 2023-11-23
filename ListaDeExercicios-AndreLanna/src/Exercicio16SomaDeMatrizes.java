import javax.swing.JOptionPane;

public class Exercicio16SomaDeMatrizes {
    
        public static void main(String[] args) {

            String resultado = new String();
            resultado = "";
            int linhas, colunas;

            String strlinhas = JOptionPane.showInputDialog("Digite o número de linhas");
            linhas = Integer.parseInt(strlinhas);

            String strcolunas = JOptionPane.showInputDialog("Digite o número de colunas");
            colunas = Integer.parseInt(strcolunas);

            int[][] matriz1 = new int[linhas][colunas];
            int[][] matriz2 = new int[linhas][colunas];
            int[][] matrizsoma = new int[linhas][colunas];

            JOptionPane.showMessageDialog(null, "Digite a seguir os elementos da PRIMEIRA matriz");

            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    String temp = JOptionPane.showInputDialog("Digite o " + (j+1) + " elemento da linha " + (i+1));
                    matriz1[i][j] = Integer.parseInt(temp);

                }
            }

            JOptionPane.showMessageDialog(null, "Digite a seguir os elementos da SEGUNDA matriz");

            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    String temp = JOptionPane.showInputDialog("Digite o " + (j+1) + " elemento da linha " + (i+1));
                    matriz2[i][j] = Integer.parseInt(temp);
                }
            }

              // Soma das matrizes
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    matrizsoma[i][j] = matriz1[i][j] + matriz2[i][j];
                    resultado += matrizsoma[i][j] + " ";
                }
                resultado += "\n";
            }

            JOptionPane.showMessageDialog(null, "A soma das matrizes é:\n" + resultado);



        }

}
